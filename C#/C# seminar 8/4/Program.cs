/* Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, 
которая будет построчно выводить массив, добавляя индексы каждого элемента.
Массив размером 2 x 2 x 2
66(0,0,0) 25(0,1,0)
34(1,0,0) 41(1,1,0)
27(0,0,1) 90(0,1,1)
26(1,0,1) 55(1,1,1) */


int[,,] Fill3dArray(int x, int y, int z)
{
    int[,,] arr = new int[z, x, y];
    Random rnd = new Random();
    for (int i = 0; i < z; i++)
    {
        for (int j = 0; j < x; j++)
        {
            for (int k = 0; k < y; k++)
            {
                arr[i, j, k] = rnd.Next(10, 100);
            }
        }
    }
    return arr;
}

void Print3dArrayWithIndexes(int[,,] array)
{
    for (int z = 0; z < array.GetLength(0); z++)
    {
        for (int x = 0; x < array.GetLength(1); x++)
        {
            for (int y = 0; y < array.GetLength(2); y++)
            {
                Console.Write($"{array[z, x, y]}({z},{x},{y}) ");
            }
            Console.WriteLine();
        }
    }
}

Console.WriteLine("Введите размер массива через x по шаблону: 'XxYxZ'");
Console.WriteLine("Пример: 4x4x4");
string[] input = Console.ReadLine().Split("x");

int[,,] Array = Fill3dArray(int.Parse(input[0]), int.Parse(input[1]), int.Parse(input[2]));
Print3dArrayWithIndexes(Array);