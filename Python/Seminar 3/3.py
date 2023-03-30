""" *Задача 20: * В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность.
В случае с английским алфавитом очки распределяются так:
A, E, I, O, U, L, N, S, T, R – 1 очко;
D, G – 2 очка;
B, C, M, P – 3 очка;
F, H, V, W, Y – 4 очка; K – 5 очков;
J, X – 8 очков;
Q, Z – 10 очков.
А русские буквы оцениваются так:
А, В, Е, И, Н, О, Р, С, Т – 1 очко;
Д, К, Л, М, П, У – 2 очка;
Б, Г, Ё, Ь, Я – 3 очка;
Й, Ы – 4 очка;
Ж, З, Х, Ц, Ч – 5 очков;
Ш, Э, Ю – 8 очков;
Ф, Щ, Ъ – 10 очков.
Напишите программу, которая вычисляет стоимость введенного пользователем слова.
Будем считать, что на вход подается только одно слово, которое содержит либо только английские, либо только русские буквы.

*Пример:*

ноутбук
    12
 """


def CheckForNumbers(word):
    num = set('1234567890')
    return num.intersection(word) != set()

def CheckForSpaces(word):
    num = set(' ')
    return num.intersection(word) != set()

def CheckAlphabet(word):
    a = set('АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЭЮЯ')
    b = set('QWERTYUIOPASDFGHJKLZXCVBNM')
    if a.intersection(word) != set() and b.intersection(word) == set():
        output = "ru"
    elif b.intersection(word) != set() and a.intersection(word) == set():
        output = "en"
    else:
        output = "ru+en"
    return output

def CountPointsRu(word):
    result = 0
    for i in word:
        for key, value in rudict.items():
            if i.upper() in key:
                result += value
    return result

def CountPointsEn(word):
    result = 0
    for i in word:
        for key, value in endict.items():
            if i.upper() in key:
                result += value
    return result


endict = {
    'AEIOULNSTR': 1,
    'DG': 2,
    'BCMP': 3,
    'FHVWY': 4,
    'K': 5,
    'JX': 8,
    'QZ':10,
}

rudict = {'АВЕИНОРСТ': 1,
    'ДКЛМПУ': 2,
    'БГЁЬЯ': 3,
    'ЙЫ': 4,
    'ЖЗХЦЧ': 5,
    'ШЭЮ': 8,
    'ФЩЪ': 10,
}

inp = list(input("Введите слово: ").upper())

if CheckForNumbers(inp) == True:
    print("Input error: в слове не должно быть цифр")
elif CheckForSpaces(inp) == True:
    print("Input error: в слове не должно быть пробелов")
elif CheckAlphabet(inp) == "ru" or CheckAlphabet(inp) == "en":
    if CheckAlphabet(inp) == "ru":
        print(CountPointsRu(inp))
    elif CheckAlphabet(inp) == "en":
        print(CountPointsEn(inp))
elif CheckAlphabet(inp) == "ru+en":
    print("Input error: на вход подается только одно слово, которое содержит либо только английские, либо только русские буквы")
