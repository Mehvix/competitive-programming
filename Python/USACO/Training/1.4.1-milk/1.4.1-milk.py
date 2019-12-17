"""
ID: mehvix1
LANG: PYTHON3
TASK: milk

Dec 7, 2019
"""

fin = open('milk.in', 'r')
fout = open('milk.out', 'w')

total_cost = 0
units, farmers = list(map(int, fin.readline().split()))

print(units, farmers)

options = []

for _ in range(farmers):
    options += [list(map(int, fin.readline().split()))]

# options = sorted(options, key=lambda x: x[0])
options.sort()  # sorts by cheapest price

for location in range(farmers):
    price, amount = options[location]
    if units <= amount:
        total_cost += price * units
        print("*Buying {} for {}/ea".format(units, price))
        break  # check this works
    else:
        units -= amount
        print("Buying {} for {}/ea".format(amount, price))
        total_cost += price * amount

print(total_cost)
fout.write(str(total_cost) + '\n')
