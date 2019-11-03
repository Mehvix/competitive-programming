"""
ID: mehvix1
LANG: PYTHON3
TASK: friday

Sep 26, 2019
"""

fin = open('friday.in', 'r')
fout = open('friday.out', 'w')


def leapyear(y):
    if y % 4 == 0 and (y % 100 != 0 or y % 400 == 0):
        return True
    return False


years = int(fin.readline().strip())
months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
months = [months[(i - 1) % len(months)] for i, x in enumerate(months)]
result = 7 * [0]  # Saturday, Sunday, Monday, Tuesday, ..., Friday
day = 4  # 7 + 4 = 13

month_names = ["Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"]
day_names = ["Sat", "Sun", "Mon", "Tues", "Wed", "Thurs", "Fri"]

for year in range(1900, 1900 + years):
    for month in range(12):
        if leapyear(year) and month == 2:
            day = (day + 1) % 7
        else:
            day = (day + months[month]) % 7
        print("{}: {}'s 13th was on a {}".format(year, month_names[month], day_names[day]))

        result[day] += 1

result = list(map(str, result))
print("Actual:\t\t" + " " .join(result) + '')
print("Should be:\t36 33 34 33 35 35 34")
fout.write(" ".join(result) + "\n")