"""
ID: mehvix1
LANG: PYTHON3
TASK: beads

Sep 28, 2019
"""

fin = open('beads.in', 'r')
fout = open('beads.out', 'w')

beads = int(fin.readline().strip())
beadlist = 3*fin.readline().strip()

max = 0

for bead in range(beads, 2*beads):
    left = []
    right = []

    pos = bead - 1
    while pos > 0:
        # print(pos, beadlist, [beadlist[pos]])

        check = left + [beadlist[pos]]
        if not ("r" in check and "b" in check):
            left.append(beadlist[pos])
            pos -= 1
        else:
            break

    pos = bead
    while pos < len(beadlist) - 1:
        # print(pos, beadlist, [beadlist[pos]])

        check = right + [beadlist[pos]]
        if not ("r" in check and "b" in check):
            right += beadlist[pos]
            pos += 1
        else:
            break

    total = len(left) + len(right)

    if total >= beads:
        max = beads
    elif total > max:
        max = total

print(max)
fout.write(str(max) + "\n")
