"""
ID: mehvix1
LANG: PYTHON3
TASK: photo

Jan 21, 2020
"""

# todo test cases 2/3

import math

fin = open('photo.in', 'r')
fout = open('photo.out', 'w')

n = int(fin.readline().strip())
order_sums = list(map(int, fin.readline().strip().split()))

possibilities = []
for i in order_sums:
    tmp = []
    for j in range(1, math.ceil(i/2)):
        tmp.append(j)
        tmp.append(i-j)
    possibilities.append(tmp)
# print(poss_list)  # [[1, 3], [1, 5, 2, 4], [1, 6, 2, 5, 3, 4], [1, 5, 2, 4]]


final = []
for i in range(len(possibilities[0])):
    tmp = [possibilities[0][i]]

    for j in range(len(order_sums)):
        first_num = tmp[len(tmp) - 1]
        tmp.append(order_sums[j] - first_num)
        # print("*", tmp)
    if list(set(tmp)) == sorted(tmp):  # dups
        final.append(tmp)

final = final[0]
# print(final)

for i in range(n):
    n = final[i]
    fout.write(str(n))
    if final.index(n) != (n-1):
        fout.write(" ")
fout.write("\n")
