// to print a patt
//      *
//     * *
//    * * *
//   * * * *

#include <stdio.h>
int main()
{
    // Declare integer variables i, j, and n.
    int i, j, n;
    // Prompt user to enter a value for n.
    printf("Enter the value of n: ");
    // Read input value from user using scanf function.
    scanf("%d", &n);
    // Use nested loops to iterate through rows and columns to print the pyramid.
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (i + j >= n - 1) // If sum of row and column index is greater than or equal to n-1,
            {
                printf(" *"); // print an asterisk (*).
            }
            else // Otherwise,
            {
                printf(" "); // print a blank space.
            }
        }
        printf("\n"); // Move to the next line after each row is printed.
    }
    return 0; // Return 0 indicating successful execution.
}
