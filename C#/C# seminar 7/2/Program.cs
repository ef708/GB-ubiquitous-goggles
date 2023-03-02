/* Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
и возвращает значение этого элемента или же указание, что такого элемента нет.

Например, задан массив:

1 4 7 2

5 9 2 3

8 4 2 4

пользователь вводит индексы 10, 10 - такого элемента нет.
пользователь вводите индексы 0, 2 - выводим элеменет 7 */


int[,] array = new int[3, 4] { { 1, 4, 7, 2 }, { 5, 9, 2, 3 }, { 8, 4, 2, 4 } };

Console.WriteLine("Введите индексы по шаблону: 'x, y'");
int[] indexes = Array.ConvertAll(Console.ReadLine().Split(", "), s => int.Parse(s));

bool CheckElement(int[,] arra)
{
    if (arra.GetLength(0) >= indexes[1] & arra.GetLength(1) >= indexes[0])
        return true;
    else
        return false;
}

if (CheckElement(array) == true)
    Console.WriteLine($"{array[indexes[1], indexes[0]]}");
if (CheckElement(array) == false)
    Console.WriteLine("Такого элемента нет");

