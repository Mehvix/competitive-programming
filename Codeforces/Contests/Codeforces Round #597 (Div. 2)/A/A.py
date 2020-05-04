#!/usr/bin/env python

from __future__ import print_function
import sys
import math

DEBUG = '-d' in sys.argv


def debug(*args, **kwargs):
    if DEBUG:
        print(*args, file=sys.stderr, **kwargs)

    return None


t = int(input().strip())
lst = []
for pos in range(t):
    lst += [list(map(int, input().strip().split(" ")))]

# print(t, lst)

for case in range(len(lst)):
    a, b = lst[case][0], lst[case][1]
    if math.gcd(a, b) == 1:
        print("Finite")
    else:
        print("Infinite")
