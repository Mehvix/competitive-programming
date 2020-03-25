fin = list(input().strip())
vowels = ["a", "e", "i", "o", "u"]
for pos in range(len(fin)):
    if [s for s in fin if str(fin[pos]).lower() in s]:
        del fin[pos]
    # TODO NOT DONE

print(fin)
