/* 17. Subprogram recursiv pentru calculul produsului elementelor unui vector */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

float ProdusElemente( float *v, int n)
{
    int i;
    if(n==0)
    {
        return 1;
    }
    else
    {
        return v[n-1]*ProdusElemente(v,n-1);
    }
}

void main()
{
    int i,n;
    float *v,p;
    printf("Numarul de elemente din vector, n=");
    scanf("%d",&n);
    v=(float*)malloc(n*sizeof(float));
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]= ",i);
        scanf("%f",&v[i]);
    }
    printf("\n\n Vectorul dumneavoastra este urmatorul:\n\n");
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]=%.2f",i,v[i]);
        printf("\n");
    }
    printf("\n");
    p=ProdusElemente(v,n);
    printf("Produsul elementelor vectorului este: %f",p);
    free(v);
    getch();
}
