import math

fin =  str(input().strip()).split(" ")
number_of_sol, sol_file_size, flash_file_size = int(fin[0]), int(fin[1]), int(fin[2])

print(math.ceil(number_of_sol / math.floor(flash_file_size/sol_file_size)))

