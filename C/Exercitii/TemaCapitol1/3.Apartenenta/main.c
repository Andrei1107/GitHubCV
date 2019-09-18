#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int ValoareReala(float a, float b, float c)
{
    if(a>b)
    {
        a+=b;
        b=a-b;
        a=a-b;
    }
    if(c<=b && c>=a)
        return 1;
    return 0;
}

void main()
{
  float a,b,c;
  int s;
  printf(" Prima valoare a intervalului este : ");
  scanf("%f",&a);
  printf(" Ultima valoare a intervalului este : ");
  scanf("%f",&b);
  printf("\n Valoarea analizata este: ");
  scanf("%f",&c);
  s=ValoareReala(a,b,c);
  printf("\n\n 1- Apartine intervalului. 0- Nu apartine intervalului.\n\n");
  printf("\n Rezultatul exercitiului este: %d",s);
  getch();
}
