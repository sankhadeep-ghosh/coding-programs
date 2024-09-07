#include <stdio.h>
#include <stdbool.h>

// Function to draw the Tic Tac Toe board
void drawBoard(char board[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf(" %c ", board[i][j]);
            if (j < 2)
                printf("|");
        }
        printf("\n");
        if (i < 2)
            printf("---+---+---\n");
    }
}

// Function to check if the player has won
bool checkWin(char board[3][3], char player) {
    // Check rows, columns, and diagonals
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
            return true;
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
            return true;
    }
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        return true;
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        return true;

    return false;
}

// Function to check if the game is a draw
bool checkDraw(char board[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ')
                return false;
        }
    }
    return true;
}

int main() {
    char board[3][3];
    char currentPlayer = 'X';
    int row, col;

    // Initialize the board
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
        }
    }

    printf("Tic Tac Toe\n");
    printf("Player 1: X, Player 2: O\n");
    printf("Enter row and column (1-3) to make a move.\n");

    // Game loop
    while (true) {
        drawBoard(board);

        // Get player move
        do {
            printf("Player %c, enter row and column: ", currentPlayer);
            scanf("%d %d", &row, &col);
            row--; // Adjust for 0-based indexing
            col--;
        } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ');

        // Make the move
        board[row][col] = currentPlayer;

        // Check if the current player has won
        if (checkWin(board, currentPlayer)) {
            drawBoard(board);
            printf("Player %c wins!\n", currentPlayer);
            break;
        }

        // Check for a draw
        if (checkDraw(board)) {
            drawBoard(board);
            printf("It's a draw!\n");
            break;
        }

        // Switch to the other player
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    return 0;
}
