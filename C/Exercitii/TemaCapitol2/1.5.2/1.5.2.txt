#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

float max_r(float a[], int l)
{
	float max;
	if(l==0)
		return a[l];
	else
	{
		max=max=max_r(a,l-1);
		if(max>a[l])
			return max;
		else
			return a[l];
	}
}
void main()
{
	float *v,maxim;
	int i,n;
	printf("Numarul de elemente =");
	scanf("%d", &n);
	v=(float*)malloc(n*sizeof(float));
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	maxim=max_r(v,n);
	printf("\n\n Maximul este : %f",maxim);
	free(v);
	getch();
}
