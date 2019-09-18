#include <stdio.h>
#include <math.h>
#include <conio.h>
double ecuatie1(double x)
{
	return x*x-7*x+12;
}
double d_ecuatie1(double x)
{
	return 2*x-7;
}
double ecuatie2(double x)
{
	return x*x-7*x+12;
}
double ecuatie3(double x)
{
	double y;
	y=cos(2*x)*cos(2*x)-x*x;
	return y;
}
double ecuatie4(double x)
{
	return x/8*(63*x*x*x*x-70*x*x+15);
}
void bisectie(double x1, double x2, double eps, int n, double (*f)(double), double *sol, int *er)
{
	*er=0;
	while((*er==0)&&(n>0))
	{
		*sol=(x1+x2)/2;
		if((*f)(*sol)==0)
			*er=1;
		else
		{
			if(x2-x1<eps)
				*er=2;
			else
				if((*f)(*sol)*(*f)(x1)<0)
					x2=*sol;
				else
					x1=*sol;
		}
		n--;
	}
}
void main()
{
	double a,b,sol,prec;
	int nr,cod;
	printf("\na=");
	scanf("%lf",&a);
	printf("\nb=");
	scanf("%lf",&b);
	printf("\nprecizia=");
	scanf("%f",&prec);
	printf("\nnr=");
	scanf("%d",&nr);
	printf("\n\nMetoda bisectiei:\n");
	bisectie(a,b,prec,nr,ecuatie1,&sol,&cod);
	switch(cod)
	{
	case 0:printf("\nFara solutie");
		break;
	case 1:printf("\nSolutia exacta este %23.20f",sol);
		break;
	case 2:printf("\nSolutia aproximativa este %23.20f",sol);
	}
	getch();
}
