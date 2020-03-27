"""
ID: mehvix1
LANG: PYTHON3
TASK: milkvisits

Mar 26, 2020
"""

# todo times out 7-11, but solves correctly

fin = open("milkvisits.in", "r")
fout = open("milkvisits.out", "w")

N, M = list(map(int, fin.readline().strip().split()))

# find groups of same types
types = list(fin.readline().strip())
groups = []
known = [-1]*(N+1)
for _ in range(N - 1):
    start, end = list(map(int, fin.readline().strip().split(" ")))
    start_type, end_type = types[start - 1], types[end - 1]
    if start_type == end_type:
        if not groups:
            groups.append({start, end})
            known[start] = 0
            known[end] = 0
        else:
            known_start = known[start]
            known_end = known[end]
            if known_start != -1:
                groups[known_start].add(end)
                known[end] = known_start
            elif known_end != -1:
                groups[known_end].add(start)
                known[start] = known_end
            else:
                groups.append({start, end})
                known[start] = len(groups) - 1
                known[end] = len(groups) - 1
# print(types)
print(groups)
# print(known)
# find if path travels through desired 'bubble' type
final = [-1] * M
for i in range(M):  # todo optimize / fix this
    item = fin.readline().strip().split()
    start, end, preference = item
    start, end = int(start), int(end)
    # print(start, end, preference)

    if start == end:
        # print("Same bubble")
        if preference == types[start - 1]:
            final[i] = 1
        else:
            final[i] = 0
    else:
        # print(known[start], known[end])
        if known[start] == known[end]:  # start and end are same bubble
            bubble_pref = types[next(iter(groups[known[end]])) - 1]
            # print(bubble_pref)
            if preference == bubble_pref:  # match bubble pref
                final[i] = 1
                # print("Match")
                # break
            else:  # not bubble pref
                final[i] = 0
                # print("Don't Match")
                # break
        else:
            final[i] = 1
            # print("Pass through varying bubbles")


""" Too slow!
type = list(fin.readline().strip())
connections = [] * N

for i in range(N):
    # this is ugly, but you can't do connections = [[]]*N and I don't know a better way :P
    connections.append([])

# # print(type, connections)

for i in range(N - 1):
    start, end = list(map(int, fin.readline().strip().split()))
    connections[start - 1].append(end)
    connections[end - 1].append(start)  # todo does it need to be two-way?

# # print(connections)


def getPath(location, end, preference, visited_locations, visited_types):
    # # print(connections[location - 1], visited_locations, visited_types)

    if location == end:
        visited_types.add(type[location - 1])
        # # print("FOUND!")
        if preference in visited_types:
            # # print("Happy", visited_types)
            return 1
        else:
            # # print("Unhappy", visited_types)
            return 0

    if set(visited_locations).intersection(set(connections[location - 1])) == set(connections[location - 1]):
        # # print("Dead end!")
        return -1  # todo fix

    for i in connections[location - 1]:
        if i not in visited_locations:
            # # print("Going to", i)
            visited_locations.add(location)
            visited_types.add(type[location - 1])
            result = getPath(i, end, preference, visited_locations, visited_types)
            if result != -1:
                return result
        # else:
            # # print("Already been to", i)


final = [-1] * M
for i in range(M):
    item = fin.readline().strip().split()
    location, end, preference = item
    location = int(location)
    end = int(end)
    visited_locations = set()
    visited_locations.add(location)
    visited_types = set()
    visited_types.add(type[location - 1])

    # # print("---\n", i, item)
    final[i] = getPath(location, end, preference, visited_locations, visited_types)
"""
print(final)
fout.write("".join(list(map(str, final))) + "\n")
fout.close()
