"""
ID: mehvix1
LANG: PYTHON3
TASK: combo

Jan 03, 2020
"""

fin = open('combo.in', 'r')
fout = open('combo.out', 'w')

cap = int(fin.readline().strip())
pass1 = list(map(int, fin.readline().split(" ")))
pass2 = list(map(int, fin.readline().split(" ")))
passes = [pass1, pass2]
final = set()


def check_num(i: int):
    if i <= 0:
        return check_num(cap + i)
    if i > cap:
        return check_num(i - cap)
    else:
        return i


tolerance = [-2, -1, 0, 1, 2]
for cur_pass in passes:  # pass1 / pass2
    print(cur_pass)
    for tol1 in tolerance:  # tolerance
        num0 = int(cur_pass[0])
        num0 += tol1
        num0 = check_num(num0)
        for tol2 in tolerance:  # tolerance
                num1 = int(cur_pass[1])
                num1 += tol2
                num1 = check_num(num1)
                for tol3 in tolerance:  # tolerance
                    num2 = int(cur_pass[2])
                    num2 += tol3
                    num2 = check_num(num2)
                    final.add((num0, num1, num2))
                    print(cur_pass, tol1, tol2, tol3)


print(sorted(final))
final = len(final)
print(final)
fout.write(str(final) + '\n')
fout.close()
