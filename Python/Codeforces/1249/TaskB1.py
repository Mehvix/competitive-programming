q = int(input())
lst = []
for query in range(q):
    input().strip()
    lst += [list(map(int, input().strip().split(" ")))]

# print(lst)

for query in range(len(lst)):
    # print("Iteration ", query)
    cur_list = lst[query]  # [2, 3, 1]
    times = [1] * len(lst[query])

    for list_pos in range(len(lst[query])):  # 0, 1, 2
        original_value = cur_list[list_pos]  # 2/3/1
        value = cur_list[original_value - 1]  # 3/1/2
        while value != original_value:
            value = cur_list[value - 1]
            times[list_pos] += 1
    print(*times)
