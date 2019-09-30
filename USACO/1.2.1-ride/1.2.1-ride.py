"""
ID: mehvix1
LANG: PYTHON3
TASK: ride

Sep 23, 2019
"""

fin = open('ride.in', 'r')
fout = open('ride.out', 'w')

alphabet = list("abcdefghijklmnopqrstuvwyxz".upper())


comet = fin.readline().strip()
name = fin.readline().strip()

comet_total = 1
name_total = 1


def check(type, output):
    for letter in list(type):
        output = output * (alphabet.index(letter) + 1)
    return output


if (check(comet, comet_total) % 47) == (check(name, name_total) % 47):
    fout.write("GO\n")
else:
    fout.write("STAY\n")
    fout.close()
