/* Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.

3, 5 -> 243 (3⁵)

2, 4 -> 16 */


Console.WriteLine("Введите число (A) и степень (B) по шаблону: 'A, B'");
Console.WriteLine();
string numString = Console.ReadLine();
string[] numStringSplitted = numString.Split(", ");

int.TryParse(numStringSplitted[0], out int num);
int.TryParse(numStringSplitted[1], out int degree);

int result = 1;

for (int i = 0; i < degree; i++)
{
    result *= num;
}

Console.Write($"{num}^{degree} = {result}");