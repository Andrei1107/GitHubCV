#include <stdio.h>
#include <stdlib.h>
#include <conio.h>



void main()
{
    FILE *f,*g,*h;
    float x,max,v[10];
    int i,n,poz;

    f=fopen("elemente.txt","r");
   if(f) {
        n=0;

        fscanf(f,"%f",&x);

       max=x;

       while(!feof(f))
       {
           v[n]=x;
           n++;
           if(x>max)
           {
               max=x;
           }
           fscanf(f,"%f",&x);
       }
        printf("Maximul este %f",max);
g=fopen("maxim.txt","w+");
if(g)

    {
        fprintf(g,"%f",max);



fclose(g);
    }

h=fopen("pozitii.txt","w+");
if(h)
{
    for(i=0;i<n;i++)
    {


    if(max==v[i])
    {
        fprintf(h,"%d",i);
    }

    }

}


     fclose(f);

    }



}
