#include <stdio.h>
#include <stdlib.h>
#include <conio.h>



#define NUME "Vector.dat"
#define NUME2 "Pozitii.dat"



void main()
{
FILE *f,*g;
float x,max;
char *maxim;
char *pozitii;
int i,n;
int v[10];
printf("Nr de elemente:");
scanf("%d",&n);

for(i=0;i<n;i++)
{
    printf("v[%d]=",i);
    scanf("%d",&v[i]);

}
for(i=0;i<n;i++)
{


    printf("\t");
    printf("%d",v[i]);
}

max=v[0];

for(i=0;i<n;i++)
{
    if(v[i]>max)
    {

        max=v[i];


    }

}
printf("Maximul este %.0f",max);

for(i=0;i<n;i++)
{
    if(max==v[i])
    {

        printf("\nMax e pe pozitia %d\n",i);
    }


}


f=fopen("maxim.txt","w+");
if(f)
{

    fprintf(f,"%f",max);


}

fclose(f);

g=fopen("pozitii.txt","w+");
if(g)
{
    for(i=0;i<n;i++)
    {
        if(v[i]==max){

    fprintf(g,"%d",i);
        }
    }


}



    getch();

}
