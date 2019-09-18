#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <malloc.h>
//sortare in fisier si in consola
void sortareText(char *numefisier,float **v,int *n)
{

float x,y;
FILE *f;
int i,j;
long dim;
float aux;



f=fopen(numefisier,"r+");
if(f)
{
    *n=0;
    fscanf(f,"%f",&x);
    while(!feof(f))
    {
        (*n)++;
        fscanf(f,"%f",&x);

    }

    if(*n>0)
    {
        *v=(float*)malloc((*n)*sizeof(float));

    fseek(f,0,0);

    *n=0;
    fscanf(f,"%f",&x);
    while(!feof(f))
    {

        (*v)[*n]=x;
        (*n)++;
        fscanf(f,"%f",&x);
    }


    }

for(i=0;i<(*n);i++)
    {

for(j=i+1;j<(*n);j++)
{

    if((*v)[i]>(*v)[j])
    {
        aux=(*v)[i];
        (*v)[i]=(*v)[j];
        (*v)[j]=aux;



    }} }



    for(i=0;i<*n;i++)
    {
        fprintf(f,"\n %.0f",(*v)[i]);

        }




fclose(f);
}


}








void main()
{
    int n,i;
    float *v;
    sortareText("numefisier.txt",&v,&n);

    for(i=0;i<n;i++)
    {

        printf(" %.0f",v[i]);
    }

free(v);
getch();
}


