#include<stdio.h>
#include<conio.h>

void cmmdc(int a, int b, int *c)
{
	int r,d,i;
	d=a;
	i=b;
	do
	{
		r=d%i;
		d=i;
		i=r;
	}
	while(r!=0);
	*c=d;
}

void main()
{
	int n1,n2,div;
	printf("\n  Primul numar este : ");
	scanf("%d",&n1);
	printf("\n\n  Aldoilea numar este : ");
	scanf("%d",&n2);
	cmmdc(n1,n2,&div);
	printf("\n\n  Cel mai mare divizor comun este = %d",div);
	getch();
}
