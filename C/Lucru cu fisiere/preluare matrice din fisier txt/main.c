#include <conio.h>
#include <string.h>
#include <stdio.h>
#define MAX 1000



float** preluare_matrice_2(char* nume,int* m,int* n)
{


    float **x;
    int i,j;
    FILE* f;
    char *rand;
    x=NULL;

    f=fopen(nume,"r");
    if(f)
    {

        rand=(char*)malloc(MAX);
        fgets(rand,MAX,f);
        *m=0;

        while(!feof(f))
        {
            (*m)++;
            fgets(rand,MAX,f);

        }
        j=strlen(rand);

        *n=1;
        for(i=0;i<j;i++)
        if(rand[i]==' ')
            (*n)++;


        free(rand);

          x=(float**)malloc(sizeof(float*)*(*m));
          for(i=0;i<*m;i++)

          x[i]=(float*)malloc(sizeof(float)*(*n));

              rewind(f);
              for(i=0;i<*m;i++)
              for(j=0;j<*n;j++)
                fscanf(f,"%f",&x[i][j]);

            fclose(f);

    }else{

    printf("Nu se poate deschide");
    }


        return x;

    }



void main()
{

    int i,j,n,m;
    float **x;
float **a;

  a= preluare_matrice_2("nume.txt",&m,&n);

    for(i=0;i<m;i++)
    {
printf("\n");
        for(j=0;j<n;j++)
        {

            printf("%.0f",a[i][j]);


        }
        printf("\n");
    }

    for(i=0;i<m;i++)

{

        free(a[i]);

}

        free(a);


getch();
}


