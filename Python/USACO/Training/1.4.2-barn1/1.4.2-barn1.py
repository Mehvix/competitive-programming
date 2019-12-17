"""
ID: mehvix1
LANG: PYTHON3
TASK: barn1

Dec 9, 2019
"""

fin = open('barn1.in', 'r')
fout = open('barn1.out', 'w')


max_boards, stalls, cows = list(map(int, fin.readline().strip().split()))

stall_gaps = []
last_stall = -1
for pos in range(cows):
    cur_stall = int(fin.readline().strip())

    if pos != 0:
        if not (last_stall == cur_stall -1):
            gap = cur_stall-last_stall
            print('gap between {} / {} of {}'.format(cur_stall, last_stall, gap))
            stall_gaps.append(gap)
        else:
            print('no gap between {} / {}'.format(cur_stall, last_stall))

    last_stall = cur_stall

print(stall_gaps)
# fout.write(FINAL + '\n')
