""" Написать игру в “Крестики-нолики”. Можете использовать
любые парадигмы, которые посчитаете наиболее
подходящими. Можете реализовать доску как угодно - как
одномерный массив или двумерный массив (массив массивов).
Можете использовать как правила, так и хардкод, на своё
усмотрение. Главное, чтобы в игру можно было поиграть через
терминал с вашего компьютера. """

import random as rnd


class Player:

    def __init__(self, letter):
        self.letter = letter


class AiPlayer(Player):

    def __init__(self, letter):
        super().__init__(letter)

    def mkMove(self, game):
        square = rnd.choice(game.available_moves())
        return square


class Gamer(Player):

    def __init__(self, letter):
        super().__init__(letter)

    def mkMove(self, game):
        valid_square = False
        while not valid_square:
            if self.letter == "O":
                player = "Компьютер"
            else:
                player = "Игрок"

            square = input(player + " ходит. Введите ход (0-8):")

            try:
                val = int(square)
                if val not in game.available_moves():
                    raise ValueError
                valid_square = True
            except ValueError:
                print("Место занято. Выберите другое")
        return val


class GameField:

    def __init__(self):
        self.board = [" " for i in range(9)]
        self.current_winner = None

    def print_board(self):
        for row in [self.board[i * 3:(i + 1) * 3] for i in range(3)]:
            print("| " + " | ".join(row) + " |")

    def print_num_board():
        number_board = [[str(i) for i in range(j * 3, (j + 1) * 3)]
                        for j in range(3)]
        for row in number_board:
            print("| " + " | ".join(row) + " |")

    def available_moves(self):
        return [i for i, spot in enumerate(self.board) if spot == " "]

    def empty_spots(self):
        return " " in self.board

    def mkMove(self, square, letter):
        if self.board[square] == " ":
            self.board[square] = letter
            if self.winner(square, letter):
                self.current_winner = letter
            return True
        return False

    def winner(self, square, letter):
        row_ind = square // 3
        row = self.board[(row_ind * 3):(row_ind * 3) + 3]
        print(row)
        if all([spot == letter for spot in row]):
            return True

        col_ind = square % 3
        col = [self.board[col_ind + i * 3] for i in range(3)]
        print(col)
        if all([spot == letter for spot in col]):
            return True

        if square % 2 == 0:
            diagonal1 = [self.board[i] for i in [0, 4, 8]]
            if all([spot == letter for spot in diagonal1]):
                return True
            diagonal2 = [self.board[i] for i in [2, 4, 6]]
            if all([spot == letter for spot in diagonal2]):
                return True
        return False


class Gameplay:

    def Gameplay(game, player_1, player_2, print_game=True):
        letter = "X"
        while game.empty_spots():

            if letter == "O":
                square = player_2.mkMove(game)
            else:
                square = player_1.mkMove(game)

            if game.mkMove(square, letter):
                if letter == "O":
                    player = "Компьютер"
                else:
                    player = "Игрок"

                if print_game:
                    print(player + f" делает ход на квадрат {square}")
                    game.print_board()
                    print("")

                if game.current_winner:
                    if print_game:
                        print(player + " побеждает")
                    return letter

                letter = "O" if letter == "X" else "X"


if __name__ == "__main__":
    print(GameField.print_num_board())
    player_1 = Gamer("X")
    player_2 = AiPlayer("O")
    game_field = GameField()
    Gameplay.Gameplay(game_field, player_1=player_1, player_2=player_2)
