a = 0
b = 1
i = 0

while b < 4000000:
    a, b = b, a + b  # fib sequence
    if b % 2 == 0:
        i += b
print(i)
