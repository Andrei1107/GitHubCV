
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void adauga_a_b(float v[], int *l, float a, float b)
{
	int i, j;
	for(i=0;i<*l;i++)
		if(v[i]==b)
		{
			for(j=*l;j>i+1;j--)
				v[j]=v[j-1];
			v[i+1]=a;
			i++;
			*l=*l+1;
		}
}

void main()
{
	float v[100], val1, val2;
	int i, n;
	printf("\n Numarul de elemente din vector este, n=");
	scanf("%d", &n);
	printf("\n\n  Se va adauga un element cu valoarea : ");
	scanf("%f", &val1);
	printf("\n\n  Dupa fiecare element cu valoarea : ");
	scanf("%f", &val2);
	printf("\n");
	for(i=0;i<n;i++)
	{
		printf("  v[%d]=", i);
		scanf("%f", &v[i]);
	}
	adauga_a_b(v, &n, val1, val2);
	printf("\n\n Noul vector este:");
	for(i=0;i<n;i++)
		printf("  v[%d]=%.2f  ", i, v[i]);
	printf("\n\n Noul numar de elemente, n=%d",n);
	getch();
}
