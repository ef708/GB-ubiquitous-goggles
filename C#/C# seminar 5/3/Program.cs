/* Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

[3 7 22 2 78] -> 76 */


int arrayLength = 6;
double[] array = new double[arrayLength];

void PrintArray(double[] arra)
{
    Console.Write("Массив: [");
    for (int ii = 0; ii < arrayLength - 1; ii++)
    {
        Console.Write($"{array[ii]}, ");
    }
    Console.Write($"{array[arrayLength - 1]}");
    Console.Write("]");
}

void FillArray(double[] arr)
{
    for (int i = 0; i < arrayLength; i++)
    {
        array[i] = new Random().NextDouble() * 10000 - 10000;
        array[i] = Math.Round(array[i], 2);
    }
}

double GetMaxElement(double[] ar)
{
    double maxElement = -999999999999999;
    for (int a = 0; a < arrayLength; a++)
    {
        if (ar[a] > maxElement)
        {
            maxElement = ar[a];
        }
    }
    return maxElement;
}

double GetMinElement(double[] arrr)
{
    double minElement = 0;
    for (int b = 0; b < arrayLength; b++)
    {
        if (arrr[b] < minElement)
        {
            minElement = arrr[b];
        }
    }
    return minElement;
}

FillArray(array);
PrintArray(array);

double max = GetMaxElement(array);
double min = GetMinElement(array);
double difference = Math.Round(max - min, 2);

Console.WriteLine();
Console.WriteLine($"Разница между макс. и мин. элементами: {difference}");