""" Задача 26:  Напишите программу, которая на вход принимает два числа A и B, 
и возводит число А в целую степень B с помощью рекурсии.

*Пример:*

A = 3; B = 5 -> 243 (3⁵)
    A = 2; B = 3 -> 8 
 """

A = float(input("Введите A: "))
B = float(input("Введите B: "))


def DegreeRecursively(a, b):
    if b == 0:
        return 1
    if b < 0:
        return 1 / DegreeRecursively(a, -b)
    else:
        return a * DegreeRecursively(a, b - 1)


print(DegreeRecursively(A, B))
