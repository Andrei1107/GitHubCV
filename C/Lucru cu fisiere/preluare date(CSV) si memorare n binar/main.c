#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include<string.h>

#define MAX 2002
#define NUME1 "Studenti.csv"
#define NUME2 "Studenti.dat"


void main()
{

    FILE *f,*g;

    typedef struct{
    char an;
    int grupa;
    char nume[31];
    char note[20];
    }Student;

    Student x;
    char rand[200];
    char mc[23][31];
    int n,i,j,k;

    f=fopen(NUME1,"r");
    if(!f)
    {
        printf("\nFisierul %s nu poate fi deschis",NUME1);


    }else{

    g=fopen(NUME2,"wb");


    }
    if(!g)
    {

        printf("\nFisierul %s nu poate fi deschis",NUME2);

    }else{
    fgets(rand,MAX,f);
    while(!feof(f))
    {
        n=strlen(rand);

        i=j=0;

        for(k=0;k<n;k++)
        {
            if(rand[k]==',')
            {


                mc[i][j]='\0';
                i++;
                j=0;


            }else{
            mc[i][j]=rand[k];
            j++;


            }
        }
        strcpy(x.nume,mc[0]);
        x.an=atoi(mc[2]);
        x.grupa=atoi(mc[2]);
        for(i=0;i<20;i++)
       x.note[i]=atoi(mc[i+3]);


        fwrite(&x,sizeof(Student),1,g);
        fgets(rand,MAX,f);

    fclose(g);


    }
    fclose(f);



    }




    getch();
}
