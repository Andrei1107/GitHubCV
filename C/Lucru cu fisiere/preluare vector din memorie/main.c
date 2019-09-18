#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
//sa se scrie un subprogram pt preluarea vectorului in memorie


void preluare(char* numefisier,float v[],int *n)
{
    FILE *f;
    float x;
    f=fopen(numefisier,"r");
    if(f)
    {
         (*n)=0;
        fscanf(f,"%f",&x);
        while(!feof(f))
        {

         v[*n]=x;
         (*n)++;
           fscanf(f,"%f",&x);
        }

fclose(f);

    }else{
    printf("Nu se poate ");
    }

}

void main()
{
int i;
     int n;
    float v[100];
    preluare("numefisier.txt",v,&n);
    for(i=0;i<n;i++)
    {

        printf("v[%d]=%.0f",i,v[i]);
        printf("\n");
    }



    getch();

}
