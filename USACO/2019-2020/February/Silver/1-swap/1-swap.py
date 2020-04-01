"""
ID: mehvix1
LANG: PYTHON3
TASK: swap

Mar 29, 2020
"""

# todo times out 4,5,6,8,9,10

fin = open("swap.in", "r")
fout = open("swap.out", "w")

N, M, K = list(map(int, fin.readline().strip().split()))
moves = []
arr = []
shifted = []
loop = [-1]*N
visited = [False]*N

for _ in range(M):
    moves.append(list(map(int, fin.readline().strip().split())))

for i in range(1, N + 1):
    arr.append(i)
    shifted.append(i)


def flip(lst, start, stop):
    start -= 1
    # stop -= 1

    newlst = []
    newlst += lst[:start]  # up to start reverse
    newlst += lst[start:stop][::-1]  # what's being reversed
    newlst += lst[stop:]  # after stop reverse
    return newlst


# simulate 1 cycle
for move in moves:
    shifted = flip(shifted, move[0], move[1])

# determine loop sizes  todo fix
for pos_current in arr:
    if visited[pos_current-1] == False:
        pos_shifted = shifted[pos_current - 1]
        visited_index = []

        count = 1
        while pos_current != pos_shifted:
            new_pos = shifted[pos_shifted - 1]
            visited_index.append(new_pos)
            visited[new_pos-1] = True
            pos_shifted = new_pos
            count += 1

        for i in visited_index:
            loop[i-1] = count

        loop[pos_current - 1] = count

# print(loop)
# print(shifted)

# run limited simulation
final = list(range(N))
for i in arr:
    pos_shifted = arr[i - 1]  # technically start

    for j in range(K % loop[i-1]):  # todo fix
        # print(str(i) + ": going from", pos_shifted, "to", shifted[pos_shifted - 1])
        pos_shifted = shifted[pos_shifted - 1]


for i in final:
    # print(i)
    fout.write(str(i)+"\n")
fout.close()
