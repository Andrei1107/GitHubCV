
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int cmmdc(int a, int b)
{
    int r,d,i;
    d=a;
    i=b;
    do{r=d%i;
    d=i;
    i=r;
    }
    while(r!=0);
    return d;
}
void main()
{int x,y,div;
printf("  Primul numar, x este :");
scanf("%d",&x);
printf("  \n  Al doilea, numar y este :");
scanf("%d",&y);
div=cmmdc(x,y);
printf("\n\n  Cel mai mare divizor comun este : %d",div);
_getch();
}
