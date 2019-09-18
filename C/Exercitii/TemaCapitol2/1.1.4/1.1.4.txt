#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void Rotunjire( float n )
{
    int s;
    s=n;    // daca un int este egal cu un float, acesta retine numarul fara ce este dupa virgula
    if(n>=0)
    {
        if(n-s >= 0.7 )
        {
            printf("Numarul rotunjit este %d",s+1);
        }
        else
        {
            printf("Numarul rotunjit este %d",s);
        }
    }
    else
        {
           printf("  \n\n  Numarul pe care l-ati ales nu este unul pozitiv !");
        }
}

void main()
{
    float n;
    printf("Numarul pe care doriti sa il rotunjiti este: ");
    scanf("%f",&n);
    Rotunjire(n);
    getch();
}
