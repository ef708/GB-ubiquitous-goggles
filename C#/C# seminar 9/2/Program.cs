/* Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

M = 1; N = 15 -> 120
M = 4; N = 8. -> 30 */


Console.Write($"Введите M и N по шаблону 'M, N': ");
string[] input = Console.ReadLine().Split(", ");

int FindThatSum(int min, int max)
{
    int output = min;
    int i = min + 1;
    while (i <= max)
    {
        output += i;
        i++;
    }
    return output;
}

int sum = FindThatSum(int.Parse(input[0]), int.Parse(input[1]));
Console.Write($"Сумма натуральных элементов в промежутке от {input[0]} до {input[1]}: {sum}");