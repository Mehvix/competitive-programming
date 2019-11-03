startingpos = input().strip()
xpos, ypos = int(startingpos.split(" ")[0]), int(startingpos.split(" ")[1])

dirrections = input().strip()


for pos in range(len(dirrections)):
    if dirrections[pos] == "U": ypos += 1
    if dirrections[pos] == "D": ypos -= 1
    if dirrections[pos] == "L": xpos -= 1
    if dirrections[pos] == "R": xpos += 1

print(xpos, ypos)
