"""
ID: mehvix1
LANG: PYTHON3
TASK: backforth

Jan 25, 2020
"""

fin = open('backforth.in', 'r')
fout = open('backforth.out', 'w')


def tue(barn1: int, buckets1: list, buckets2: list):
    for i in range(len(buckets1)):
        i = buckets1[i]
        newbuckets2 = buckets2[:]
        newbuckets2.append(i)
        newbuckets1 = buckets1[:]
        newbuckets1.remove(i)

        wed(barn1 - i, newbuckets1, newbuckets2)


def wed(barn1: int, buckets1: list, buckets2: list):
    for i in range(len(buckets2)):
        i = buckets2[i]
        newbuckets1 = buckets1[:]
        newbuckets1.append(i)
        newbuckets2 = buckets2[:]
        newbuckets2.remove(i)

        thr(barn1 + i, buckets1, newbuckets2)

        
def thr(barn1: int, buckets1: list, buckets2: list):
    for i in range(len(buckets1)):
        i = buckets1[i]
        newbuckets2 = buckets2[:]
        newbuckets2.append(i)
        newbuckets1 = buckets1[:]
        newbuckets1.remove(i)

        fri(barn1 - i, newbuckets1, buckets2)


def fri(barn1: int, buckets1: list, buckets2: list):
    print(barn1, buckets1, buckets2)
    for i in buckets2:
        ans.add(barn1 + i)


buckets1 = list(map(int, fin.readline().strip().split()))
buckets2 = list(map(int, fin.readline().strip().split()))

barn1 = 1000

ans = set()
ans.add(barn1)
tue(barn1, buckets1, buckets2)

print(sorted(ans))

fout.write(str(len(ans)) + '\n')
fout.close()
