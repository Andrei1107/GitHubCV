/* 8. Subprogram pentru afisarea unui vector pe ecran.
      Ce diferente sunt intre situatiile in care vectorul este alocat static, respectiv dinamic?
      - Cand vectorul este alocat dinamic trebuie eliberata memoria la sfarsitul programului.
      - Eficienta si optimizare crescuta in cazul alocarii dinamice.
      - Trebuie lucrat cu pointerul lui v in subprogram.
*/

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void AfisareVector( float v[100], int n)
{
    int i;
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]=%f",i,v[i]);
        printf("\n");
    }
}

void main()
{
    int i,n;
    float v[100];
    printf("Numarul de elemente ale vectorului sunt, n=");
    scanf("%d",&n);
    for(i=0;i<=n-1;i++)
    {
        printf("v[%d]= ",i);
        scanf("%f",&v[i]);
    }
    printf("\n\nElementele vectorului sunt urmatoarele:\n\n");
    AfisareVector(v,n);
    getch();
}
