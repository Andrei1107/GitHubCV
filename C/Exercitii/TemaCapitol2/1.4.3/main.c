#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

float min_poz_d(float v[],int l, int *nr, int **poz)
{
	float min;
	int i;
	min=v[0];
	*nr=1;
	for(i=1;i<l;i++)
		if(v[i]<min)
		{
			min=v[i];
			*nr=1;
		}
		else
			if(v[i]==min)
				(*nr)++;
	*poz=(int*)malloc(*nr*sizeof(int));
	for(i=0, *nr=0;i<l;i++)
		if(v[i]==min)
				(*poz)[(*nr)++]=i;
	return min;
}

void main()
{
	float *v,min;
    int i,n,nr_ap,*pozitii;
    printf("\n  Numarul de elemente al vectorului = ");
    scanf("%d",&n);
    v=(float*)malloc(n*sizeof(float));
    printf("\n");
    for(i=0;i<n;i++)
    {
        printf("v[%d]=",i);
        scanf("%f", &v[i]);
    }
    min=min_poz_d(v,n,&nr_ap,&pozitii);
    printf("\n\n Elementul minim este %f",min);
    printf("\n\n Numarul de aparitii al acestuia este %d\n\n",nr_ap);
    for(i=0;i<nr_ap;i++)
        {
            printf("pozitii[%d]=%d",i,pozitii[i]);
            printf("\n");
        }
    getch();
}
