"""
ID: mehvix1
LANG: PYTHON3
TASK: meetings

Mar 25, 2020
"""

# todo err 2, time 8-13

fin = open("meetings.in", "r")
fout = open("meetings.out", "w")

N, L = list(map(int, fin.readline().strip().split()))

lst = []
total_weight = 0

for i in range(N):  # weight, x-position, velocity
    x = list(map(int, fin.readline().strip().split()))
    lst.append(x)
    total_weight += x[0]

lst.sort(key=lambda x: x[1])  # sort by x-pos
# print(lst)

# find time
times_left = []
times_right = []
for i in lst:  # we can treat the cows as passing and do weights later
    w, x, v = i
    if v == -1:  # will arrive left
        times_left.append(x)
    else:  # arrive right
        times_right.append(L-x)
# print(times_left, times_right)

# merge with weights
for i in range(len(times_left)):
    times_left[i] = [times_left[i], lst[i][0]]

for i in range(len(times_right)):
    times_right[i] = [times_right[i], lst[i+len(times_left)][0]]
# print(times_left, times_right)

# combine times and sort lowest to highest
combined_times = times_left + times_right
combined_times.sort(key=lambda x: x[0])
# print(combined_times)

# find time (for real this time :)
weights_added = 0
time = 0
while weights_added <= total_weight/2:
    x = combined_times.pop()
    time = x[0]
    weights_added += x[1]

# print(weights_added, time)


# find meetings
# meetings are equal to amount of 'jumps' or half of however many skips there are
final_lst = []
for i in lst:
    w, x, v = i
    final_lst.append([w, x + time*v, v])
# print(final_lst)

meetings = 0
for i, itm in enumerate(final_lst):
    w, x, v = itm
    if v == 1:
        for j in final_lst[i:]:
            # print(itm, j)
            if j[1] < x:
                meetings += 1
                # print("+1")

# print(meetings)

final = meetings
print(final)
fout.write(str(final) + "\n")
fout.close()
