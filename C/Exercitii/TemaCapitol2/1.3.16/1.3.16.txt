
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void sort_linie_m(float **a, int m, int n, int k)
{
	int i,j,gata;
	float t;
	gata=0;
	while(!gata)
	{
		gata=1;
		for(i=0;i<n-1;i++)
			if(a[k][i]>a[k][i+1])
				for(j=0;j<n;j++)
				{
					t=a[j][i];
					a[j][i]=a[j][i+1];
					a[j][i+1]=t;
					gata=0;
				}
	}
}

void main()
{
	float **a;
	int i,j,m,n,k;
	printf("\n  Numarul de linii = ");
	scanf("%d", &m);
	printf("\n  Numarul de coloane = ");
	scanf("%d", &n);
	a=(float**)malloc(m*sizeof(float*));
	for(i=0;i<m;i++)
		a[i]=(float*)malloc(n*sizeof(float));
    printf("\n");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
		{
			printf(" a[%d][%d]=",i,j);
			scanf("%f",&a[i][j]);
		}
    printf("\n\n Matricea pe care ati ales-o este urmatoarea:\n\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf(" a[%d][%d]=%.2f  ",i,j,a[i][j]);
        }
        printf("\n");
    }
    printf("\n\n Linia care se vrea ordonata crescator este(pozitia!): ");
    scanf("%d",&k);
	sort_linie_m(a,m,n,k);
	printf("\n\n Matricea cu linia sortata( structura coloanelor nu a fost modificata !!!) este urmatoarea: \n\n");
	for(i=0;i<m;i++)
		{
		    for(j=0;j<n;j++)
			{
			    printf(" a[%d][%d]=%.2f  ",i,j,a[i][j]);
			}
			printf("\n");
		}
    printf("\n");
    for(i=0;i<m;i++)
        free(a[i]);
    free(a);
    getch();
}
