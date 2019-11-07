user_input = int(input().strip())
if (user_input % 2 == 0) and (user_input > 0) and (user_input != 2) and (user_input <= 100):
    print("YES")

else:
    print("NO")