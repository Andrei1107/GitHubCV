#include <stdio.h>
#include <conio.h>
#include <math.h>
void puncte(float (*f)(float), int n, float a, float b, float **x, float **y, int *l)
{
	int i;
	*x=new float[n+1];
	*y=new float[n+1];
	for(i=0;i<=n;i++)
	{
		(*x)[i]=a+i*(b-a)/n;
		(*y)[i]=(*f)((*x)[i]);
	}
	*l=n+1;
}
float f1(float x)
{
	return 1+sin(3*x);
}
void main()
{
	float st,dr,*x,*y;
	float (*p)(float);
	int i,l,pct;
	p=f1;
	printf("dr=");
	scanf("%d",&dr);
	printf("st=");
	scanf("%d",&st);
	printf("pct=");
	scanf("%d",&pct);
	printf("l=");
	scanf("%d",&l);
	puncte(p,pct,st,dr,&x,&y,&l);
	for(i=0;i<l;i++)
		printf("x[%d]=%f",i,x[i]);
	for(i=0;i<l;i++)
		printf("y[%d]=%f",i,y[i]);
	getch();

}

