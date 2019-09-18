#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void CitireVector( float **v, int n)
{
    int i;
    *v=(float*)malloc(n*sizeof(float));
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]= ",i);
        scanf("%f",&(*v)[i]);
    }
}

void main()
{
    int i,n;
    float *v;
    printf("Numarul de elemente al vectorului, n=");
    scanf("%d",&n);
    CitireVector(&v,n);
    printf("\n");
    for(i=0;i<=n-1;i++)
        {
            printf("v[%d]=%.2f ",i,v[i]);
        }
    free(v);
    getch();
}
