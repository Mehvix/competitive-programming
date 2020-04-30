fin = input().strip().split()
n, k = int(fin[0]), int(fin[1])

a = list(map(int, input().strip().split()))

total = 0
k_th = a[k - 1]

for pos in a:
    if pos and pos >= k_th:
        total += 1

print(total)
