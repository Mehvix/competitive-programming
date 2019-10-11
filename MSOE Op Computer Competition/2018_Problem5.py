# file = input("Enter artwork filename:")
file = "2018_Problem5_Art.txt"
fin = open(file, "r")
lines = sum(1 for line in open(file, "r"))

initial_list = [(list(fin.readline().strip())) for _ in range(lines)]
final_list = []
final_list = [final_list + [] for _ in range(lines)]


for line_pos in range(lines):
    line = initial_list[line_pos]

    for char_pos in range(len(line)):
        char = str(initial_list[line_pos][char_pos])
        if char.isdigit():
            for _ in range(int(char)):
                final_list[line_pos].append((initial_list[line_pos][char_pos + 1]))
    print("".join(final_list[line_pos]))
