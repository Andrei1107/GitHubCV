#include <stdio.h>
#include <stdlib.h>



typedef struct{
int cnp[14];
char nume[30];
char adresa[30];
float ic,ip;
}Contribuabil;

void main()
{
    FILE *f,*g,*h;
    Contribuabil x,y;
    f=fopen("primulfisier.dat","rb");
    if(!f)
    {

    printf("Fisierul nu poate fi deschis");


    }else{
    g=fopen("fisierdoi.dat","rb");

    if(!g)
    {
        printf("Fisierul doi nu poate fi deschis");



    }else{
    h=fopen("fisierrezultat.dat","wb");
    fread(&x,sizeof(Contribuabil),1,f);
    fread(&y,sizeof(Contribuabil),1,g);
    while(!feof(f)&&(!feof(g)))
    {
        if(x.ic<y.ic)
        {

            fwrite(&y,sizeof(Contribuabil),1,h);
            fread(&x,sizeof(Contribuabil),1,f);
        }else{

        fwrite(&y,sizeof(Contribuabil),1,h);
        fread(&y,sizeof(Contribuabil),1,f);


        }
        while(!feof(f))
        {

            fwrite(&x,sizeof(Contribuabil),1,h);
            fread(&x,sizeof(Contribuabil),1,f);

        }
        while(!feof(g))
        {
            fwrite(&y,sizeof(Contribuabil),1,h);
            fread(&y,sizeof(Contribuabil),1,f);
                    }

        fclose(h);
        fclose(g);

    }

    fclose(f);



    }




    }

     printf("gata.apasa o tasta");

}
