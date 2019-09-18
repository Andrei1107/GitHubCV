#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <malloc.h>

// subprogram :

char* citire_sir(int lmin, int lmax, int n)
{
	char text[101], *rez;
	int i, gata, l;
	for(i=0,gata=0;(i<n)&&(!gata);i++)
	{
		printf("\nIntroduceti un sir cu lungimea in intervalul [%d,%d]:\n",lmin,lmax);
		fflush(stdin);
		gets(text);
		l=strlen(text);
		if((l>=lmin)&&(l<=lmax))
			gata=1;
	}
	if(!gata)
		rez=NULL;
	else
	{
		rez=(char*)malloc((l+1)*sizeof(char));
		strcpy(rez,text);
	}
	return rez;
}

// program principal :

void main()
{
	char *sir;
	int lmin,lmax,nr;
	printf("\n  Limita minima este = ");
	scanf("%d",&lmin);
	printf("\n\n  Limita maxima este = ");
	scanf("%d",&lmax);
	printf("\n\n  Numarul de incercari este = ");
	scanf("%d",&nr);
	sir=citire_sir(lmin,lmax,nr);
	if(!sir)
		printf("\n\n  S-au epuizat incercarile fara a se citi un sir valid");
	else
	{
		printf("\n\n  Sirul citit este: %s ",sir);
			free(sir);
	}
	getch();
}
