#include<stdio.h>
#include<conio.h>

void sort_selectie(float v[], int l)
{
	int i, j, p;
	float a;
	for(i=0;i<l-1;i++)
	{
		p=i;
		for(j=i+1;j<l;j++)
			if(v[j]<v[p])
				p=j;
		a=v[p];
		v[p]=v[i];
		v[i]=a;
	}
}

void main()
{
	float v[50];
	int i,n;
	printf("\n  Numarul de elemente al vectorului, n=");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	printf("\n\n Vectorul sortat este urmatorul: ");
	sort_selectie(v,n);
	for(i=0;i<n;i++)
		printf("\n\n  v[%d]=%.2f",i,v[i]);
    getch();
}
