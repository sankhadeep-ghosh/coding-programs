// This C program prints a pyramid shape of asterisks with decreasing rows.
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

#include <stdio.h>
int main()
{
    int i, j, n;
    
    // Prompt user to enter a value for n.
    printf("Enter the value of n: ");
    
    // Read input value from user using scanf function.
    scanf("%d", &n);
    // Use nested loops to iterate through rows and columns to print the pyramid
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (j >= i) // If column index is greater than or equal to row index,
            {
                printf("* "); // print an asterisk (*) followed by a space.
            }
            else // Otherwise,
            {
                printf("  "); // print two blank spaces.
            }
        }
        
        printf("\n"); // Move to the next line after each row is printed.
    }
    
    return 0; // Return 0 indicating successful execution.
}
