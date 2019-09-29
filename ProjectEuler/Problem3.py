number = 600851475143
factors = []

for i in range(2, round(number ** 0.5)):
    if number % i == 0:
        factors.append(i)
top = len(factors) - 1
print("Factors:\t\t\t", factors)


def isprime(x):
    for n in range(2, x - 1):
        if x % n == 0:
            return False
    else:
        return True


prime = []
for p in factors:
    if isprime(p):
        prime.append(p)

print("Prime factors:\t", prime)
