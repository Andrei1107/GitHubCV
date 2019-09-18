#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>

// subprogram :

int validare_nat(int a,int b)
{
	char s[10];
	int i, val, gata, l;
	do
	{
		printf("\n  Introduceti nr. natural din intervalul [%d][%d]:",a, b);
		fflush(stdin);
		gets(s);
		l=strlen(s);
		if(l==0)
			gata=0;
		else
		{ gata=l;
		for(i=0;i<l;i++)
			if((s[i]<'0')||(s[i]>'9'))
				gata=0;
		val=atoi(s);
		if((val<a)||(val>b))
			gata=0;
		}
	}
	while(!gata);
	return val;
}

// program principal:

void main()
{
	int n1,n2,nr;
	printf("  Primul numar, n1=");
	scanf("%d",&n1);
	printf("\n  Al doilea numar, n2=");
	scanf("%d",&n2);
	nr=validare_nat(n1,n2);
	printf("\n  Numarul citit din interval este = %d",nr);
	getch();
}
