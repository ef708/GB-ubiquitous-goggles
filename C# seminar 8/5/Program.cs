/* Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
Например, на выходе получается вот такой массив:
01 02 03 04
12 13 14 05
11 16 15 06
10 09 08 07 */


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

int[,] array = new int[4, 4];

void SpiralFill(int[,] arr)
{
    for (int i = 1; i < 5; i++)
        arr[0, i - 1] = i;
    for (int i = 5; i < 8; i++)
        arr[i - 4, 3] = i;
    for (int i = 8; i < 11; i++)
        arr[3, 10 - i] = i;
    for (int i = 11; i < 13; i++)
        arr[13 - i, 0] = i;
    for (int i = 13; i < 15; i++)
        arr[1, i - 12] = i;
    for (int i = 15; i < 17; i++)
        arr[2, 17 - i] = i;
}

SpiralFill(array);
PrintArray(array);