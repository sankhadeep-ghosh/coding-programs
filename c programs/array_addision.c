#include <stdio.h>
#include <stdlib.h>

#define ROWS 3
#define COLS 3

int main()
{
	int a[ROWS][COLS], b[ROWS][COLS], c[ROWS][COLS];
	int i, j;

	printf("Enter the elements of first matrix (3x3):\n");
	for(i = 0; i < ROWS; i++)
	{
		for(j = 0; j < COLS; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}

	printf("Enter the elements of second matrix (3x3):\n");
	for(i = 0; i < ROWS; i++)
	{
		for(j = 0; j < COLS; j++)
		{
			scanf("%d", &b[i][j]);
		}
	}

	// initialize the resultant matrix to all zeros
	for(i = 0; i < ROWS; i++)
	{
		for(j = 0; j < COLS; j++)
		{
			c[i][j] = 0;
		}
	}

	// add up the corresponding elements in the two matrices and store in the resultant matrix
	for(i = 0; i < ROWS; i++)
	{
		for(j = 0; j < COLS; j++)
		{
			c[i][j] = a[i][j] + b[i][j];
		}
	}

	//print the resultant matrix
	printf("The added matrix is:\n");
	for(i = 0; i < ROWS; i++)
	{
		for(j = 0; j < COLS; j++)
		{
			printf("%d ", c[i][j]);
		}
		printf("\n"); //add a newline after every row
	}

	return 0;
}
