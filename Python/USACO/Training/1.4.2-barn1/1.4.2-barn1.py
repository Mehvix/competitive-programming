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
cow_list = []


for pos in range(cows):
    cow_list.append(int(fin.readline().strip()))

cow_list.sort()
print(cow_list)

for cur_stall in cow_list:
    if last_stall != -1:
        if not (last_stall == cur_stall - 1):
            gap = cur_stall - last_stall - 1
            print('gap between {} / {} of {}'.format(cur_stall, last_stall, gap))
            stall_gaps.append(gap)
    last_stall = cur_stall

stall_gaps.sort()
stall_gaps.reverse()
stall_gaps = stall_gaps[(max_boards - 1):]

FINAL = sum(stall_gaps) + cows
print(FINAL)
fout.write(str(FINAL) + '\n')
