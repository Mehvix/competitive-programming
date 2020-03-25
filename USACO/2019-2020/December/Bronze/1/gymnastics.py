"""
ID: mehvix1
LANG: PYTHON3
TASK: gymnastics

Dec 16, 2019
"""

fin = open('gymnastics.in', 'r')
fout = open('gymnastics.out', 'w')
all, final = [], 0

trials, cows = list(map(int, fin.readline().split()))

for i in range(trials):
    index = 0
    dct = {}
    for j in list(map(int, fin.readline().split())):
        dct[j] = index
        index += 1
    all.append(dct)

print(all)

for i in range(1, cows + 1):
    for j in range(1, cows + 1):
        if i == j:
            continue
        for dct in all:
            if dct[i] > dct[j]:
                break
        else:
            final += 1

print(final)
fout.write(str(final) + "\n")
fout.close()
