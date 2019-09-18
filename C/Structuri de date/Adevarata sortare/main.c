#include <stdio.h>
#include <stdlib.h>



int nrart(FILE *f,int l)
{
    long p;
    int n;
    p=ftell(f);
    fseek(f,0,2);
    n=ftell(f)/l;
    fseek(f,p,0);
    return n;

}

typedef struct
{

    int nr;
    char nume[30];
    int an;
    int grupa;
    int n;
    int note[15];

}Student;


void main()
{


    FILE *f,*g;

   Student s1;
    Student s2;
    int ok,n,i;


    f=fopen("fisier.dat","rb+");
    if(!f)
    {
        printf("Fisierul nu poate fi deschis");


    }else{
    n=nrart(f,sizeof(Student));
    ok=1;
    while(ok)
    {
        ok=0;
        for(i=0;i<n-1;i++)
        {

            fseek(f,i*sizeof(Student),0);
            fread(&s1,sizeof(Student),1,f);
            fread(&s2,sizeof(Student),1,f);
            if((s1.an>s2.an)||(s1.an==s2.an)&&(s1.grupa>s2.grupa))
            {
                ok=1;
                fseek(f,i*sizeof(Student),0);
                fwrite(&s2,sizeof(Student),1,f);
                fwrite(&s1,sizeof(Student),1,f);
            }
        }
    }
    fclose(f);
    }
}





















