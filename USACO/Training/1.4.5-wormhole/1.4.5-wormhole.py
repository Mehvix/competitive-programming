"""
ID: mehvix1
LANG: PYTHON3
TASK: wormhole

Mar 22, 2020
"""

fin = open('wormhole.in', 'r')
fout = open('wormhole.out', 'w')

n = int(fin.readline().strip())
pairs = []
given = []

for _ in range(n):
    given.append(list(map(int, fin.readline().strip().split(" "))))

print(given)


def gen_list(avaliable: list):
    while len(avaliable) >= 2:



gen_list(given)

for i in pairs:  # check if possible
    pass  # todo

# print(final)
# fout.write(str(final) + '\n')
fout.close()
