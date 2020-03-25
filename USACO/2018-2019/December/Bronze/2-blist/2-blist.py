"""
ID: mehvix1
LANG: PYTHON3
TASK: blist

Jan 25, 2020
"""

fin = open('blist.in', 'r')
fout = open('blist.out', 'w')


lst = [0]*1000  # 1000 max time
for _ in range(int(fin.readline().strip())):
    start, end, buckets = list(map(int, fin.readline().strip().split()))
    for i in range(start, end):
        lst[i] += buckets

print(lst)
print(max(lst))
fout.write(str(max(lst)) + '\n')
fout.close()
