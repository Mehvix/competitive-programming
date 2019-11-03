q = int(input())
lst = []
for i in range(q):
    input().strip()
    lst += [list(map(int, input().strip().split(" ")))]
# print(lst)
for i in range(q):  # 4
    cur_list = lst[i]  # 2 10 1 20 / 3 6 / 2 3 4 99 100 / 42
    verdict = 1
    # print(cur_list)
    for j in range(len(cur_list)):  # 4 / 2 / 5 / 1
        for k in range(1, len(cur_list)):
            if verdict != 2:
                try:
                    num1, num2 = cur_list[j], cur_list[j + k]
                except IndexError:
                    break
                if abs(num1-num2) == 1:
                    verdict = 2
            else:
                break
    print(verdict)
