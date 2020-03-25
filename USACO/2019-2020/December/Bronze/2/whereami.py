"""
ID: mehvix1
LANG: PYTHON3
TASK: whereami

Dec 16, 2019
"""

fin = open('whereami.in', 'r')
fout = open('whereami.out', 'w')


count, chars = int(fin.readline().strip()), fin.readline().strip()
substr, high = "", 0
for i in range(count+1):
    if i == 0:
        substr = chars[i]
    else:
        for j in range(i, len(chars)):
            substr += chars[j]
            print(substr)
            if chars.count(substr) == 1:
                if len(substr) > high:
                    high = len(substr)
                    print("New high:", high, substr)
                substr = chars[i]
                break

print(high)
fout.write(str(high) + '\n')
fout.close()
