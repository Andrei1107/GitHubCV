#include<stdio.h>
#include<conio.h>
#include<stdarg.h>
#include<malloc.h>


float* lista_var2(int *nr, int n, int n1)
{
	int i;
	float *v;
	float t;
	va_list p;
	v=(float*)malloc(100*sizeof(float));
	va_start(p,nr);
	*nr=0;
	t=va_arg(p,float);
	while(t)
	{
		v[*nr]=t;
		(*nr)++;
		t=va_arg(p,float);
	}
	va_end(p);
	return v;
}
void main()
{
	float *x;
	int n,i;
	printf("n=");
	scanf("%d",&n);
	x=(float*)malloc(n*sizeof(float));
	for(i=0;i<n;i++)
	{
		printf("x[%d]=",i);
		scanf("%f",&x[i]);
	}
	x=lista_var2(&n,1.0,2.0);
	for(i=0;i<n;i++)
		printf("x[%d]=%f",i,x[i]);
	getch();
}
