"""
ID: mehvix1
LANG: PYTHON3
TASK: sleepy

Feb 05, 2020
"""

fin = open('sleepy.in', 'r')
fout = open('sleepy.out', 'w')

n = int(fin.readline().strip())
lst = list(map(int, fin.readline().strip().split()))
farthest = n-1

for expected_value in range(1, n + 1):
    actual_value = lst[expected_value - 1]
    print(actual_value, "is in", expected_value)
    if actual_value < expected_value:
        value = actual_value
        print("\t*", value)
    elif actual_value > expected_value:
        value = actual_value - expected_value + 1  # todo check +1?
        print("\t**", value)

    else:
        value = 0
    if value > farthest:
        farthest = value

final = farthest
print(final)
fout.write(str(final) + '\n')
fout.close()

"""
1 3 2 4
3 2 1 4
2 1 3 4
1 2 3 4

1 2 4 3
2 4 3 1
4 3 1 2
3 1 2 4
1 2 3 4
"""
