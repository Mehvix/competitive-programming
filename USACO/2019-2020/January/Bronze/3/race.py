"""
ID: mehvix1
LANG: PYTHON3
TASK: race

Jan 21, 2020
"""

import math


fin = open('race.in', 'r')
fout = open('race.out', 'w')

finish_speeds = []
distance = int(fin.readline().strip().split(" ")[0])
for a in fin.readlines():
    finish_speeds.append(int(a.strip()))

for i in range(len(finish_speeds)):
    cur_finish_speed = finish_speeds[i]
    final = math.floor(math.sqrt(2 * distance))
    if final <= cur_finish_speed:  # constant
        print(final)
    else:
        final = (2 * distance) + (math.pow(cur_finish_speed, 2))
        final = math.ceil((2 * math.sqrt(final / 2)) - cur_finish_speed)
        print("*", final)
    fout.write(str(final) + "\n")
