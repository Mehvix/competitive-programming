q = int(input())
lst = []
listToPrint = ["YES"] * q

for i in range(q):
    input().strip()
    lst += [list(map(str, input().strip()))]
    lst += [list(map(str, input().strip()))]

    for sub in range(len(lst)):
        try:
            cur_first = lst[sub]
            cur_second = lst[sub + 1]
            if set(cur_first) == set(cur_second):
                listToPrint[sub] = "NO"
        except IndexError:
            pass

print("\n".join(listToPrint))
