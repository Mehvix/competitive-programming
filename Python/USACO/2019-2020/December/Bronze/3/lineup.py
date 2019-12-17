"""
ID: mehvix1
LANG: PYTHON3
TASK: linup

Dec 16, 2019
"""


def conbine(l1: list, l2: list):
    return [int(l1[1]), int(l1[0]), int(l2[1])]


fin = open('lineup.in', 'r')
fout = open('lineup.out', 'w')

names = ['Beatrice', 'Belinda', 'Bella', 'Bessie', 'Betsy', 'Blue', 'Buttercup', 'Sue']  # alphabetical
params = int(fin.readline())
lst = []
for i in range(params):
    new_param = fin.readline().split()
    lst.append(sorted([names.index(new_param[-1]), names.index(new_param[0])]))

lst = sorted(lst)
# print(lst)

data = []
prev = [8] * 2
for i in range(params):
    cur = lst[i]
    # print(cur, " -- ", prev)
    if cur[0] == prev[0]:
        del data[-1]
        data.append(conbine(cur, prev))
    else:
        data.append(cur)

    prev = cur

# print(data)
tmp = []
for n in data:
    # print(n)
    if int(n[0]) > int(n[-1]):
        n.reverse()
        # print("*", n)
    tmp.append(n)

print(tmp)


u = []

mina = 0
for a in tmp:
    for b in a:
        print(b)
        if b <= mina:
            u.append(b)
            mina += 1

        else:
            u.append(mina)
            u.append(b)
            mina += 1

print(u)

final = []
for i in data:
    final.append(names[i])

final = "\n".join(final)
print(final)

fout.write(final + '\n')
fout.close()
