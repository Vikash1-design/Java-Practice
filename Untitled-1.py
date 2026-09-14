class TicTacToe:
    def __init__(self):
        # The board is a list of 9 empty spaces representing the 3x3 grid
        self.board = [' ' for _ in range(9)]
        self.current_winner = None

    def print_board(self):
        # Print the board with physical dividers
        for row in [self.board[i * 3:(i + 1) * 3] for i in range(3)]:
            print('| ' + ' | '.join(row) + ' |')

    @staticmethod
    def print_board_nums():
        # Prints a reference board so players know which number corresponds to which square
        number_board = [[str(i) for i in range(j * 3, (j + 1) * 3)] for j in range(3)]
        for row in number_board:
            print('| ' + ' | '.join(row) + ' |')

    def available_moves(self):
        # Returns a list of indices that have not been played yet
        return [i for i, spot in enumerate(self.board) if spot == ' ']

    def has_empty_squares(self):
        return ' ' in self.board

    def make_move(self, square, letter):
        # If the chosen square is empty, assign the letter and check for a win
        if self.board[square] == ' ':
            self.board[square] = letter
            if self._check_winner(square, letter):
                self.current_winner = letter
            return True
        return False

    def _check_winner(self, square, letter):
        # 1. Check the row
        row_ind = square // 3
        row = self.board[row_ind * 3 : (row_ind + 1) * 3]
        if all([spot == letter for spot in row]):
            return True
        
        # 2. Check the column
        col_ind = square % 3
        column = [self.board[col_ind + i * 3] for i in range(3)]
        if all([spot == letter for spot in column]):
            return True

        # 3. Check the diagonals
        # Diagonals only occur on even index numbers (0, 2, 4, 6, 8)
        if square % 2 == 0:
            diagonal1 = [self.board[i] for i in [0, 4, 8]] # Top-left to bottom-right
            if all([spot == letter for spot in diagonal1]):
                return True
            diagonal2 = [self.board[i] for i in [2, 4, 6]] # Top-right to bottom-left
            if all([spot == letter for spot in diagonal2]):
                return True
                
        return False


def play():
    game = TicTacToe()
    print("Welcome to the OX Game! Here is the board layout:")
    game.print_board_nums()
    print("\nTo make a move, enter a number from 0 to 8.\n")
    
    letter = 'X' # X always starts first
    
    # Keep playing as long as the board has empty squares
    while game.has_empty_squares():
        move = None
        # Input validation loop
        while move not in game.available_moves():
            try:
                move = int(input(f"Player {letter}'s turn. Input move (0-8): "))
                if move not in game.available_moves():
                    print("Invalid move. The square is either taken or out of range. Try again.")
            except ValueError:
                print("Invalid input. Please enter a valid integer.")
        
        # Make the move and update the board
        if game.make_move(move, letter):
            print(f"\nPlayer {letter} chose square {move}")
            game.print_board()
            print('') # Empty line for spacing
            
            # Check if the last move resulted in a win
            if game.current_winner:
                print(f"🎉 Player {letter} wins! 🎉")
                return letter
            
            # Alternate turns
            letter = 'O' if letter == 'X' else 'X'
            
    print("It's a tie! Well played.")

if __name__ == '__main__':
    play()
