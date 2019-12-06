/* Subprogram care genereaza un vector cu reprezentarea liniarizata lexicografica a unei matrice.
   Vectorul trebuie alocat dinamic in subprogram. */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void VectorMatrice(float **a, int n, int m,float **v,int *k)
{
    int i,j;
    *v=(float*)malloc(n*m*sizeof(float));
    *k=0;
    for(i=0;i<=n-1;i++)
        for(j=0;j<=m-1;j++)
    {
        (*v)[*k]=a[i][j];
        (*k)++;
    }
}

void main()
{
    int n,m,i,j,k;
    float **a,*v;
    printf("Numarul de linii, n=");
    scanf("%d",&n);
    printf("Numarul de coloane, m=");
    scanf("%d",&m);
    a=(float**)malloc(n*sizeof(float*));
    for(i=0;i<=n-1;i++)
        a[i]=(float*)malloc(m*sizeof(float));
    for(i=0;i<=n-1;i++)
        for(j=0;j<=m-1;j++)
    {
        printf("a[%d][%d]= ",i,j);
        scanf("%f",&a[i][j]);
    }
    printf("\n\n Matricea pe care ati ales-o este urmatoarea:\n\n");
    for(i=0;i<=n-1;i++)
    {
        for(j=0;j<=m-1;j++)
        {
            printf("a[%d][%d]=%.2f  ",i,j,a[i][j]);
        }
        printf("\n");
    }
    printf("\n\n Vectorul este urmatorul: \n\n");
    VectorMatrice(a,n,m,&v,&k);
    for(i=0;i<=k-1;i++)
    {
        printf("v[%d]=%.2f  ",i,v[i]);
    }
    free(v);
    for(i=0;i<=n-1;i++)
        free(a[i]);
    free(a);
    getch();
}