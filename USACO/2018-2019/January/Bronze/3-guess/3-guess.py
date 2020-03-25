"""
ID: mehvix1
LANG: PYTHON3
TASK: guess

Feb 05, 2020
"""


def count(lst, item):
    count = 0
    new_lst = []
    for i in lst:
        if i == item:
            count += 1
        else:
            new_lst.append(i)

    print([new_lst, count])
    return [new_lst, count]


fin = open('guess.in', 'r')
fout = open('guess.out', 'w')

lst = []
for _ in range(int(fin.readline())):
    lst.append(fin.readline().split()[2:])

# flatten
flat = []
for i in lst:
    for j in i:
        flat.append(j)

# max occuring
max_shared = 1
while flat:
    flat, shared = count(flat, flat[0])
    if shared > max_shared:
        max_shared = shared

print(max_shared)
final = max_shared
fout.write(str(final) + '\n')
fout.close()
