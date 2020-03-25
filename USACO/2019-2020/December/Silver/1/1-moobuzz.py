"""
ID: mehvix1
LANG: PYTHON3
TASK: moobuzz

Mar 25, 2020
"""
import math

fin = open('moobuzz.in', 'r')
fout = open('moobuzz.out', 'w')

n = int(fin.readline().strip())
memo = []


def moo(num: int):
    if (num % 5 == 0) or (num % 3 == 0):
        return True  # say moo
    return False  # say num


"""
memo = []
count = 1
while len(memo) != n:
    if moo(count):
        count += 1
    else:
        memo.append(count)
        # print(memo)
        count += 1
final = memo[-1]
"""


def calc(x):
    num = math.floor((x - 1) / 8)
    return memo[x - 8 * num - 1] + 15 * num


i = 1
while len(memo) != 15:  # pattern repeats 15
    if not moo(i):
        memo.append(i)
    i += 1

# print(memo)

final = calc(n)

print(final)
fout.write(str(final) + '\n')
fout.close()
