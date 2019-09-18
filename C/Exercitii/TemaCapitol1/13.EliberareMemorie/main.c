/* 13. Scrieti un subprogram care elibereaza spatiul de memorie al unei matrice alocate dinamic. */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void EliberareMemorie( float **a, int n, int m)
{
    int i;
    for(i=0;i<=n-1;i++)
        free(a[i]);
    free(a);
}

void main()
{
    int n,m,i,j;
    float **a;
    printf("Numarul de linii, n=");
    scanf("%d",&n);
    printf("Numarul de coloane, m=");
    scanf("%d",&m);
    a=(float**)malloc(n*sizeof(float*));
    for(i=0;i<=n-1;i++)
        a[i]=(float*)malloc(m*sizeof(float));
    EliberareMemorie(a,n,m);
    getch();
}
