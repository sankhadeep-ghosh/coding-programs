#include <stdio.h>
#include <conio.h>

// Function to draw the car at the specified position
void drawCar(int carPosition) {
    printf("\n");
    for (int i = 0; i < carPosition; i++) {
        printf(" ");
    }
    printf("  _______\n");
    printf(" //      \\\n");
    printf("||  -  - ||\n");
    printf(" \\______/\n");
}

int main() {
    int carPosition = 20; // Initial position of the car
    char userInput;

    do {
        system("cls"); // Clear the console screen

        // Draw the road
        for (int i = 0; i < 40; i++) {
            printf("-");
        }

        // Draw the car
        drawCar(carPosition);

        // Draw the road
        for (int i = 0; i < 40; i++) {
            printf("-");
        }

        // Display instructions
        printf("\n\nUse 'a' to move left, 'd' to move right, and 'q' to quit.\n");

        // Get user input
        userInput = getch();

        // Update car position based on user input
        switch (userInput) {
            case 'a':
                carPosition--;
                break;
            case 'd':
                carPosition++;
                break;
            case 'q':
                printf("\nThanks for playing. Goodbye!\n");
                break;
        }

        // Limit car position to stay within the screen
        if (carPosition < 0) {
            carPosition = 0;
        } else if (carPosition > 39) {
            carPosition = 39;
        }

    } while (userInput != 'q');

    return 0;
}
