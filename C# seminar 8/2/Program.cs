/* Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

Например, задан массив:

1 4 7 2

5 9 2 3

8 4 2 4

5 2 6 7

Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка */

int[] arraySize = { 5, 4 };
string[] input = Array.ConvertAll(arraySize, s => s.ToString());

int[,] FillArray(int i, int j)
{
    Random rnd = new Random();
    int[,] tempArray = new int[int.Parse(input[0]), int.Parse(input[1])];
    for (i = 0; i < tempArray.GetLength(0); i++)
    {
        for (j = 0; j < tempArray.GetLength(1); j++)
        {
            tempArray[i, j] = rnd.Next(0, 1000);
        }
    }
    return tempArray;
}

void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}

int[,] FilledArray = FillArray(int.Parse(input[0]), int.Parse(input[1]));

Console.WriteLine();
Console.WriteLine("Задан массив:");
PrintArray(FilledArray);


int[] rowsSum = new int[FilledArray.GetLength(0)];

for (int i = 0; i < FilledArray.GetLength(0); i++)
{   
    int counter = 0;
    for (int j = 0; j < FilledArray.GetLength(1); j++)
    {
        counter += FilledArray[i, j];
    }
    rowsSum[i] = counter;
}

Console.WriteLine();
Console.WriteLine($"{Array.IndexOf(rowsSum, rowsSum.Min())} строка");