"""
ID: mehvix1
LANG: PYTHON3
TASK: shell

Feb 05, 2020
"""

fin = open('shell.in', 'r')
fout = open('shell.out', 'w')

lst = [1, 2, 3]


def swap(lst: list, i: int, j: int):
    lst[i - 1], lst[j - 1] = lst[j - 1], lst[i - 1]
    return lst


total = [0] * 3
for a in range(int(fin.readline().strip())):
    i, j, g = list(map(int, fin.readline().strip().split()))
    lst = swap(lst, i, j)

    if lst[g-1] == 1:
        total[0] += 1
    elif lst[g-1] == 2:
        total[1] += 1
    elif lst[g-1] == 3:
        total[2] += 1

    print(total, lst)

final = max(total)

print(final)
fout.write(str(final) + '\n')
fout.close()
