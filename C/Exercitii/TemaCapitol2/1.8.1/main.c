#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<stdarg.h>


float* lista_var(int *nr, int n, int n1)
{
	int i;
	float *v;
	va_list p;
	v=(float*)malloc(n*sizeof(float));
	va_start(p,n);
	for(i=0;i<n;i++)
		v[i]=va_arg(p,float);
	va_end(p);
	*nr=n;
	return v;
}
void main()
{
	float *x;
	int n,i;
	printf("n=");
	scanf("%d",&n);
	x=lista_var(&n,7,1.0);
	for(i=0;i<n;i++)
		printf("x[%d]=%f",i,x[i]);
}
