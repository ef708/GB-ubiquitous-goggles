""" Задача 14: Требуется вывести все целые степени двойки (т.е. числа вида 2k), не превосходящие числа N. """


N = int(input("Введите N: "))

counter = 1
while counter < N:
    print(counter, end=" ")
    counter *= 2
