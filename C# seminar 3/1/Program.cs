/*
Задача 19

Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.

14212 -> нет

12821 -> да

23432 -> да
*/

using System;

Console.Write("Введите пятизначное число: ");
string enteredString = Console.ReadLine();

//A string reversal method

string StringReversing()
{

    string reversedString = null;

    for (int i = enteredString.Length - 1; i >= 0; i--)
    {
        reversedString = reversedString + enteredString[i];
    }

    return reversedString;
}

//Checking if the original string and reversed string match

string reversedString = StringReversing();

if (enteredString == reversedString)
    Console.WriteLine($"Число {enteredString} является палиндромом");
else
    Console.WriteLine($"Число {enteredString} НЕ является палиндромом");

