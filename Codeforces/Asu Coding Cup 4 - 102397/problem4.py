# houses, required_gold = 5, 12
# amountin = "1 3 4 5 2"
in1 = input().strip()
amountin = input()
houses, required_gold = int(in1.split(" ")[0]), int(in1.split(" ")[1])
amounts = list(map(int, amountin.strip().split(" ")))

if sum(amounts) < required_gold:
    print("-1")
    exit()

min_steps = 99999999999
for starting_house in range(houses):
    current_gold = 0
    cur_steps = 1
    for total_next_houses in range(houses):
        try:
            current_gold += amounts[starting_house + total_next_houses]
        except IndexError:
            pass
        # print(starting_house, total_next_houses, cur_steps)

        if (current_gold >= required_gold) and (cur_steps < min_steps):
            min_steps = cur_steps
            # print("*", starting_house, total_next_houses, cur_steps)
        cur_steps += 1

print(min_steps)
