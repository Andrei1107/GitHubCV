//creare si consultare pt un fisier txt care memoreaza elemente intregi

#include <stdio.h>
#include <conio.h>
//creare si consultare



void main()
{
    FILE* f;
    int x;
long dim;


    f=fopen("nume.txt","w+");
    scanf("%d",&x);

   while(!feof(stdin))
    {
        fprintf(f,"%d",x);
        scanf("%d",&x);

    }

    fseek(f,0,SEEK_SET);
    fscanf(f,"%d",&x);
 while(!feof(f))
    {
        printf("%d",x);
        fscanf(f,"%d",&x);

    }

    fclose(f);

}
