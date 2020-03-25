import math

time = int(input("Enter UNIX time:"))
# time = 1111111111
minute = 60
hour = minute * 60
day = hour * 24
months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
year_noleap = day * 365
year_leap = day * 366
year_four = 3*year_noleap + year_leap

total_years = 1970
total_months = 1
total_days = 1
total_hours = 12
total_hours_am_pm = "PM"
total_mins = 0


def convert(initial_time: int, unit: int):
    return math.floor(initial_time / unit), initial_time % unit


while time > year_leap:
    if (total_years % 4 == 0) or (total_years % 100 == 0):
        total_years += 1
        time -= year_leap
        print(total_years, "LEAP")
    else:
        total_years += 1
        time -= year_noleap
        print(total_years, "NO LEAP")

"""
total_years += 4*(convert(time, year_four)[0])
time = convert(time, year_four)[1]
"""

for month in range(len(months)):
    cur_momth = int(months[month])
    if (day * cur_momth) < time:
        total_months += 1
        time -= (day * cur_momth)
    else:
        break


total_days += convert(time, day)[0]
time = convert(time, day)[1]

total_hours += convert(time, hour)[0]
time = convert(time, hour)[1]

total_mins += convert(time, minute)[0]
time = convert(time, minute)[1]

for _ in range(2):
    if total_hours > 12:
        total_hours -= 12
        if total_hours_am_pm == "PM":
            total_hours_am_pm = "AM"
        else:
            total_hours_am_pm = "PM"

print("{}:{} {} {}/{}/{}".format(total_hours, total_mins, total_hours_am_pm, total_months, total_days, total_years))
