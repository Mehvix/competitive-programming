from math import sqrt


def divisors(n):
    divs = {1, n}
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            divs.update((i, n // i))
    return len(divs)


n, e = 0, 1
while divisors(n) < 5:
    print(n, "doesn't work :( - ", divisors(n))
    n += e
    e += 1

print(n)
