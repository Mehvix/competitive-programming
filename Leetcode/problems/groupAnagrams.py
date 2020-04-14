from collections import defaultdict


def groupAnagrams(strs):
    """
    :type strs: List[str]
    :rtype: List[List[str]]
    """
    sort = defaultdict(list)  # only way to easily create dict of lists?
    for word in strs:
        str_sorted = "".join(sorted(word))
        sort[str_sorted].append(word)
    return list(sort.values())



print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
