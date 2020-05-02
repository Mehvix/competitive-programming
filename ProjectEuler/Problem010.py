# https://en.wikipedia.org/wiki/Sieve_of_Atkin

def prime(x):
    cnt, sieve = 0, [True] * x
    for p in range(2, x):
        if sieve[p]:
            cnt += p
            for i in range(p * p, x, p):
                sieve[i] = False
    return cnt


print(prime(2000000))
