
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void interschimba(float *a,float *b)
{
	float c;
	c=*a;
	*a=*b;
	*b=c;
}
void main()
{
	float n1,n2;
	printf("\n\n  Primul numar este : ");
	scanf("%f",&n1);
	printf("\n\n  Al doilea numar este : ");
	scanf("%f",&n2);
	interschimba(&n1,&n2);
	printf("\n\n Interschimbarea a fost efectuata cu succes !");
	printf("\n\n Primul numar este : %f",n1);
	printf("\n\n Al doilea numar este : =%f",n2);
	getch();
}