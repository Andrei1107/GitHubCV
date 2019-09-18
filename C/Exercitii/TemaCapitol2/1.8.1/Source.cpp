#include <stdio.h>
#include <conio.h>
#include <malloc.h>
#include <stdarg.h>


double* lista_var(int *nr, int n, int n1)
{
	int i;
	double *v;
	va_list p;
	v=(double*)malloc(n*sizeof(double));
	va_start(p,n);
	for(i=0;i<n;i++)
		v[i]=va_arg(p,float);
	va_end(p);
	*nr=n;
	return v;
}


void main()
{
	double *x;
	int n,i;
	x=lista_var(&n,7,1.0);
	for(i=0;i<n;i++)
		{
			printf("x[%d]=%df",i,x[i]);
			printf("\n");
	    }
	getch();
}
