#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

typedef struct{
char nume[30];
int an;
int grupa;
int nrd;
int note[10]


}Student;


void main()
{
int n;



    int i,j;
    char numefis[100];
int gata;
    FILE *f;
    Student x;
    Student y;


    printf("Numele fisierului:");
    gets(numefis);

    f=fopen(numefis,"r+");

    if(!f)
    {
        printf("Eroare la deschiderea fisierului");


    }else{

    fseek(f,0,2);
    printf("Nume si prenume:");
    fflush(stdin);
    gets(x.nume);
    fprintf(f,"\nNume si prenume: %s\n",x.nume);
printf("\n");
    while(!feof(stdin))
    {
        printf("\nAnul de sudiu:");
        scanf("%d",&x.an);
        fprintf(f,"Anul de studiu:%d\n",x.an);

        printf("Grupa:");
        scanf("%d",&x.grupa);
        fprintf(f,"Grupa:%d\n",x.grupa);

        printf("Nr de discipline:");
        scanf("%d",&x.nrd);
        fprintf(f,"Nr note:%d\n",x.nrd);

        for(i=0;i<x.nrd;i++)
        {
            printf("Nota %d:",i);
            scanf("%d",&x.note[i]);
            fprintf(f,"Nota %d:%d\n",i,x.note[i]);
        }
 printf("Nume si prenume:");
        fflush(stdin);
        gets(x.nume);
fprintf(f,"Nume si prenume: %s",x.nume);
    }



    fseek(f,0,2);
    n=ftell(f)/sizeof(Student);
gata=0;
while(!gata)
{

    gata=1;
    for(i=0;i<n-1;i++)
    {
        fseek(f,i*sizeof(Student),0);
        fscanf(f,"%f",&x);
        fscanf(f,"%f",&y);
        if((x.an>y.an)||(x.an==y.an)&&(x.grupa>y.grupa))
        {

            gata=0;
            fseek(f,i*sizeof(Student),0);
            fprintf(f,"\nNumele este %s \n",y.nume);
               fprintf(f,"Anul  este %d \n",y.an);
               fprintf(f,"Grupa este %d \n",y.grupa);
               fprintf(f,"Nr de discipline este  %d \n",y.nrd);

            for(i=0;i<y.nrd;i++)
            {

                   fprintf(f,"\nNota  %d este %d \n",i,y.note[i]);


            }
            fprintf(f,"\nNumele este %s \n",x.nume);
               fprintf(f,"Anul  este %d \n",x.an);
               fprintf(f,"Grupa este %d \n",x.grupa);
               fprintf(f,"Nr de discipline este  %d \n",x.nrd);

            for(i=0;i<x.nrd;i++)
            {

                   fprintf(f,"\nNota  %d este %d \n",i,x.note[i]);

            }

        }






    }


}










    }


    fclose(f);

        }




















