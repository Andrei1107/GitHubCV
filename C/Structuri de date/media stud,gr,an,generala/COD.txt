#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

typedef struct{
char nume[30];
int an;
int grupa;
int nrd;
int note[15];
}Student;

void main()
{
    FILE *f,*g;
    Student x;
    int i;
   int can;
    int cgr,na,nf,ng;
    float mf,ma,mg,s;

    f=fopen("Studenti.dat","rb+");
    if(!f)
    {
        printf("Fisierul nu poate fi deschis");

    }else{
    //OPERATII INITIALE LA NIVEL DE DE FISIER

    g=fopen("Listamedii.txt","w");
    fprintf(g,"Lista mediilor studentilor,grupelor si anilor\n\n");
    mf=0;
    nf=0;
    fread(&x,sizeof(Student),1,f);
    while(!feof(f))
    {
        //OPERATII INITIALE LA NIVEL DE AN

        can=x.an;
        ma=0;
        na=0;
        fprintf(g,"\n\nAnul %d ",can);
        while((can==x.an)&&(!feof(f)))
        {
            //OPERATII INITIALE LA NIVEL DE GRUPA
            cgr=x.grupa;
            mg=0;
            ng=0;
            fprintf(g,"\n\nGrupa %d ",cgr);

            while((can==x.an)&&(cgr==x.grupa)&&(!feof(f)))
            {
                //PRELUCRARE ARTICOL
                s=0;
                for(i=0;i<x.nrd;i++)


                    s+=x.note[i];   //a adunat toate notele
                    s=s/x.nrd;      //si le-a impartit la nr lor
                    mg+=s;
                    ng++;
                    fprintf(g,"\n\t\t%-30s %5.2f",x.nume,s);
                    fread(&x,sizeof(Student),1,f);


            }
                //OPERATII FINALE LA NIVEL DE GRUPA
                mg/=ng;
                fprintf(g,"\n\n\tMedia grupei %d este %.0f ",cgr,mg);
                ma+=mg;
                na++;

            }

            //OPERATII FINALE LA NIVEL DE AN
            ma/=na;
            fprintf(g,"\n\nMedia anului %d este %.0f ",can,ma);
            mf+=ma;
            nf++;
                                    }


        //OPERATII FINALE LA NIVEL DE FISIER

        mf/=nf;
        fprintf(g,"Media generala este %.0f ",mf);
        fclose(f);
        fclose(g);

    }

    printf("Apasa o tasta");



    getch();
    }






