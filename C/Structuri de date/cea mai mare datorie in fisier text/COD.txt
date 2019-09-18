#include <stdio.h>
#include <stdlib.h>

typedef struct{
int cnp[14];
char nume[30];
char adresa[50];
float ic,ip;
}Contribuabil;


void main()
{

    FILE *f,*g,*h;
    Contribuabil x;
    float max;
    int poz;
    f=fopen("fisier.dat","rb");
    if(!f)
    {

        printf("Fisierul nu poate fi deschis");
    }else{


    g=fopen("temp.dat","wb");
    fread(&x,sizeof(Contribuabil),1,f);
    max=0;
    while(!feof(f))
    {
        if(max<x.ic-x.ip)
        {

            max=x.ic-x.ip;
            poz=ftell(f)/sizeof(Contribuabil)-1;
            fclose(g);
            f=fopen("temp.dat","wb");
            fwrite(&poz,sizeof(int),1,g);


        }
        else{

            if(max==x.ic-x.ip)
            {

                poz=ftell(f)/sizeof(Contribuabil)-1;
                fwrite(&poz,sizeof(int),1,g);


            }
            fread(&x,sizeof(Contribuabil),1,f);

        }

        rewind(g);
        h=fopen("Lista.txt","w");

        fprintf(h,"Lista cu cele mai mari datorii neplatite :\n\n");
        fprintf(h,"Datoria maxima este %8.2 lei ",max);
        fprintf(h,"Neachitata de urmatorii:");
        fread(&poz,sizeof(int),1,g);
        while(!feof(g))
        {

            fseek(f,poz*sizeof(Contribuabil),0);
            fread(&x,sizeof(Contribuabil),1,f);
            fprintf(h," \n %14s %30s %50s ",x.cnp,x.nume,x.adresa);
            fread(&poz,sizeof(int),1,g);
        }
        fclose(g);
        fclose(h);
        remove("temp.dat");
        fclose(f);







    }

    printf("Apasa o tasta");


}
}
