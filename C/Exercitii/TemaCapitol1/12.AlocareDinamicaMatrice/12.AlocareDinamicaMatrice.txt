/* 12. Scrieti un subprogram care aloca dinamic memorie pentru o matrice */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void AlocareDinamica( float ***a, int n, int m)
{
    int i,j;
    *a=(float**)malloc(n*sizeof(float*));
    for(i=0;i<=n-1;i++)
        (*a)[i]=(float*)malloc(m*sizeof(float));
}

void main()
{
    int n,m,i,j;
    float **a;
    printf("Numarul de linii, n=");
    scanf("%d",&n);
    printf("Numarul de coloane, m=");
    scanf("%d",&m);
    AlocareDinamica(&a,n,m);
    for(i=0;i<=n-1;i++)
        free(a[i]);
    free(a);
    getch();
}
