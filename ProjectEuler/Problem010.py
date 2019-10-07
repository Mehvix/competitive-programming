def prime(x):
    for i in range(2, x + 1):
        if x % i == 0 and i != x and i != 1:
            return False
    else:
        return True

z = 0
for num in range(2, 2000000000):
    if prime(num):
        z += num
    
print(z)
