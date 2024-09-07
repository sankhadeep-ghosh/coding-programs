#include <stdio.h>
#include <math.h>
int main()
{
    int $,gravity=10;
    float u,u_km,max_height,time,range;
    printf("****Cricket ball trajectory program****\n");
    printf("\nEnter the speed of the ball delivered in kph: ");
    scanf("%f",&u_km);
    printf("\nEnter the angle at which the ball is hit: ");
    scanf("%d",&$);
    u=u_km/3.6;
    printf("\n\nThe speed of ball after converting it into mps: %f\n",u);
    max_height=(u*u*(sin($))*sin($))/(2*gravity);
    time=(u*sin($))/gravity;
    range=(u*u*(sin(2*$)))/gravity;
    printf("\nThe maximum distance traveled by the ball in meter: %f\n",range);
    printf("\nThe maximum height reached during flight of the ball in metre: %f\n",max_height);
    printf("\nThe maximum time taken during the flight in seconds: %f",time);
}
