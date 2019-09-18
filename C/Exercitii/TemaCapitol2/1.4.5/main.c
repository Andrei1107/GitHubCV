#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int pozitii_matrice(float **mat, int lin, int col, float a, int *nr)
{
	int i,j,**poz;
	*nr=0;
	for(i=0;i<lin;i++)
		for(j=0;j<col;j++)
			if(mat[i][j]==a)
				(*nr)++;
	poz=(int**)malloc(2*sizeof(int*));
	for(i=0;i<2;i++)
		poz[i]=(int*)malloc(*nr*sizeof(int));
	*nr=0;
	for(i=0;i<lin;i++)
		for(j=0;j<col;j++)
			if(mat[i][j]==a)
			{
				poz[0][*nr]=i;
				poz[1][(*nr)++]=j;
			}
			return poz;
}

void main()
{
	float **m,val;
	int i,j,l,c,**pozitii,nr;
	printf("\n Numarul de linii = ");
	scanf("%d",&l);
	printf("\n Numarul de coloane = ");
	scanf("%d",&c);
	m=(float**)malloc(l*sizeof(float*));
	for(i=0;i<l;i++)
		m[i]=(float*)malloc(c*sizeof(float));
	for(i=0;i<l;i++)
		for(j=0;j<c;j++)
		{
            printf("m[%d][%d]=",i,j);
            scanf("%f",&m[i][j]);
		}
    printf("\n");
    for(i=0;i<l;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("m[%d][%d]=%.2f  ",i,j,m[i][j]);
        }
        printf("\n");
    }
	printf("\n\n Valoarea cautata este : ");
	scanf("%f",&val);
	pozitii=pozitii_matrice(m,l,c,val,&nr);
    for(i=0;i<l;i++)
		for(j=0;j<c;j++)
			if(m[i][j]==val)
			{
				printf("Pozitiile pe care valoarea apare sunt [%d][%d]",i,j);
				printf("\n");
			}
	printf("\n\Numarul de aparitii este = %d",nr);
	getch();
}
