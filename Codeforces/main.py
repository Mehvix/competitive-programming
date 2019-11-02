#!/usr/bin/env python

from __future__ import print_function
import sys

DEBUG = '-d' in sys.argv


def debug(*args, **kwargs):
    if DEBUG:
        print(*args, file=sys.stderr, **kwargs)

    return None


print(0)
