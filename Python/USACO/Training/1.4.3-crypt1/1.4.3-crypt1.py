"""
ID: mehvix1
LANG: PYTHON3
TASK: crypt1

Jan 03, 2020
"""


fin = open('crypt1.in', 'r')
fout = open('crypt1.out', 'w')

i = int(fin.readline().strip())
possible_all_nums = sorted(list(map(int, fin.readline().strip().split())))

possible_num1, possible_num2 = set(), set()  # 3 digit, 2 digit


def check_if_valid(n):
    for i in range(len(str(n))):
        if int(str(n)[i]) not in possible_all_nums:
            return False
    return True


num1, num2 = 0, 0
for a in range(i):
    num1 = possible_all_nums[a] * 100
    for b in range(i):
        num1 += possible_all_nums[b] * 10
        num2 = possible_all_nums[b] * 10
        for c in range(i):
            possible_num1.add(num1 + possible_all_nums[c])
            possible_num2.add(num2 + possible_all_nums[c])
        num1 -= possible_all_nums[b] * 10  # this is probably not the fastest way


possible_num1 = list(possible_num1)
for a in possible_num1[:]:
    if a >= 1000:
        print(a, "too big in l1")
        possible_num1.remove(a)
    else:
        if not check_if_valid(a):
            print(a, "has bad num", a, "in l1")
            possible_num1.remove(a)
            break

possible_num2 = list(possible_num2)
for a in possible_num2[:]:
    if a >= 100:
        print(a, "too big in l2")
        possible_num2.remove(a)
    else:
        if not check_if_valid(a):
            print(a, "has bad num", a, "in l2")
            possible_num2.remove(a)
            break

# possible_num1.sort()  # TODO REMOVE THESE BEFORE FINAL
# possible_num2.sort()  # TODO REMOVE THESE BEFORE FINAL
# print(possible_num1, possible_num2)

total = 0
possible_num1 = list(possible_num1)
possible_num2 = list(possible_num2)
for a in possible_num2[:]:
    tens = int(str(a)[0])
    ones = int(str(a)[1])

    for b in possible_num1[:]:
        tens_multi = tens * b
        ones_multi = ones * b
        multi = a * b

        if len(str(multi)) == 4 and len(str(tens_multi)) == 3 and len(str(ones_multi)) == 3 and check_if_valid(tens_multi) and check_if_valid(ones_multi) and check_if_valid(multi):
            print(a, b, tens_multi, ones_multi, multi)
            total += 1

print(total)
fout.write(str(total) + '\n')
fout.close()
