#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

float tri_s(float **a, int n, int *nr)
{
	int i,j;
	float max;
	max=a[0][1];
	*nr=0;
	for(i=0;i<(n-1)/2;i++)
		for(j=i+1;j<n-i-1;j++)
		{
			(*nr)++;
			if(a[i][j]>max)
				max=a[i][j];
		}

		return max;
}

void main()
{
	float **a, max,s;
	int i,j,n,nr;
	printf("\n Numarul de linii si coloane este = ");
	scanf("%d",&n);
	a=(float**)malloc(n*sizeof(float*));
		for(i=0;i<n;i++)
			a[i]=(float*)malloc(n*sizeof(float));
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			printf("a[%d][%d]=", i, j);
			scanf("%f",&a[i][j]);
		}
    printf("\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            printf(" a[%d][%d]=%.2f  ",i,j,a[i][j]);
        }
        printf("\n");
    }
	s=tri_s(a,n,&nr);
	printf("\n\n  Maximul este %f",s);
	printf("\n  Numarul de elemente este %d",nr);
	for(i=0;i<n;i++)
        free(a[i]);
    free(a);
    getch();
}
