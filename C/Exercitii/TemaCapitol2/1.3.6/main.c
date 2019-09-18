

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int cautare(float x[100], int n, float a)
{
	bool gasit=false;
	int i=0;
	while ((x[i]!=a)&&(i<n))
		i++;
	if(i<n) gasit=true;
	return gasit;
}

void main()
{
	float v[100],a;
	bool gasit;
	int i,n;
	printf("\n Numarul de elemente al vectorului este, n=");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f", &v[i]);
	}
	printf("\n\n  Valoarea analizata este :");
	scanf("%f",&a);
	cautare(v, n, a);
	if(gasit=true) printf("\n\n Valoarea se gaseste printre componentele vectorului");
	else
		printf("\n\n  Nu s-a gasit valoarea");
    getch();
}
