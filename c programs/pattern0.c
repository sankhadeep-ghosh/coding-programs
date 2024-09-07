//print the pattern
//1                 1
//1 2             2 1
//1 2 3         3 2 1
//1 2 3 4     4 3 2 1
//1 2 3 4 5 5 4 3 2 1

#include <stdio.h>
int main()
{
    int i,j,n,k;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            if(j<=i)
            printf("%d ",j);
            else
            printf("  ");
        }
        for (j=n;j>=1;j--)
        {
            if(j<=i)
            printf("%d ",j);
            else
            printf("  ");
        } printf("\n");
    }
    return 0;
}