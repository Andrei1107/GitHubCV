/* Citire vector-Subprogram.
   Vectorul este alocat static in apelator.
   Ce trebuie modificat la subprogram daca vectorul este alocat dinamic in apelator?
   Raspuns:Nimic, au fost testate ambele variante.
*/

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void CitireVector( float *v, int n)
{
    int i;
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]= ",i);
        scanf("%f",&v[i]);
    }
}

void main()
{
    int n;
    float v[100];
    printf("Numarul de elemente al vectorului, n=");
    scanf("%d",&n);
    CitireVector(&v,n);
    getch();
}
