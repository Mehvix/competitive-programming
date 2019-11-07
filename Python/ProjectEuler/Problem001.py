num = 0

for user_input in range(1000):
    if (user_input % 3 == 0) or (user_input % 5 == 0):
        num += user_input

print(num)
