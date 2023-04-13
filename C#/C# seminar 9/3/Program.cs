/* Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
m = 2, n = 3 -> A(m,n) = 9
m = 3, n = 2 -> A(m,n) = 29 */


int Ackermann(int n, int m)
{
    if (n == 0)
    {
        return m + 1;
    }
    if (m == 0)
    {
        return Ackermann(n - 1, 1);
    }
    return Ackermann(n - 1, Ackermann(n, m - 1));
}

Console.Write("Введите m и n по шаблону 'm, n': ");
string[] input = Console.ReadLine().Split(", ");

int output = Ackermann(int.Parse(input[0]), int.Parse(input[1]));

Console.WriteLine(output);