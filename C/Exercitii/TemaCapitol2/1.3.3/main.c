// Sortare prin metoda numararii

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void sort_numarare(double v[],int l)
{
    int i,j,*num;
    double *temp;
    temp=(double*)malloc(l*sizeof(double));
    num=(int*)malloc(l*sizeof(int));
    for(i=0;i<l;i++)
        num[i]=0;
    for(i=0;i<l-1;i++)
        for(j=i+1;j<l;j++)
        {
            if(v[j]<v[i])
                num[i]++;
            else
                num[j]++;
        }
    for(i=0;i<l;i++)
        temp[num[i]]=v[i];
    for(i=0;i<l;i++)
        v[i]=temp[i];
    free(temp);
    free(num);
}

void main()
{
    double v[100];
    int i,n;
    printf("\n  Numarul de elemente ale vectorului este:, n=");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("v[%d]=",i);
        scanf("%lf",&v[i]);
    }
    sort_numarare(v,n);
    printf("\n\n  Vectorul sortat este urmatorul: ");
    for(i=0;i<n;i++)
    {
        printf("\n\n  v[%d]=%.2lf ",i,v[i]);
    }
    _getch();
}
