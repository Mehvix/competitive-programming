l1 = input().strip().split()
size = int(l1[0])
target = int(l1[1])

mah = list(map(int, input().strip().split()))
bas = list(map(int, input().strip().split()))

mah_total = 0
bas_total = 0
for pos1 in range(size):
    for pos2 in range(pos1 + 1, size):
        if not (mah[pos1] or mah[pos2]) > target:
            if mah[pos1] + mah[pos2] == target:
                mah_total += 1
        if not (bas[pos1] or bas[pos2]) > target:
            if bas[pos1] + bas[pos2] == target:
                bas_total += 1


# print(mah_total, bas_total)
if mah_total > bas_total:
    print("Mahmoud".upper())
elif mah_total < bas_total:
    print("Bashar".upper())
else:
    print("Draw".upper())

