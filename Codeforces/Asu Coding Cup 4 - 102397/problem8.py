count = int(input().strip())
nums = list(map(int, str(input().strip()).split(" ")))
total = count

for pos1 in range(1, 100000):
    counts = nums.count(pos1)
    if counts > 1:
        total += 2**(counts - 2)


print(total)
