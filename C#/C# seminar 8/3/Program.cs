/* Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
Например, даны 2 матрицы:
2 4 | 3 4
3 2 | 3 3
Результирующая матрица будет:
18 20
15 18 */


Console.WriteLine("Введите размер первой матрицы через x по шаблону: 'YxX'");
Console.WriteLine("Пример: 4x4");
string[] input = Console.ReadLine().Split("x");

int[,] firstArray = FillArray(int.Parse(input[0]), int.Parse(input[1]));

Console.WriteLine("Введите размер второй матрицы через x по шаблону: 'YxX'");
Console.WriteLine("Пример: 4x4");
string[] input2 = Console.ReadLine().Split("x");

int[,] secondArray = FillArray2(int.Parse(input2[0]), int.Parse(input2[1]));

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
int[,] FillArray2(int i, int j)
{
    Random rnd = new Random();
    int[,] tempArray = new int[int.Parse(input2[0]), int.Parse(input2[1])];
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

Console.WriteLine();
Console.WriteLine("Заданы матрицы:");
PrintArray(firstArray);
Console.WriteLine();
PrintArray(secondArray);

int[,] MultiplyMatrices(int[,] matrix1, int[,] matrix2)
{
    int sum = 0;
    int[,] multipliedMatrix = new int[matrix1.GetLength(0), matrix2.GetLength(1)];
    for (int i = 0; i < matrix1.GetLength(0); i++)
    {
        for (int j = 0; j < matrix2.GetLength(1); j++)
        {
            sum = 0;
            for (int k = 0; k < matrix2.GetLength(0); k++)
            {
                sum += matrix1[i, k] * matrix2[k, j];
            }
            multipliedMatrix[i, j] = sum;
        }
    }
    return multipliedMatrix;
}

Console.WriteLine();

if (firstArray.GetLength(1) == secondArray.GetLength(0))
{
    int[,] multipliedMatrix = MultiplyMatrices(firstArray, secondArray);
    Console.WriteLine();
    PrintArray(multipliedMatrix);
}
else
{
    Console.WriteLine("Произведение невозможно");
}