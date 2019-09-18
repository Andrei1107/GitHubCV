#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void CitireMatrice( float ***a, int n, int m)
{
    int i,j;
    *a=(float**)malloc(n*sizeof(float*));
    for(i=0;i<=n-1;i++)
        (*a)[i]=(float*)malloc(m*sizeof(float));
    for(i=0;i<=n-1;i++)
        for(j=0;j<=m-1;j++)
    {
        printf("a[%d][%d]= ",i,j);
        scanf("%f",&(*a)[i][j]);
    }
}

void main()
{
    int n,m,i,j;
    float **a;
    printf("Numarul de linii, n=");
    scanf("%d",&n);
    printf("Numarul de coloane, m=");
    scanf("%d",&m);
    CitireMatrice(&a,n,m);
    printf("\n");
    for(i=0;i<=n-1;i++)
    {
        for(j=0;j<=m-1;j++)
        {
            printf("a[%d][%d]=%.2f  ",i,j,a[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<=n-1;i++)
        free(a[i]);
    free(a);
    getch();
}
