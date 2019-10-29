#houses, required_gold = 5, 13
#amountin = "5 1 2 3 4"
in1 = input().strip()
amountin = input()
houses, required_gold = int(in1.split(" ")[0]), int(in1.split(" ")[1])
amounts = list(map(int, amountin.strip().split(" ")))
if sum(amounts) < required_gold:
    print("-1")
    exit()

min_steps = len(amounts)
for starting_house in range(houses):
    current_gold = 0
    cur_steps = 1
    for total_next_houses in range(houses - starting_house):
        current_gold += amounts[starting_house + total_next_houses]

        if current_gold >= required_gold:
            # print(current_gold, required_gold, starting_house, total_next_houses)
            cur_steps = (starting_house + total_next_houses) - starting_house + 1
            if cur_steps < min_steps:
                # print(starting_house, total_next_houses)
                min_steps = cur_steps

        """
        if (current_gold >= required_gold) and (cur_steps < min_steps):
            min_steps = cur_steps
            # print("*", starting_house, total_next_houses, cur_steps)
        cur_steps += 1
        """
print(min_steps)
