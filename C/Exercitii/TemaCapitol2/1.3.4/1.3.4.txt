#include<stdio.h>
#include<conio.h>

void sort_interschimbare(float v[],int l)
{
	int i,j;
	float a;
	for(i=0;i<l-1;i++)
		for(j=i+1;j<l;j++)
			if(v[i]>v[j])
			{
				a=v[i];
				v[i]=v[j];
				v[j]=a;
			}
}

void main()
{
	float v[50];
	int i,n;
	printf("\n  Numarul de elemente al vectorului este, n=");
	scanf("%d",&n);
	for(i=0;i<=n-1;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	printf("\n\n Vectorul interschimbat este urmatorul:");
	sort_interschimbare(v,n);
	for(i=0;i<=n-1;i++)
		printf("\n\n v[%d]=%f", i,v[i]);
    getch();
}
