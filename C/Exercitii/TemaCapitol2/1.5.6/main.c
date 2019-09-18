#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void turnurihanoi( int n, int ti, int tf, int tint, int rez[][2], int *nr)
{
    if(n==1)
    {
        rez[*nr][0]=ti;
        rez[*nr][1]=tf;
        (*nr)++;
    }
    else
    {
        turnurihanoi(n-1,ti,tint,tf,rez,nr);
        rez[*nr][0]=ti;
        rez[*nr][1]=tf;
        (*nr)++;
        turnurihanoi(n-1,tint,tf,ti,rez,nr);
    }
}

void main()
{
  int i,j,n,mutari[100][2],nrm;
	nrm=0;
	printf("n=");
	scanf("%d",&n);
	turnurihanoi(n,1,3,2,mutari,&nrm);
	for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
                {
                    printf("mutari[%d][%d]=%d   ",i,j,mutari[i][2]);
                }
            printf("\n");
		}
	printf("Numarul de mutari este: %d",nrm);
	getch();
}

