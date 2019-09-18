#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void ProdusScalar( float *a, float *b,float *ps,float n)
{
    int i;
    *ps=0;
    for(i=0;i<=n-1;i++)
    {
        *ps=*ps+a[i]*b[i];
    }
}

void main()
{
    int n,m,i;
    float ps,*a,*b;
    printf("Numarul de elemente din a, n=");
    scanf("%d",&n);
    printf("Numarul de elemente din b, m=");
    scanf("%d",&m);
    a=(float*)malloc(n*sizeof(float));
    b=(float*)malloc(m*sizeof(float));
    if(n==m)
    {
        printf("\n");
        for(i=0;i<=n-1;i++)
        {
            printf("a[%d]= ",i);
            scanf("%f",&a[i]);
        }
        printf("\n Matricea a este :\n");
        for(i=0;i<=n-1;i++)
        {
            printf("a[%d]=%f",i,a[i]);
            printf("\n");
        }
        printf("\n");
        for(i=0;i<=n-1;i++)
        {
            printf("b[%d]= ",i);
            scanf("%f",&b[i]);
        }
        printf("\nMatricea b este :\n");
        for(i=0;i<=n-1;i++)
        {
            printf("b[%d]=%f",i,b[i]);
            printf("\n");
        }
        printf("\n");
        ProdusScalar(a,b,&ps,n);
        printf("Produsul scalar dintre a si be este: %f",ps);
    }
    else
    {
      printf("Produsul scalar nu se poate efectua");
    }
    free(a);
    free(b);
    getch();
}
