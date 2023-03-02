/* Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
В итоге получается вот такой массив:
7 4 2 1
9 5 3 2
8 4 4 2 */


Console.WriteLine("Введите размер массива через x по шаблону: 'MxN'");
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


int[,] SortDescending(int[,] array)
{
    int[,] sortedArray = new int[array.GetLength(0), array.GetLength(1)];
    int[] sortedRow = new int[array.GetLength(1)];
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            sortedRow[j] = array[i, j];
        }
        
        void Sorting(int[] arr)
        {
            int counter;
            int tmp;
            for (int i = 0; i < arr.Length; i++)
            {
                counter = i;
                for (int j = i; j < arr.Length; j++)
                {
                    if (arr[j] > arr[counter])
                        counter = j;
                }
                tmp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = tmp;
            }
        }
        Sorting(sortedRow);

        for (int j = 0; j < array.GetLength(1); j++)
        {
            sortedArray[i, j] = sortedRow[j];
        }
    }
    return sortedArray;
}

Console.WriteLine();
PrintArray(SortDescending(FilledArray));