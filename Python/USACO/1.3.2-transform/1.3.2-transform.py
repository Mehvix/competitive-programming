"""
ID: mehvix1
LANG: PYTHON3
TASK: transform

Oct 3, 2019
"""

fin = open('transform.in', 'r')
fout = open('transform.out', 'w')

size = int(fin.readline().strip())
initial_pattern = [(list(fin.readline().strip())) for _ in range(size)]
final_pattern = [(list(fin.readline().strip())) for _ in range(size)]


def get_new_list(size: int):
    return [[[] for _ in range(size)] for _ in range(size)]


def one_rotation(pattern: list):  # 90 deg
    new_list = get_new_list(size)
    # print(new_list)
    # print(initial_pattern)
    new_line = -1
    new_position = -1
    for old_line in range(size - 1, -1, -1):  # reverse range
        new_line += 1
        for old_position in range(size):
            new_position += 1
            # print("Setting new {} {} equal to old {} {}".format(new_position, new_line, old_line, old_position))
            new_list[new_position][new_line] = pattern[old_line][old_position]
            # print(new_list)
        new_position = -1
    return new_list


def two_rotations(pattern: list):  # 180 deg
    return one_rotation(one_rotation(pattern))


def three_rotations(pattern: list):  # 270 deg
    return one_rotation(one_rotation(one_rotation(pattern)))


def reflection(pattern: list):
    new_list = get_new_list(size)
    new_line = 0
    new_position = 0
    for _ in range(size):
        for b in range(size):
            new_list[b][new_position] = pattern[b][::-1][new_position]

        new_position += 1
    new_line += 1
    return new_list


def combination(pattern: list):
    new_list = [[] for _ in range(3)]
    lst = reflection(pattern)

    new_list[0] = one_rotation(lst)
    new_list[1] = two_rotations(lst)
    new_list[2] = three_rotations(lst)
    return new_list


def no_change(pattern: list):
    return pattern


verdict = "7"
if one_rotation(initial_pattern) == final_pattern:
    verdict = "1"
elif two_rotations(initial_pattern) == final_pattern:
    verdict = "2"
elif three_rotations(initial_pattern) == final_pattern:
    verdict = "3"
elif reflection(initial_pattern) == final_pattern:
    verdict = "4"
elif (combination(initial_pattern)[x] for x in range(0, 2)) == final_pattern:
    verdict = "5"
elif initial_pattern == final_pattern:
    verdict = "6"

print(verdict)
fout.write(verdict + "\n")
