"""
ID: mehvix1
LANG: PYTHON3
TASK: palsquare

Oct 28, 2019
"""

fin = open('palsquare.in', 'r')
fout = open('palsquare.out', 'w')


def basecalc(x, base):
    digs = list("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ")
    if x < 0:
        sign = -1
    elif x == 0:
        return digs[0]
    else:
        sign = 1
    x *= sign
    digits = []

    while x:
        digits.append(digs[int(x % base)])
        x = int(x / base)

    digits.reverse()
    return ''.join(digits)


base = int(fin.readline())
for i in range(1, 301):
    num = basecalc(i ** 2, base)
    if list(reversed(num)) == list(num):
        z = "{} {}\n".format(basecalc(i, base), num)
        print(z)
        fout.write(z)
