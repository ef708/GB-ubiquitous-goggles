def binary_search(lst, search_item):
    low = 0
    high = len(lst) - 1
    search_res = False

    while low <= high and not search_res:
        middle = (low + high) // 2
        guess = lst[middle]
        if guess == search_item:
            search_res = True
        if guess > search_item:
            high = middle - 1
        else:
            low = middle + 1
    return search_res


list = [3, 5, 12, 9, 25, 12, 43, 2, 99, 76, 33]
value = 76
list.sort()
result = binary_search(list, value)
if result:
    print("Элемент найден")
else:
    print("Элемент не найден")
