#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void ProdusVectorial( float *a, float*b, int n, float **c)
{
    int i;
    *c=(float*)malloc(n*sizeof(float));
    for(i=0;i<=n-1;i++)
    {
        (*c)[i]=a[i]*b[i];
    }
}

void main()
{
    int n,m,i;
    float *a,*b,*c;
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
        printf("\n Matricea a este: \n\n");
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
        printf("\n Matricea b este: \n\n");
        for(i=0;i<=n-1;i++)
        {
            printf("b[%d]=%f",i,b[i]);
            printf("\n");
        }
        ProdusVectorial(a,b,n,&c);
        printf("\n Matricea rezultanta, c, este:\n\n");
        for(i=0;i<=n-1;i++)
        {
            printf("c[%d]=%f",i,c[i]);
            printf("\n");
        }
    }
    else
    {
        printf("Nu se poate face produsul vectorial!");
    }
    free(a);
    free(b);
    free(c);
    getch();

}
