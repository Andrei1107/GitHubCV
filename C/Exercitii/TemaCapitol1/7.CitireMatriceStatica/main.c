/* 7. Subprogram care realizeaza citirea de la tastatura a unei matrice alocate static */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void CitireMatrice( float a[100][100], int n, int m)
{
    int i,j;
    for(i=0;i<=n-1;i++)
        for(j=0;j<=m-1;j++)
    {
        printf("a[%d][%d]= ",i,j);
        scanf("%f",&a[i][j]);
    }
}

void main()
{
    int n,m;
    float a[100][100];
    printf("Numarul de linii, n=");
    scanf("%d",&n);
    printf("Numarul de coloane, m=");
    scanf("%d",&m);
    CitireMatrice(a,n,m);
    getch();
}
