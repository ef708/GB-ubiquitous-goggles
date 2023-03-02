/* Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

[3, 7, 23, 12] -> 19

[-4, -6, 89, 6] -> 0 */

int arrayLength = 6;
int[] array = new int[arrayLength];

void FillArray(int[] arr)
{
    for (int i = 0; i < arrayLength; i++)
    {
        array[i] = new Random().Next(-10000, 10000);
    }
}

int SumOfEvenElem(int[] ar)
{
    int counter = 0;
    for (int j = 0; j < arrayLength; j++)
    {
        if (j % 2 == 1)
        {
            counter += ar[j];
        }
    }
    return counter;
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

FillArray(array);
PrintArray(array);

int sum = SumOfEvenElem(array);

Console.WriteLine();
Console.WriteLine($"Сумма четных элементов: {sum}");