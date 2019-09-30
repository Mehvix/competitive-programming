highest = 0

for num1 in range(1, 999):
    for num2 in range(1, 999):
        #print("Testing {} with {}".format(num1, num2))

        test = num1 * num2
        if str(test)[::-1] == str(test) and test > highest:
            highest = test
            print("New high is {} * {}".format(num1, num2))

print(highest)
