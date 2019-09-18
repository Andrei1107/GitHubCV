#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<string.h>


void main(int argc, char* argv[])
{
	int i,j,*poz,nr,perechi,punct,l,*corect;
	float max,*val;
	poz=(int*)malloc(argc*sizeof(int));
	val=(float*)malloc(argc*sizeof(float));
	corect=(int*)malloc(argc*sizeof(int));
	if((argc==1)||(argc%2==0))
		printf("numar incorect de parametri");
	else
	{
		perechi=(argc-1)/2;
		for(i=1;i<=perechi;i++)
		{
			corect[i*2]=1;
			if((argv[i*2][0]=='-')||(argv[i*2][0]=='='))
				j=1;
			else
				j=0;
			punct=1;
			l=strlen(argv[i*2]);
			for(;j<l;j++)
			{
				if((argv[i*2][j]<'0')||(argv[i*2][j]>'9'))
					corect[i*2]=0;
				if((argv[i*2][j]=='-')&&punct)
				{
					corect[i*2]=1;
					punct=0;
				}
			}
			if(corect[i*2])
				val[i*2]=atof(argv[i*2]);
		}
		max=val[2];
		nr=0;
		for(i=1;i<=perechi;i++)
			if(corect[i*2])
				if(val[i*2]>max)
				{
					max=val[i*2];
					nr=1;
					poz[0]=i*2;
				}
				else
					if(val[i*2]==max)
						poz[nr++]=i*2;
		printf("valoarea maxima este %f si corespunde urmatoarelor nume:", max);
		for(i=0;i<nr;i++)
			printf("\n%s",argv[poz[i]-1]);
		}
	}
