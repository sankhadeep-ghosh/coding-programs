// This code will print the desired pattern of asterisks based on user input
// *
// * *
// * * *
// * * * *

#include<stdio.h>

int main()
{
    int i,j,n;

    //ask user for number of lines in pattern
    printf("Enter the value of n: ");
    scanf("%d",&n);

    //iterate through each line of the pattern
    for(i=0;i<n;i++)
    {
        //print the asterisks for the current line
        for(j=0;j<i+1;j++)
            printf(" *");

        //move to the next line in the console
        printf("\n");
    }

    //indicate that the program has successfully executed
    return 0;
}
