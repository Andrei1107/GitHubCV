#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
//fisier organizat secvential
//adaugarea de articole in fisier



typedef struct{

char nume[30];
int an;
int grupa;
int note[15];
int nrd;

}Student;






void main()
{

   FILE *f;
   Student x;
   int i;
   char *nume_f[20];

   printf("Numele fisierului ");
   gets(nume_f);

   f=fopen(nume_f,"r+");

   if(!f)
   {

       printf("Eroare la deschiderea fisierului");

   }else{

   fseek(f,0,2);
   printf("Nume si prenume:");
   fflush(stdin);
   gets(x.nume);
   fprintf(f,"\nNume si prenume: %s",x.nume);

   while(!feof(stdin))
   {
       printf("\nAn:");
       scanf("%d",&x.an);
       fprintf(f,"\nAnul:%d",x.an);
       printf("\nGrupa:");
       scanf("%d",&x.grupa);
       fprintf(f,"\nGrupa:%d",x.grupa);
       printf("Numar discipline:");
       scanf("%d",&x.nrd);
       fprintf(f,"\nNr note:%d",x.nrd);

       for(i=0;i<x.nrd;i++)
       {
          printf("Nota  de la materia %d:",i);
           scanf("%d",&x.note[i]);
           fprintf(f," \nNota %d",x.note[i]);
       }


       printf("Nume si prenume:");
       fflush(stdin);
       gets(x.nume);
       fprintf(f,"\n%s",x.nume);



   }
   fclose(f);

   }





    getch();


}
