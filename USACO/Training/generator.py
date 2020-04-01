import os
from time import localtime, strftime

date = strftime("%b %d, %Y", localtime())

num = input("Number?\n")
name = input("Name?\n")
fn = num + "-" + name

in_cont = []

while True:
    response = input("'in' file input:\nNote: You have to return twice to finish input\n")

    if response != "":
        in_cont.append(response)
    else:
        break

os.mkdir(fn)
with open("{}/{}.py".format(fn, fn), "w") as fout:
    fout.write('"""\n'
               'ID: mehvix1\n'
               'LANG: PYTHON3\n'
               'TASK: ' + name + '\n'
                                 '\n' +
               date + '\n' +
               '"""\n'
               '\n'
               'fin = open("' + name + '.in", "r")\n'
               'fout = open("' + name + '.out", "w")\n'
                                        '\n'
               '# N = int(fin.readline().strip())\n'
               'N, M = list(map(int, fin.readline().strip().split(" ")))\n'
               '# arr = [(list(map(int, fin.readline().strip().split(" ")))) for _ in range(M)]  # replace N?\n'
                                        '\n'
                                        '\n'
               '"""\n'
               'print(final)\n'
               'fout.write(str(final) + "\\n")\n'
               '"""\n'
               'fout.close()\n'
               )

open("{}/{}.in".format(fn, name), "w").write("\n".join(in_cont))
open("{}/{}.out".format(fn, name), "w").write("")
exit()
