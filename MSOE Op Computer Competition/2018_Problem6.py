# file = input("Enter artwork filename:")
file = "2018_Problem6_Art.txt"
fin = open(file, "r")
lines = sum(1 for line in open(file, "r"))

initial_list = [(list(fin.readline())) for _ in range(lines)]
# print(initial_list)

for line_pos in range(lines):
    line = initial_list[line_pos]
    char_unique = -1
    final_list = []
    char_current = ""
    char_next = ""
    char_prev = ""
    final_str = ""

    for char_pos in range(len(line)):
        try:
            char_current = str(initial_list[line_pos][char_pos]).replace("\n", "<eol>")
            char_next = str(initial_list[line_pos][char_pos + 1]).replace("\n", "<eol>")
            char_prev = str(initial_list[line_pos][char_pos - 1]).replace("\n", "<eol>")

        except IndexError:
            char_next = "<eol>"
            # print("Last line")

        if char_current == char_prev and char_pos != 0:
            final_list[char_unique][0] += 1
        else:
            # print(char_current, "!=", char_prev)
            char_unique += 1
            final_list += [[1, char_current]]

    for i in range(len(final_list)):
        final_str += str(final_list[i][0])
        final_str += str(final_list[i][1])

        if (i+1 == len(final_list)) and (line_pos + 1 == lines):
            final_str += "<eol>"

    print(final_str)
    # print("Done with", line_pos)
