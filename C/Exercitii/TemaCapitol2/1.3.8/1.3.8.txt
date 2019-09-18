#include<stdio.h>
#include<conio.h>

float min_poz_s(float v[], int l, int *nr, int poz[])
{
	float min;
	int i;
	min=v[0];
	*nr=1;
	poz[0]=0;
	for(i=1;i<l;i++)
		if(v[i]<min)
		{
			min=v[i];
			*nr=1;
			poz[0]=i;
		}
		else
			if(v[i]==min)
				poz[(*nr)++]=i;
	return min;
}
void main()
{
	float v[100], min;
	int i, n, nr_ap, pozitii[100];
	printf("\n Numarul de elemente al vectorului este, n=");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	min=min_poz_s(v,n,&nr_ap,pozitii);
	printf("\n\n Minimul este = %f",min);
	printf("\n\n Numarul de aparitii = %d\n\n",nr_ap);
	for(i=0;i<n;i++)
        if(min==v[i])
            {
                printf(" Pe pozitia %d apare minimul ", i);
                printf("\n");
            }
	getch();
}
