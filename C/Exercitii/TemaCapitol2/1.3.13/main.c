
#include<stdio.h>
#include<conio.h>

int elimina_linie(float a[][20], int *l, int c, int k)
{
	int i, j, er;
	if((k<0)||(k>=*l))
		er=1;
	else
	{
		for(i=k;i<*l;i++)
			for(j=0;j<c;j++)
				a[i][j]=a[i+1][j];
		*l=*l-1;
		er=0;
	}
	return er;
}

void main()
{
	float m[20][20];
	int i,j,l,c,k,er;
	printf("\n Numarul de linii este = ");
	scanf("%d",&l);
	printf("\n Numarul de coloane este = ");
	scanf("%d",&c);
	printf("\n");
	for(i=0;i<l;i++)
		for(j=0;j<c;j++)
		{
			printf("  m[%d][%d]= ",i,j);
			scanf("%f",&m[i][j]);
		}
    printf("\n\n Matricea pe care ati ales-o este urmatoarea: \n\n");
    for(i=0;i<l;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("m[%d][%d]=%.2f   ",i,j,m[i][j]);
        }
        printf("\n");
    }
	printf("\n\n Pozitia liniei care se vrea eliminata este = ");
    scanf("%d",&k);
	er=elimina_linie(m,&l,c,k);
	printf("\n\n Matricea rezultanta este urmatoarea :\n\n");
	for(i=0;i<l;i++)
		{
		    for(j=0;j<c;j++)
			{
			    printf("m[%d][%d]=%.2f   ",i,j,m[i][j]);
			}
			printf("\n");
		}
	printf("\n\n Noul numar de linii este : %d\n\n ",l);
	getch();
}