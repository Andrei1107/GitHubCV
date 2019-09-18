/* 14.Subprogram care determina coloanele cu elemente strict crescatoare ale unei matrice alocate dinamic
   Vectorul rezultat trebuie alocat dinamic in subprogram. */

// biblioteci.

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

// subprogram.

void ColoaneCrescatoare( float **a, int n, int m, int *s,int **v)
{
    int i,j,c,k;
    *s=0;
    for(j=0;j<=m-1;j++)
    {
        c=0;
        for(i=0;i<=n-2;i++)
        {
            if(a[i][j]<a[i+1][j])
            {
                c++;
            }
        }
        if( c == (n-1) )
        {
            printf("Coloana %d este strict crescatoare\n",j);
            (*s)++;
        }
    }
    *v=(int*)malloc((*s)*sizeof(int));
    k=0;
    for(j=0;j<=m-1;j++)
    {
        c=0;
        for(i=0;i<=n-2;i++)
        {
            if(a[i][j]<a[i+1][j])
            {
                c++;
            }
        }
        if(c==(n-1))
        {
            (*v)[k]=j;
            k++;
        }
    }
}

// program principal.

void main()
{
    int i,j,n,m,s;
    float **a;
    int *v;
    printf("Numarul de linii n=");
    scanf("%d",&n);
    printf("Numarul de coloane m=");
    scanf("%d",&m);
    a=(float**)malloc(n*sizeof(float*));
    for(i=0;i<=n-1;i++)
        a[i]=(float*)malloc(m*sizeof(float));
    for(i=0;i<=n-1;i++)
            for(j=0;j<=m-1;j++)
         {
             printf("a[%d][%d]=",i,j);
             scanf("%f",&a[i][j]);
         }
    printf("\n");
    printf("Matricea aleasa este urmatoarea:\n\n");
    for(i=0;i<=n-1;i++)
    {
    for(j=0;j<=m-1;j++)
        {
                 printf("a[%d][%d]=%.2f  ",i,j,a[i][j]);
        }
        printf("\n");
     }
     printf("\n");
     ColoaneCrescatoare(a,n,m,&s,&v);
     printf("\n");
     printf("Pozitiile coloanelor strict crescatoare sunt urmatoarele:\n");
    for(i=0;i<=s-1;i++)
    {
        printf("v[%d]=%d",i,v[i]);
        printf("\n");
    }
    for(i=0;i<=n-1;i++)
        free(a[i]);
    free(a);
    free(v);
    getch();
}
