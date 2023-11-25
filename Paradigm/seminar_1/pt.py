""" Задача №1
Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
 """


def sort(numbers):
    flag = True
    while flag:
        flag = False
        for i in range(len(numbers) - 1):
            if numbers[i] < numbers[i + 1]:
                numbers[i], numbers[i + 1] = numbers[i + 1], numbers[i]
                flag = True
    return numbers


""" Задача №2
Написать точно такую же процедуру, но в декларативном стиле """


def sort_list_declarative(numbers):
    numbers.sort(reverse=True)
    return numbers
