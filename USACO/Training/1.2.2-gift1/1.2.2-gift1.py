"""
ID: mehvix1
LANG: PYTHON3
TASK: gift1

Sep 24, 2019
"""

fin = open('gift1.in', 'r')
fout = open('gift1.out', 'w')

occurrences = int(fin.readline().strip())   # 5
full = []
people = []


for pos in range(occurrences):
    name = fin.readline().strip()
    full.append(name.split())
    full[pos].append(0)
    people.append(name)


for person_num in range(occurrences):
    giver = fin.readline().strip()  # dave
    amount_and_times = fin.readline().strip()
    amount = int(amount_and_times.split(" ")[0])  # 200
    times = int(amount_and_times.split(" ")[1])  # 3

    try:
        extra = amount % times
    except ZeroDivisionError:
        extra = 0

    try:
        split_amount = int((amount - extra) / times)
    except ZeroDivisionError:
        split_amount = 0

    full[people.index(giver)][1] -= int(amount - extra)
    print("Took {} - {} from {}".format(amount, extra, giver))

    for time in range(times):
        reciever = fin.readline().strip()  # laura
        position = people.index(reciever)

        old = full[position][1]

        full[position][1] = int(full[position][1]) + int(split_amount)
        print("Gave {} {} from {}".format(full[position][0], split_amount, giver))

    print("DONE WITH {}:\t{}".format(person_num, full))


final = ""
for time in range(len(full)):
    final += ("{} {}\n".format(full[time][0], full[time][1]))

print(final)

fout.write(final)
