"""
ID: mehvix1
LANG: PYTHON3
TASK: triangles

Feb 24, 2020
"""

fin = open('triangles.in', 'r')
fout = open('triangles.out', 'w')

n = int(fin.readline().strip())
points = []
for _ in range(n):
    points.append(list(map(int, fin.readline().strip().split())))

print(points)


def area(x1, y1, x2, y2, x3, y3):
    return .5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))


def valid(x1, y1, x2, y2, x3, y3):
    if ((x1 == x2 and y1 == y3) or
            (x1 == x2 and y2 == y3) or
            (y1 == y2 and x2 == x3) or
            (y1 == y3 and x2 == x3)):
        return True
    return False


high = 0
for point1 in points:
    for point2 in points[1:]:
        if point1 != point2:
            for point3 in points[2:]:
                if (point1 != point3) and (point2 != point3):
                    if valid(point1[0], point1[1], point2[0], point2[1], point3[0], point3[1]):
                        x = area(point1[0], point1[1], point2[0], point2[1], point3[0], point3[1])
                        print(point1, point2, point3, x)
                        if abs(x) > abs(high):
                            high = x

high = high * 2
print(int(high))
fout.write(str(int(high)) + '\n')
fout.close()
