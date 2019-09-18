
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int linii(float mat[][20],int l, int c, float v[], int n, int linii[], int *nr)
{
	int i,j,er,este;
	if(n!=c)
		er=1;
	else
	{
		er=0;
		*nr=0;
		for(i=0;i<l;i++)
		{
			este=1;
			for(j=0;j<c;j++)
				if(mat[i][j]!=v[j])
					este=0;
			if(este)
				linii[(*nr)++]=i;
		}
	}
	return er;
}

void main()
{
	float m[20][20],*v;
	int i,j,lin,col,er,n,rez[20],dim;
	printf("\n  Nuamrul de linii = ");
	scanf("%d",&lin);
	printf("\n  Numarul de coloane = ");
	scanf("%d",&col);
	printf("\n\n Numarul de elemente al vectorului = ");
	scanf("%d",&n);
	v=(float*)malloc(n*sizeof(float));
	printf("\n\n Se citeste vectorul :\n");
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	printf("\n\n Vectorul pe care l-ati ales este urmatorul:\n\n");
	for(i=0;i<n;i++)
    {
        printf("v[%d]=%.2f  ",i,v[i]);
    }
	printf("\n\n Se citeste matricea :\n");
	for(i=0;i<lin;i++)
		for(j=0;j<col;j++)
		{
			printf("m[%d][%d]=",i,j);
			scanf("%f",&m[i][j]);
		}
    printf("\n\nMatricea aleasa este urmatoarea:\n\n");
    for(i=0;i<lin;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("m[%d][%d]=%.2f  ",i,j,m[i][j]);
        }
        printf("\n");
    }
	er=linii(m,lin,col,v,n,rez,&dim);
	printf("\n");
    for(i=0;i<dim;i++)
    {
        printf(" Linia %d este identica cu vectorul !!! ", rez[i]);
        printf("\n");
    }
	printf("\n\n Numarul de elemente al vectorului este = %d\n\n",n);
	free(v);
	getch();
}
