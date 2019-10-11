import random

simulations = int(input("Enter number of simulations:"))

wins = 0
looses = 0
total_times = 0

for game in range(simulations):
    p1 = 10
    p2 = 10
    while (p1 != 0) and (p2 != 0):
        flip = random.randint(1, 2)
        if flip == 1:
            p1 += 1
            p2 -= 1
        else:
            p2 += 1
            p1 -= 1
        total_times += 1

    if p1 == 0:
        looses += 1
    else:
        wins += 1

print("Wins: {} Loses: {} Avg flips to win/loss: {}".format(wins, looses, round(total_times/simulations, 2)))
