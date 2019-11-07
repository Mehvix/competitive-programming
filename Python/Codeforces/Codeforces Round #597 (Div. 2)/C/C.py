# !/usr/bin/env python

from __future__ import print_function
import sys

DEBUG = '-d' in sys.argv


def debug(*args, **kwargs):
    if DEBUG:
        print(*args, file=sys.stderr, **kwargs)

    return None


def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n - 1) + fib(n - 2)


word = input().strip()
length = len(word)
n_var = 0
u_var = 0
for pos1 in range(length):
    if (list(word)[pos1] == "m") or (list(word)[pos1] == "w"):
        print(0)
        exit()
    try:
        if (list(word)[pos1] == "u") and (list(word)[pos1 + 1] == "u"):
            u_var += 1
            # print("u", u_var)
        if (list(word)[pos1] == "n") and (list(word)[pos1 + 1] == "n"):
            n_var += 1
            # print("n", n_var)
    except IndexError:
        pass

z = n_var + u_var
if z == 0:
    print(1)
else:
    if n_var != 0:
        n_var += 2 * (fib(n_var))
    if u_var != 0:
        u_var += 2 * fib(u_var)
    print((u_var + n_var) % 1000000007)
