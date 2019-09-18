#include<stdio.h>
#include<conio.h>

void Prim( int n, int *r )
{
    int i;
    *r=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            (*r)++;
        }
    }
}
void main()
{
    int i,n,r;
    printf("\n  Numarul este  n=");
    scanf("%d",&n);
    Prim(n,&r);
    if(r!=2)
    {
        printf("\n  Numarul nu este prim ! ");
    }
    else
    {
        printf("\n  Numarul este prim ! ");
    }
    getch();
}
