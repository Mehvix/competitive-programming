q = int(input())
lst = ["NO"]*q
for t in range(q):
    coins1, coins2, coin1value, finvalue = list(map(int, input().split()))  # 1 2 3 4
    if finvalue > (coin1value):
        for curc2 in range(1, coins2 + 1):  # 1/2
            for curc1 in range(1, coins1 + 1):  # 1
                if finvalue == (curc1 * coin1value + curc2):  # 1 * 3 + 1/2
                    lst[t] = "YES"

print("\n".join(lst))
