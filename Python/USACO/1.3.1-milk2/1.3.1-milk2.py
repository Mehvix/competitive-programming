"""
ID: mehvix1
LANG: PYTHON3
TASK: milk2

Oct 1, 2019
"""

fin = open('milk2.in', 'r')
fout = open('milk2.out', 'w')

farmers = int(fin.readline().strip())
full = set()
min_val = 0
max_val = 0

for _ in range(farmers):
    start, end = [int(user_input) for user_input in fin.readline().strip().split()]

    if min_val == 0 or start < min_val:
        min_val = start
    if end > max_val:
        max_val = end

    full.update(range(start, end))  # updates set to range of start/end time for each session

converted = [int(num in full) for num in range(min_val, max_val)]  # converts to binary (0 = milking, 1 = break)
converted = ''.join([str(user_input) for user_input in converted])
max_milk = len(max(converted.split('0')))
max_break = len(max(converted.split('1')))
print(max_milk, max_break)

fout.write("{} {}\n".format(max_milk, max_break))