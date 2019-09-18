#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

//det pozitiile liniilor care sunt in ordine crescatoare


void pozitii(char *numefisier,float ***a,int *n,int *m)
{

    float x;
    int i,j;
    FILE *f;

    int l;

    f=fopen(numefisier,"r");
    if(!f)
    {

        printf("Eroare la deschiderea fisierului");
    }else{
    fscanf(f,"%d",&n);
    fscanf(f,"%d",&m);

    *a=(float**)malloc((*n)*sizeof(float*));
    for(i=0;i<*n;i++)
    {

    (*a)[i]=(float*)malloc((*m)*sizeof(float));

    }

    for(i=0;i<*n;i++)
    {
        for(j=0;j<*m;j++)
        {

            fscanf(f,"%f",&a[i][j]);


        }
    }

    for(i=0;i<*n;i++)
    {

        for(j=0;j<(*m)-2;j++)

        {
            l=0;

          while(*a[i][j]<=*a[i][j+1]){
              l++;
          }

            if(l==(*m)-1)
            {
                printf("Linia %d are elemente strict crescatoare\n",i);
            }

        }

    }

fclose(f);


    }



}



void main()
{
    int i,n,j,m;
    float **a;

    pozitii("numefisier.txt",&a,&n,&m);

for(i=0;i<n;i++)
{

    free(a[i]);

}
free(a);

    getch();
}

