#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void sort_shell(float v[],int l)
{
	int i,j,inc;
	float a;
	for(inc=l/2;inc>0;inc=inc/2)
		for(i=inc;i<l;i++)
			for(j=i-inc;(j>=0)&&(v[j]>v[j+inc]);j=j-inc)
			{
				a=v[j];
				v[j]=v[j+inc];
				v[j+inc]=a;
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
		scanf("%f", &v[i]);
	}
	sort_shell(v,n);
    for(i=0;i<n;i++)
        printf("\n\n  v[%d]=%.2f",i,v[i]);
    getch();
}
