#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

//fisier binar organizat secvential


typedef struct{
int nrmat;
char nume[30];
int an;
int grupa;
int nrnote;
int notele[15];
}Student;






void main()
{
    FILE *f;
int i;
    Student x;

    f=fopen("fisierbinar.dat","wb+");

    if(!f)
    {
        printf("Nu se poate deschide fisierul");





    }else{

    printf("\nNr matricol:");scanf("%d",&x.nrmat);fwrite(&x.nrmat,sizeof(Student),1,f);
 while(!feof(stdin))
    {
        printf("\nNume:");fflush(stdin);gets(x.nume);fwrite(&x.nume,sizeof(Student),1,f);
        printf("\nAn:");scanf("%d",&x.an);fwrite(&x.an,sizeof(Student),1,f);
        printf("\nGrupa:");scanf("%d",&x.grupa);fwrite(&x.grupa,sizeof(Student),1,f);
        printf("\nNr de note:"); scanf("%d",&x.nrnote);fwrite(&x.nrnote,sizeof(Student),1,f);

        for(i=0;i<x.nrnote;i++)
        {

            printf("\nNota %d:",i,x.notele[i]);
            scanf("%d",&x.notele[i]);
            fwrite(&x.notele[i],sizeof(Student),1,f);

        }


    }

fclose(f);

    }










}
