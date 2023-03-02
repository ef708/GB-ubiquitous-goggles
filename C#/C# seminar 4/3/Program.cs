/* Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.

1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]

6, 1, 33 -> [6, 1, 33] */

Console.WriteLine("Введите ряд элементов массива по шаблону: 'a, b, c...': ");
string input = Console.ReadLine();

string[] inputArray = input.Split(", ");


void PrintArray(string[] array)
{
    int arrayL = array.Length;
    int index = 0;
    Console.Write("[");
    while (index < arrayL)
    {
        Console.Write(array[index]);
        index++;
        if (index < arrayL)
        {
            Console.Write(", ");
        }
    }
    Console.Write("]");
}

PrintArray(inputArray);