// This program is used to print a heart-shaped pattern using asterisks (*).

#include <stdio.h>

int main() {
    int i, j, n;
    printf("Enter value of n: ");
    scanf("%d", &n);
    
    // Adjust starting point for upper half of heart pattern if n is even
    int start = (n % 2 == 0) ? (n / 2 - 1) : (n / 2);
    
    // Upper half of the heart pattern
    for (i = start; i <= n; i += 2) {
        // Prints spaces before the first pyramid of asterisks
        for (j = 1; j < n - i; j += 2) {
            printf(" ");
        }
        // First pyramid of asterisks
        for (j = 1; j <= i; j++) {
            printf("*");
        }
        // Spaces between the two pyramids
        for (j = 1; j < i; j++) { // Reduce width of spaces by one character
            printf(" ");
        }
        // Second pyramid of asterisks
        for (j = 1; j <= i; j++) {
            printf("*");
        }
        // Moves to the next line
        printf("\n");
    }
    
    // Lower half of the heart pattern
    for (i = n; i >= 1; i--) {
        // Prints spaces before the second pyramid of asterisks
        for (j = i; j < n; j++) {
            printf(" ");
        }
        // Second pyramid of asterisks
        for (j = 1; j <= (i * 2) - 1; j++)
        {
            printf("*");
        }
        // Moves to the next line
        printf("\n");
    }

    return 0;
}
