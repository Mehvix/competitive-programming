def singleNumber(nums) -> int:
    arr = dict()
    for i in nums:
        if arr.get(i):
            arr[i] += 1

            if arr.get(i) == 2:
                del arr[i]
        else:
            arr[i] = 1

    for i in arr:
        if arr[i] == 1:
            return int(i)


print(singleNumber([2, 2, 1]))
