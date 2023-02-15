/* Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.

0, 7, 8, -2, -2 -> 2

1, -7, 567, 89, 223-> 3

вводим через один Enter (разбиваем через Split()) */

Console.WriteLine("Введите целые числа через запятую с пробелом по шаблону: 'A, B, ..., X'");
string[] numbers = Console.ReadLine().Split(", ");

int counter = 0;
foreach (var i in numbers)
{
    if (Convert.ToInt32(i) > 0)
        counter++;
}

Console.WriteLine($"Введено чисел больше 0:  {counter}");