#include<stdio.h>
#include<conio.h>
#include<string.h>

void main(int argc, char* argv[])
{
	int i,j,s,n,l,corect;
	s=0;
	n=0;
	for(i=0;i<argc;i++)
	{l=strlen(argv[i]);
	corect=1;
	if((argv[i][0]=='-')||(argv[i][0]=='+'))
		j=1;
	else
		j=0;
	for(;j<l;j++)
		if((argv[i][j]<'0')||(argv[i][j]>'9'))
			corect=0;
	if(corect)
	{
		s+=atoi(argv[i]);
		n++;
	}
	}
		printf("s-au primit %d parametri din care %d valori intregi, cu suma %d",argc-1,n,s);
}
