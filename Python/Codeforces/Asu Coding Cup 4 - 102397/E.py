houses, required_gold = map(int, input().split())
amounts = list(map(int, input().split()))

if sum(amounts) < required_gold:
    print("-1")
else:
    pos = 0
    houses = houses + 1
    while houses - pos > 1:
        cur_pos = (pos + houses) // 2
        cur_gold = 0
        done = False
        for i in range(cur_pos):
            cur_gold += amounts[i]
        for i in range(cur_pos, houses):
            if cur_gold >= required_gold:
                done = True
                break
            else:
                cur_gold -= amounts[i - cur_pos]
                cur_gold += amounts[i]
        if cur_gold >= required_gold:
            done = True
        if done:
            houses = cur_pos
        else:
            pos = cur_pos
    print(pos + 1)
