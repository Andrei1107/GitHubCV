#include<stdio.h>
#include<conio.h>

void sort_bule(float v[], int l)
{
	int i, gata;
	float a;
	gata=0;
	while(!gata)
	{
		gata=l;
		for(i=0;i<l-1;i++)
			if(v[i]>v[i+1])
			{
				gata=0;
				a=v[i];
				v[i]=v[i+1];
				v[i+1]=a;
			}
	}
}

void main()
{
	float v[50];
	int i,n;
	printf("\n  Numarul de elemente al vectorului, n= ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	printf("v[%d]=",i);
	scanf("%f",&v[i]);
	}
	sort_bule(v,n);
	printf("\n\n Vectorul sortat este urmatorul : ");
	for(i=0;i<n;i++)
	printf("\n\n  v[%d]=%.2f ",i,v[i]);
	getch();
}
