""" Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных. 
Пользователь также может ввести имя или фамилию, и Вы должны реализовать функционал для изменения и удаления данных
 """


def printAll():
    with open('GB\Python\Seminar 8\phon.txt', 'r') as data:
        for i in data:
            print(i)

def search():
    name = input("Введите данные для поиска строки: ")
    with open('GB\Python\Seminar 8\phon.txt', 'r') as data:
        for line in data:
            if name in line:
                print(line)

def add():
    inp = input("Введите данные для добавления в формате 'Фамилия,Имя,номер,описание': ")
    with open('GB\Python\Seminar 8\phon.txt', 'a') as data:
        data.write(inp)
        data.close

def change():
    inp1 = input("Введите слово, которое нужно заменить: ")
    inp2 = input("Введите слово, на которое будет заменено исходное: ")

    with open ('GB\Python\Seminar 8\phon.txt', 'r') as f:
        oldData = f.read()
        newData = oldData.replace(inp1, inp2)
    with open ('GB\Python\Seminar 8\phon.txt', 'w') as f:
        f.write(newData)

def delete():
    name = input("Введите строку, которую надо удалить: ")
    with open("GB\Python\Seminar 8\phon.txt", "r") as f:
        lines = f.readlines()
    with open("GB\Python\Seminar 8\phon.txt", "w") as f:
        for line in lines:
            if line.strip("\n") != name:
                f.write(line)


commands = {'1': printAll, '2' : search, '3' : add, '4' : change, '5' : delete}

print('''Команды для работы со справочником:
        Просмотр всех записей: 1
        Поиск по справочнику: 2
        Добавление новой записи: 3
        Изменение записи: 4
        Удаление записи: 5''')

while True:
    command = input('> ')
    if command in commands:
        commands[command]()
    else:
        print('Input error: unknown command')