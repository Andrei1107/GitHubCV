
#include<stdio.h>
#include<conio.h>

void elimina_a(float v[], int *l, float a)
{
	int i, j;
	for(i=0;i<*l;i++)
		if(v[i]==a)
		{
			for(j=i;j<*l-1;j++)
				v[j]=v[j+1];
			*l=*l-1;
			i--;
		}
}

void main()
{
	float v[100], val;
	int i, n;
	printf("\n Numarul de elemente din vector este, n=");
	scanf("%d",&n);
	printf("\n\n Valoarea care se vrea eliminata este = ");
	scanf("%f",&val);
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f", &v[i]);
	}
	elimina_a(v,&n,val);
	printf("\n\n Vectorul rezultant este: ");
	for(i=0;i<n;i++)
		printf("v[%d]=%.2f  ",i,v[i]);
	printf("\n\n Noul numar de elemente din vector este = %d",n);
	getch();
}
