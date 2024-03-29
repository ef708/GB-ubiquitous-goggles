""" Задача 6: Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и получали билет с номером. 
Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех. 
Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. Вам требуется написать программу, которая проверяет счастливость билета.

*Пример:*

385916 -> yes
123456 -> no """


print("Введите шестизначный номер: ")
number = input()

if (len(number) == 6):
    numberInt = [int(a) for a in list(number)]
    firstSum = 0
    secondSum = 0
    for i in range(0, 3):
        firstSum += numberInt[i]
    for j in range(3, 6):
        secondSum += numberInt[j]

    if firstSum == secondSum:
        print("yes")
    else:
        print("no")
else:
    print("Неверный ввод")
