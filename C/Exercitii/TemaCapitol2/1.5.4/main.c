
#include<stdio.h>
#include<conio.h>

int cmmdc_r(int a, int b)
{
    int rez,r;
    r=a%b;
    if(r==0)
        rez=b;
    else
        rez=cmmdc_r(b,r);
    return rez;
}

    void main()
    {
        int n1,n2,div;
        printf("\n\n Primul numar este =");
        scanf("%d",&n1);
        printf("\n\n Al doilea numar este=");
        scanf("%d",&n2);
        div=cmmdc_r(n1,n2);
        printf("\n\n Cmmdc este %d",div);
        _getch();
    }
