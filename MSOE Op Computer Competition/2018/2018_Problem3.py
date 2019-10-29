import math

time = int(input("Enter minutes:"))

time_to_deg = 270 - ((time / 60 - .5) * 360)

if time_to_deg >= 360:
    time_to_deg -= 360


cos = math.cos(math.radians(abs(time_to_deg)))
sin = math.sin(math.radians(abs(time_to_deg)))

print(round(cos, 9), round(sin, 9))
