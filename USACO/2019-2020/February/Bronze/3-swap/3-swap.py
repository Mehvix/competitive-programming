"""
ID: mehvix1
LANG: PYTHON3
TASK: swap

Feb 24, 2020
"""

fin = open('swap.in', 'r')
fout = open('swap.out', 'w')


"""
def flip(lst, start, stop):
    start -= 1
    # stop -= 1

    newlst = []
    newlst += lst[:start]  # up to start reverse
    newlst += lst[start:stop][::-1]  # what's being reversed
    newlst += lst[stop:]  # after stop reverse
    return newlst
"""

n, k = list(map(int, fin.readline().strip().split()))
a0, a1 = list(map(int, fin.readline().strip().split()))
b0, b1 = list(map(int, fin.readline().strip().split()))

lst = [None]*n
for i in range(1, n + 1):
    positions = []
    currPos = i  # this position starts at 1, not 0
    while True:
        if a0 <= currPos <= a1:
            currPos = a1 - (currPos - a0)
        if b0 <= currPos <= b1:
            currPos = b1 - (currPos - b0)
        positions.append(currPos)
        if positions.count(currPos) == 2:  # full cycle
            del positions[-1]
            lst[positions[k % len(positions) - 1] - 1] = i
            break

for i in lst:
    print(i)
    fout.write(str(i)+"\n")
fout.close()
