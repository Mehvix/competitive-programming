"""
ID: mehvix1
LANG: PYTHON3
TASK: dualpal

Nov 18, 2019
"""

fin = open('dualpal.in', 'r')
fout = open('dualpal.out', 'w')


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


iteration, num = list(map(int, fin.readline().strip().split(" ")))
x = 0
num += 1

while x != iteration:
    count = 0
    for i in range(2, 11):
        based_num = basecalc(num, i)
        if list(reversed(based_num)) == list(based_num):
            count += 1
        if count == 2:
            print(num)
            fout.write(str(num) + "\n")
            x += 1
            break
    num += 1
