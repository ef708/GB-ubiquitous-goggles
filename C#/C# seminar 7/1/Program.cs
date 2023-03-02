/* Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.

m = 3, n = 4.

0,5 7 -2 -0,2

1 -3,3 8 -9,9

8 7,8 -7,1 9 */


Console.WriteLine("Введите размер массива через x по шаблону: 'MxN'");
Console.WriteLine("Пример: 3x4");
string[] input = Console.ReadLine().Split("x");

double[,] FillArray(int i, int j)
{
    Random rnd = new Random();
    double[,] tempArray = new double[int.Parse(input[0]), int.Parse(input[1])];
    for (i = 0; i < tempArray.GetLength(0); i++)
    {
        for (j = 0; j < tempArray.GetLength(1); j++)
        {
            tempArray[i, j] = rnd.NextDouble() * 10000 - 10000;
            tempArray[i, j] = Math.Round(tempArray[i, j], 2);
        }
    }
    return tempArray;
}

void PrintArray(double[,] array)
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

double[,] FilledArray = FillArray(int.Parse(input[0]), int.Parse(input[1]));

Console.WriteLine();
Console.WriteLine("Задан массив:");
PrintArray(FilledArray);

