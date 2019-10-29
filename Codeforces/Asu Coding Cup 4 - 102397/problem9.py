num_of_qs = int(input().strip())
scorecard = str(input().strip())
choices = ['a', 'b', 'c', 'd', 'e']
minimum = num_of_qs
maximum = 0

for pos1 in range(len(choices)):
    verdict = scorecard.count(choices[pos1])
    if verdict > maximum:
        maximum = verdict
    elif verdict < minimum:
        minimum = verdict


print(minimum, maximum)
