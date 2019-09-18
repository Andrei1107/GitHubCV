#include<stdio.h>
#include<conio.h>

void sort_rapida(float v[],int l, int p, int u)
{
	int i,j,ii,jj;
	float a;
	if(p<u)
	{
		ii=0;
		jj=-1;
		i=p;
		j=u;
		while(i<j)
		{
			if(v[i]>v[j])
			{
				a=v[i];
				v[i]=v[j];
				v[j]=a;
				if(ii)
				{
					ii=0;
					jj=-1;
				}
				else
				{
					ii=1;
					jj=0;
				}
			}
			i+=ii;
			j+=jj;
		}
		sort_rapida(v,l,p,i-1);
		sort_rapida(v,l,i+1,u);
	}
}
void main()
{
	float v[100];
	int i,n,p,u;
	p=0;
	printf("\n Numarul de elemente =");
	scanf("%d",&n);
	u=n-1;
	for(i=0;i<n;i++)
	{
		printf("v[%d]=",i);
		scanf("%f",&v[i]);
	}
	sort_rapida(v,n,p,u);
	for(i=0;i<n;i++)
		printf("v[%d]=%f",i,v[i]);
    getch();
}
