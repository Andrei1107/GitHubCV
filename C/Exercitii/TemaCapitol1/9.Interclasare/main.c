/* 9.Subprogram care interclaseaza doi vectori sortati crescator.
   Vectorul rezultat trebuie alocat dinamic in subprogram. */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

float* Interclasare(float *v1, float *v2, int n, int m, float **v3,int *k)
{
    int i=0,j=0;
    *v3=(float*)malloc((n+m)*sizeof(float));
    v1[n]=v2[m-1];
    v2[m]=v1[n-1];
    for(*k=0;*k<n+m;(*k)++)
        if(v1[i]<v2[j])
        {
            (*v3)[*k]=v1[i];
            i++;
        }
        else
        {
            (*v3)[*k]=v2[j];
            j++;
        }
    return v3;
}

void main()
{
    int n,m,i,j,k;
    float *v1,*v2,*v3,*l;
    printf("Numarul de elemente din primul vector este: n=");
    scanf("%d",&n);
    printf("Numarul de elemente din al doilea vector este: m=");
    scanf("%d",&m);
    v1=(float*)malloc(n*sizeof(float));
    v2=(float*)malloc(m*sizeof(float));
    printf("\n");
    for(i=0;i<=n-1;i++)
    {
        printf("v1[%d]= ",i);
        scanf("%f",&v1[i]);
    }
   printf("\n\n");
    for(i=0;i<=m-1;i++)
    {
        printf("v2[%d]= ",i);
        scanf("%f",&v2[i]);
    }
    printf("\n\n");
    l=Interclasare(v1,v2,n,m,&v3,&k);
    printf("Vectorul interclasat este urmatorul:\n\n");
    for(i=0;i<=k-1;i++)
    {
        printf("v3[%d]=%.2f  ",i,v3[i]);
    }
    free(v1);
    free(v2);
    free(v3);
    getch();
}
