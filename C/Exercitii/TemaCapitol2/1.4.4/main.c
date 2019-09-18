#include<stdio.h>
#include<conio.h>
#include<malloc.h>

void Produs( float **a, float **b, int n, int m, int p, float ***c)
{
    int i,j,k,l;
    *c=(float**) malloc(n*sizeof(float*));
    for(i=0;i<=n-1;i++)
    {
        (*c)[i]=(float*) malloc(p*sizeof(float));
    }
    for(i=0;i<=n-1;i++)
        for(j=0;j<=p-1;j++)
    {
        (*c)[i][j]=0;
        for(k=0;k<=m-1;k++)
        {
            (*c)[i][j]= (*c)[i][j]+ a[i][k]*b[k][j];
        }
    }
}

void main()
{
    int n,m,p,i,j,l,k;
    float **a,**b,**c;
    printf("Numarul de linnii din a este n=");
    scanf("%d",&n);
    printf("Numarul de coloane din a este m=");
    scanf("%d",&m);
    printf("Numarul de linii din b este l=");
    scanf("%d",&l);
    printf("Numarul de coloane din b este p=");
    scanf("%d",&p);
    if(m==l)
    {
         a=(float**) malloc(n*sizeof(float*));
         for(i=0;i<=n-1;i++)
         {
             a[i]=(float*) malloc(m*sizeof(float));
         }
         b=(float**) malloc(m*sizeof(float*));
         for(i=0;i<=m-1;i++)
         {
             b[i]=(float*) malloc(p*sizeof(float));
         }

//a
         for(i=0;i<=n-1;i++)
            for(j=0;j<=m-1;j++)
         {
             printf("a[%d][%d]=",i,j);
             scanf("%f",&a[i][j]);
         }

         for(i=0;i<=n-1;i++)
         {
             for(j=0;j<=m-1;j++)
             {
                 printf("a[%d][%d]=%.0f  ",i,j,a[i][j]);
             }
             printf("\n");
         }
         printf("\n");
//b

         for(i=0;i<=m-1;i++)
            for(j=0;j<=p-1;j++)
         {
             printf("b[%d][%d]= ",i,j);
             scanf("%f",&b[i][j]);
         }

         for(i=0;i<=m-1;i++)
         {
             for(j=0;j<=p-1;j++)
             {
                 printf("b[%d][%d]=%.0f  ",i,j,b[i][j]);
             }
             printf("\n");
         }
         printf("\n");
         Produs(a,b,n,m,p,&c);
         for(i=0;i<=n-1;i++)
         {
             for(j=0;j<=p-1;j++)
             {
                 printf("c[%d][%d]=%.0f  ",i,j,c[i][j]);
             }
             printf("\n");
         }
        for(i=0;i<=n-1;i++)
            free(a[i]);
        free(a);
        for(i=0;i<=m-1;i++)
            free(b[i]);
        free(b);
        for(i=0;i<=n-1;i++)
            free(c[i]);
        free(c);
    }
    else
    {
        printf("Nu se poate face inmultirea matricelor");
    }
    getch();
}
