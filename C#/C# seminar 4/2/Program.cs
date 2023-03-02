/* Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

452 -> 11

82 -> 10

9012 -> 12 */

Console.Write("Введите число: ");

int.TryParse(Console.ReadLine(), out int num);

int SumDigits(int number)
{
    int numberLength = Convert.ToString(number).Length;
    int ii = 0;
    int result = 0;

    for (int i = 0; i < numberLength; i++)
    {
        ii = number - number % 10;
        result += (number - ii);
        number /= 10;
    }
    return result;
}

int sum = SumDigits(num);

Console.WriteLine($"Сумма цифр числа {num} = {sum}");