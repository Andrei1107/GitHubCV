#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
//fisier organizat secvential
//adaugarea de articole in fisier
//binar


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

   f=fopen(nume_f,"rb+");

   if(!f)
   {

       printf("Eroare la deschiderea fisierului");

   }else{

   fseek(f,0,2);
   printf("Nume si prenume:");
   fflush(stdin);
   gets(x.nume);

   while(!feof(stdin))
   {
       printf("\nAn:");
       scanf("%d",&x.an);
       printf("\nGrupa:");
       scanf("%d",&x.grupa);
       printf("Numar discipline:");
       scanf("%d",&x.nrd);

       for(i=0;i<x.nrd;i++)
       {
          printf("Nota  de la materia %d:",i);
           scanf("%d",&x.note[i]);
       }

       fwrite(&x,sizeof(Student),1,f);
       printf("Nume si prenume:");
       fflush(stdin);
       gets(x.nume);



   }
   fclose(f);

   }





    getch();


}
