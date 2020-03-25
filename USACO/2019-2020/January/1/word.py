"""
ID: mehvix1
LANG: PYTHON3
TASK: word

Jan 21, 2020
"""

fin = open('word.in', 'r')
fout = open('word.out', 'w')

n, k = list(map(int, fin.readline().strip().split()))
essay = fin.readline().strip().split()

final = [[]]

for word_i in essay:
    print(final)

    if len("".join(final[-1])) + len(word_i) > k:
        final.append([word_i])
    else:
        final[-1].append(word_i)

for i in final:  # todo this is bad and should be moved into the other iteration
    fout.write(" ".join(i) + "\n")
fout.close()
