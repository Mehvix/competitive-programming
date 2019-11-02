import math

fin = list(map(int, input().strip().split()))
n, m, a = fin[0], fin[1], fin[2]

height = math.ceil(n / a)
width = math.ceil(m / a)

print(height * width)
