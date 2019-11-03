import os
import sys
from time import localtime, strftime

date = strftime("%b %-d, %Y", localtime())

num = input("Number?\n")
name = input("Name?\n")
fn = num + "-" + name

x = True
in_cont = []

while x is True:
    response = input("'in' file input:\nNote: You have to return twice to finish input\n")

    if response != "":
        in_cont.append(response)
    else:
        break

os.mkdir(fn)
with open("{}/{}.py".format(fn, fn), "w") as fout:
    s = '"""\nID: mehvix1\nLANG: PYTHON3\nTASK: ' + name + '\n\n'
    s += date + '\n'
    s += '"""\n\n'

    fout.write(s)

    s = "fin = open('" + name + ".in', 'r')\n"
    fout.write(s)

    s = "fout = open('" + name + ".out', 'w')\n"

    fout.write(s)


open("{}/{}.in".format(fn, name), "w").write("\n".join(in_cont))
open("{}/{}.out".format(fn, name), "w").write("")


sys.exit()  # prevent terminal from lingering
