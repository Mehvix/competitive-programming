"""
ID: mehvix1
LANG: PYTHON3
TASK: mixmilk

Jan 25, 2020
"""

fin = open('mixmilk.in', 'r')
fout = open('mixmilk.out', 'w')

lst = []
for a in fin.readlines():
    lst.append(list(map(int, a.strip().split())))

print(lst)

size = len(lst)
for i in range(100):
    pourer = i % size
    receiver = (i + 1) % size

    lst[receiver][1] += lst[pourer][1]  # pour all
    lst[pourer][1] = 0  # remove all
    if lst[receiver][1] > lst[receiver][0]:  # current > max
        difference = lst[receiver][1] - lst[receiver][0]
        lst[receiver][1] = lst[receiver][0]  # set cur to max
        lst[pourer][1] = difference  # add back difference to original

    print(i, lst)

for i in range(size):
    fout.write(str(lst[i][1]) + '\n')
fout.close()
