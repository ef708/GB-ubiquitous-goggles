""" Задача 2: Найдите сумму цифр трехзначного числа.

*Пример:*

123 -> 6 (1 + 2 + 3)
100 -> 1 (1 + 0 + 0) | """


print("Введите трехзначное число: ")
num = int(input())

sum = 0
while num > 0:
    sum += num % 10
    num //= 10

print(sum)
