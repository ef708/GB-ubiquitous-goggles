
/* Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, 
является ли этот день выходным.

6 -> да
7 -> да
1 -> нет
*/

using System;


int[] DaysOff = {6, 7};

Console.Write("Введите цифру дня недели: ");
int EnteredNumber = Convert.ToInt32(Console.ReadLine());

if (EnteredNumber == DaysOff[0] | EnteredNumber == DaysOff[1])
	{
		Console.WriteLine("Это выходной день");
	}
else 
	{
        Console.WriteLine("Это рабочий день");
	}
