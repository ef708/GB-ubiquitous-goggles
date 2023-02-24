/* Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3. */

Console.WriteLine("Введите размер массива через x по шаблону: 'YxX'");
Console.WriteLine("Пример: 3x4");
string[] input = Console.ReadLine().Split("x");

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

Console.WriteLine();

double MeanOfColumn(int columnNumber)
{
    int sum = 0;
    for (int i = 0; i < FilledArray.GetLength(0); i++)
    {
        sum += FilledArray[i, columnNumber];
    }
    double mean = Convert.ToDouble(sum) / Convert.ToDouble(FilledArray.GetLength(0));
    mean = Math.Round(mean, 1);
    return mean;
}

for (int j = 0; j < FilledArray.GetLength(1); j++)
{
    Console.Write($"{MeanOfColumn(j)}; ");
}
