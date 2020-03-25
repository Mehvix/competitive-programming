def odd(n):
    return (3 * n) + 1


def even(n):
    return n / 2


def sequence(n):
    count = 0
    while n != 1:
        if (n % 2) == 0:
            n = even(n)
        else:
            n = odd(n)
        count += 1
    return count


high = [0, 0]  # [num , len]
for i in range(1, 1000000):
    print(i)
    n = sequence(i)
    if high[1] < n:
        high = [i, n]
        #print("New High: ", high)
print(high)