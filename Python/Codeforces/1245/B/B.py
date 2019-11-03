#!/usr/bin/env python

from __future__ import print_function
import sys
import math

DEBUG = '-d' in sys.argv


def debug(*args, **kwargs):
    if DEBUG:
        print(*args, file=sys.stderr, **kwargs)

    return None


cases = int(input().strip())
lst = []
for _ in range(cases):
    tmp = []
    for _ in range(3):
        tmp += input().strip().split(" ")
    lst += [tmp]
# print(lst)  # [['3', '1', '1', '1', 'RPS'], ['3', '3', '0', '0', 'RPS']]


for pos1 in range(cases):
    cur_lst = lst[pos1]
    n = int(cur_lst[0])
    a = [int(cur_lst[i + 1]) for i in range(3)]  # [3, 1, 1]
    s = list(cur_lst[4])
    wins = 0
    seq = []
    order = ["R", "P", "S"]

    opponent = []
    for i in range(n):
        j = s[i]
        if j == "R":
            opponent.append(1)  # countered by paper
        elif j == "P":
            opponent.append(2)  # countered by scissors
        else:  # S
            opponent.append(0)  # countered by rock
    # print(n, a, opponent)

    for j in range(n):
        s = opponent[j]
        # print(s, a)
        if a[s] > 0:
            a[s] -= 1
            wins += 1
            seq += order[s]
        else:
            seq += "*"

    # print(wins, seq, a)
    if wins * 2 < n:
        print("NO")
    else:
        # print(order)

        indices = [i for i, x in enumerate(seq) if x == "*"]
        for i in indices:
            seq[i] = order.pop(0)
        """
        for i in range(n):
            if seq[i] == "*":
                seq[i] = order.pop(0)
        """
        print("YES\n{}".format("".join(seq)))

