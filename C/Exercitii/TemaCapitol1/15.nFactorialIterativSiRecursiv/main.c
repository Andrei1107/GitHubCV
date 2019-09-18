#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int nFactorialIterativ( int n)
{
   int i,p;
   p=1;
   for(i=1;i<=n;i++)
   {
       p=p*i;
   }
   return p;
}

int nFactorialRecursiv( int n)
{
    if(n>=1)
    {
        return n*nFactorialRecursiv(n-1);
    }
    if(n==0)
    {
        return 1;
    }
}

void main()
{
    int n,p;
    printf("Numarul dorit spre factorizare este:");
    scanf("%d",&n);
    p=nFactorialRecursiv(n); // Merge si prin cel iterativ, este testat.
    printf("Factorial din numarul dumneavoastra este:%d",p);
    getch();
}
