#include<stdio.h>
#include<conio.h>

int aranjamente(int n, int k)
{
    int a;
    if(k==1)
        a=n;
    else
        a=n*aranjamente(n-1,k-1);
    return a;
}
void main()
{int nr,cite,ar;
printf(" Aranjamente de =");
scanf("%d",&nr);
printf("\n Luate cate =");
scanf("%d",&cite);
ar=aranjamente(nr,cite);
printf("\n\n Rezultatul este: %d",ar);
_getch();
}
