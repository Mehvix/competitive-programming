def get(x):
    return str("1 {}".format(x))


if __name__ == '__main__':
    print(get(int(input().strip())))
