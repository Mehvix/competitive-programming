count = 0
testnum = 0


def prime(x):
    for i in range(2, x + 1):
        if x % i == 0 and i != x and i != 1:
            return False
    else:
        return True


while count != 10001:
    testnum += 1
    if prime(testnum) is True:
        print("{}\tfound:\t{}".format(count, testnum))  # I spent ~30 minutes trying to figure out why I was getting even numbers as primes, and I realized that I had this line under "testnum += 1"
        count += 1
        testnum += 1
    else:
        testnum += 1
