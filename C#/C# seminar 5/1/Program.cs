/* Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. 
Напишите программу, которая покажет количество чётных чисел в массиве.

[345, 897, 568, 234] -> 2 */


//В задаче не указан размер массива, поэтому он задается через arrayLength
int arrayLength = 5;
int[] array = new int[arrayLength];

void FillArray(int[] arr)
{
    for (int i = 0; i < arrayLength; i++)
    {
        array[i] = new Random().Next(100, 999);
    }
}

void PrintArray(int[] arra)
{
    Console.Write("Массив: [");
    for (int ii = 0; ii < arrayLength - 1; ii++)
    {
        Console.Write($"{array[ii]}, ");
    }
    Console.Write($"{array[arrayLength - 1]}");
    Console.Write("]");
}

int CheckEven(int[] ar)
{
    int count = 0;
    for (int j = 0; j < arrayLength; j++)
    {
        if (ar[j] % 2 == 0)
        {
            count++;
        }
    }
    return count;
}

FillArray(array);
PrintArray(array);
int evenQuantity = CheckEven(array);

Console.WriteLine();
Console.WriteLine($"Кол-во четных чисел: {evenQuantity}");
