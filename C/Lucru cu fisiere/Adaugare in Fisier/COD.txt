#include <stdio.h>
#include <stdlib.h>

typedef struct {
char nume[30];
int nrd;
int an;
int note[15];
int grupa;
}Student;

void main()
{
    FILE *f;
    Student x;
    char numefis[20];
    int i;


    f=fopen("numefis.dat","rb+");
    if(!f)
    {
        printf("Fisierul %s nu se poate deschide",numefis);


    }else{
    fseek(f,0,2);
    printf("\nNume si prenume:");
    fflush(stdin);
    gets(x.nume);
    while(!feof(stdin))
    {
        printf("\nAn");
        scanf("%d",&x.an);
        printf("\nGrupa:  ");
        scanf("%d",&x.grupa);
        printf("\nNr discipline");
        scanf("%d",&x.nrd);
        for(i=0;i<x.nrd;i++)
        {
            printf("\nNota %d ",i);
            scanf("%d",&x.note[i]);



        }
fwrite(&x,sizeof(Student),1,f);
        printf("\nNume si prenume");
        fflush(stdin);
        gets(x.nume);





    }
    fclose(f);

    }



   getch();


}
