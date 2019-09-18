#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

float suma_r(float v[],int l)
{
	float s;
	if(l==0)
		s=0;
	else
		s=v[l-1]+suma_r(v,l-1);
	return s;
}

void main()
{
	float *v, sum;
	int i,n;
	printf("Numarul de elemente al vectorului = ");
	scanf("%d",&n);
	v=(float*)malloc(n*sizeof(float));
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	sum=suma_r(v,n);
	printf("\n\nSuma este %f",sum);
	free(v);
	getch();
}
