""" Задача 18: Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. 
Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

*Пример:*

5
    1 2 3 4 5
    6
    -> 5 """


def FindSimilarAndPrint():
    lesserSimilar = None
    biggerSimilar = None
    temp = None

    for i in range(0, len(A)):
        if A[i] < X:
            temp = A[i]
        else:
            lesserSimilar = temp

    temp = None
    for i in reversed(range(0, len(A))):
        if A[i] > X:
            temp = A[i]
        else:
            biggerSimilar = temp

    if biggerSimilar == None:
        print(f"Ближайшее число к {X}: {lesserSimilar}")
    elif lesserSimilar == None:
        print(f"Ближайшее число к {X}: {biggerSimilar}")
    else:
        print(f"Ближайшие числа к {X}: {lesserSimilar}, {biggerSimilar}")


A = [i for i in range(1, int(input("Введите N: "))+1)]
print(A)
X = int(input("Введите X: "))

if X < A[0]:
    print(f"Ближайшее число к {X}: {A[0]}")
elif X > A[len(A)-1]:
    print(f"Ближайшее число к {X}: {A[len(A)-1]}")
else:
    FindSimilarAndPrint()
