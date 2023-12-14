from functools import reduce as r
import math


def Pearson(array_1, array_2):
    if len(array_1) != len(array_2) or len(array_1) == 0 or len(array_2) == 0:
        return None

    srednee_x = sum(array_1) / len(array_1)
    srednee_y = sum(array_2) / len(array_2)

    r_numerator = r(
        lambda x, y: x + y,
        map(lambda x: (x[0] - srednee_x) * (x[1] - srednee_y),
            zip(array_1, array_2)))

    sum_x = r(lambda x, y: x + y,
              map(lambda x: (x - srednee_x)**2, array_1))
    sum_y = r(lambda x, y: x + y,
              map(lambda y: (y - srednee_y)**2, array_2))

    r_denominator = math.sqrt(sum_x * sum_y)
    if r_denominator == 0:
        return None
    return r_numerator / r_denominator


print(Pearson([1, 2, 3], [4, 8, 6]))
