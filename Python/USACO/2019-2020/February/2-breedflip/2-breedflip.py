"""
ID: mehvix1
LANG: PYTHON3
TASK: breedflip

Feb 24, 2020
"""

fin = open('breedflip.in', 'r')
fout = open('breedflip.out', 'w')


n = int(fin.readline().strip())

a = list(fin.readline().strip())
b = list(fin.readline().strip())

moves = 0
difference = []
for pos in range(n):
    if a[pos] != b[pos]:  # if they don't match
        difference.append(pos)

consec = []
conc = []
for i, val in enumerate(difference):
    if i == 0:
        conc.append(val)
    else:
        if val - 1 != conc[-1]:  # following
            consec.append(conc)
            conc = [val]
        else:
            conc.append(val)
if conc:
    consec.append(conc)


final = len(consec)
print(final)
fout.write(str(final) + '\n')
fout.close()
