#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
//elimina valorile dintr un interval dat



void eliminare(char *numefisier,float *a,float *b)
{
    FILE *f,*g;
    float x;
    char *fisierfinal;

    f=fopen(numefisier,"r+");

    if(!f)
    {
        printf("Eroare la deschiderea fisierului initial");


    }else{
    g=fopen("fisierfinal.txt","w+");
    if(!g){
        printf("Eroare la deschiderea fisierului final");

    }else{

    fscanf(f,"%f",&x);
    while(!feof(f))
    {

        if((x<*a)||(x>*b))
        {
            fprintf(g,"\t%.0f",x);


        }
          fscanf(f,"%f",&x);


    }

    fclose(g);
    fclose(f);
    remove(numefisier);
    rename("fisierfinal.txt",numefisier);


    }

        }

}





void main()
{
    float a,b;
    printf("a=");scanf("%f",&a);
    printf("b=");scanf("%f",&b);

    eliminare("numefisier.txt",&a,&b);




   getch();

}
