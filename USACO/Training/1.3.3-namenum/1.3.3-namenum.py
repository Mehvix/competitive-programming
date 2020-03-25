"""
ID: mehvix1
LANG: PYTHON3
TASK: namenum

Oct 28, 2019
"""

fin = open('namenum.in', 'r')
fout = open('namenum.out', 'w')

name_as_num = fin.readline().strip()

with open('dict.txt', 'r') as file:
    dictionary = file.read().split('\n')

temp_dict = []
for item_pos in range(0, len(dictionary)):
    item = dictionary[item_pos]
    if len(item) == len(name_as_num):
        temp_dict.append(dictionary[item_pos])
dictionary = temp_dict

for pos1 in range(0, len(name_as_num)):
    cur_num = int(name_as_num[pos1])
    available_letters = []

    if cur_num == 2: available_letters = ["A", "B", "C"]
    elif cur_num == 5: available_letters = ["J", "K", "L"]
    elif cur_num == 8: available_letters = ["T", "U", "V"]
    elif cur_num == 3: available_letters = ["D", "E", "F"]
    elif cur_num == 6: available_letters = ["M", "N", "O"]
    elif cur_num == 9: available_letters = ["W", "X", "Y"]
    elif cur_num == 4: available_letters = ["G", "H", "I"]
    elif cur_num == 7: available_letters = ["P", "R", "S"]

    print(cur_num, available_letters)

    temp_dict = []
    for pos2 in range(0, len(dictionary)):
        letter = ""
        try:
            letter = dictionary[pos2][pos1]
        except IndexError:
            pass  # word is too short
        if letter.upper() in available_letters:
            temp_dict.append(dictionary[pos2])
        # else:
            # print(letter, "not in ", available_letters)
    dictionary = temp_dict
    print(dictionary)


if not dictionary:
    dictionary = ['NONE']

print(dictionary)
fout.write("\n".join(dictionary) + "\n")
