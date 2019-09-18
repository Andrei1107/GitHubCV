#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void Rotunjire( float n )
{
    int s;
    s=n;    // daca un int este egal cu un float, acesta retine numarul fara ce este dupa virgula
    if(n>=0)
    {
        if(n-s >= 0.5 )
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
        if(n-s >= -0.5 )
            {
                printf("Numarul rotunjit este %d",s);
            }
        else
            {
                printf("Numarul rotunjit este %d",s-1);
            }
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

