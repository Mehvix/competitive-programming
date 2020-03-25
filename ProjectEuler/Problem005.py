# Note: This takes a while to compute, you're probably better off messing around with common denominators
i = 0
while True:
    i += 1
    for n in range(1, 21):
        if i % n == 0:
            pass
        else:
            break

        if n == 20:
            print(i)
            quit()
