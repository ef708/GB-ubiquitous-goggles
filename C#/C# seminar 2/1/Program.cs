/*
Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.

456 -> 5
782 -> 8
918 -> 1
*/
using System;

int getNumber()
{
	int num = Convert.ToInt32(Console.ReadLine());
	return num;
}

int getSecondDigit(int number)
{
	while(number < 1000 && number >= 100)
	number = (number / 10) % 10;
    return number;
}


Console.Write("Введите трехначное число: ");
int number = getNumber();

Console.WriteLine($"Вторая цифра числа {number}: {getSecondDigit(number)}");