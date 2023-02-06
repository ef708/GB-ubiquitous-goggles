// Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.


using System;


string number;

Console.Write("Задайте число:	");
number = Console.ReadLine();

if (number.Length >= 3) 
    {  
        int ThirdDigit = Convert.ToInt32(number) % 10;
        Console.WriteLine($"Третья цифра числа {number}: {ThirdDigit}");
    }
else Console.WriteLine($"У числа {number} нет третьей цифры");
