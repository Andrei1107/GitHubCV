#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
//prelucrare fisier binar

void main()
{
    FILE* f ;
    float x,g;
    long dim;

    f=fopen("nume.dat","wb+");

    scanf("%f",&x);

    while(!feof(stdin))
    {
        fwrite(&x,sizeof(x),1,f);
        scanf("%f",&x);


    }
    fseek(f,0,SEEK_SET);
    fread(&x,sizeof(x),1,f);
    while(!feof(f))
    {
        printf("%.0f",x);
        fread(&x,sizeof(x),1,f);



    }
    fclose(f);



}



