
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int Combinari( int n, int k)
{
    int i,p,l;
    if( k==n || k==0 )
    {
        return 1;
    }
    if( k>n || k<0 )
    {
        return 0;
    }
    {
        return Combinari(n-1,k)+Combinari(n-1,k-1);
    }
}

void main()
{
    int n,k,i,l;
    printf("Combinari de, n= ");
    scanf("%d",&n);
    printf("Luate cate, k=");
    scanf("%d",&k);
    l=Combinari(n,k);
    printf("Valoarea combinarii este : %d",l);
    getch();
}
