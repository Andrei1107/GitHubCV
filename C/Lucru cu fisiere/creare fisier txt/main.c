#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

//creare fisier si scriere


void scriere_vector(char* nume)
{
    FILE *f;
    int x;

    f=fopen(nume,"w");

    if(f)
    {
        scanf("%d",&x);

        while(!feof(stdin))
        {
            fprintf(f,"%d",x);
            scanf("%d",&x);


        }
        fclose(f);

    }else{
    printf("Nu se poate crea fisierul");
    }

}
void main()
{


    scriere_vector("nume.txt");


    getch();

}


