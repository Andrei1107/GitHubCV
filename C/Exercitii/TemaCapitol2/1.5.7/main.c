#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int cauta(float v[], int p, int u, float k)
{
    int m;
    if(p>u)
        return -1;
    else
    {
        m =(p+u)/2;
        if(k<v[m])
            return cauta(v,p,m-1,k);
    }
    if(k>v[m])
         return cauta(v,m+1,u,k);
    else
            return m;
    }



void main()
{
    float v[100],a;
    int n,p,u,i,s,m;
    printf("  Numarul de elemente al vectorului, n=");
    scanf("%d",&n);
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]= ",i);
        scanf("%f",&v[i]);
    }
    printf("\n\n  Vectorul ales este urmatorul:\n\n");
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]=%.2f ",i,v[i]);
    }
    printf("\n\n  Valoarea cautata este: a=");
    scanf("%f",&a);
    p=0;
    u=n-1;
    s=cauta(v,p,u,a);
    printf("\n  Pozitia este : %d",s);
    getch();
}
