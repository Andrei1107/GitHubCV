/* 2. Subprogram care primeste un sir de caractere si verifica daca el reprezinta o valoare reala.
      Daca sirul primit este vid, raspunsul este negativ */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

// Subprogram:

int ValoareReala(char *s)
{ int i=0;
  int c=0;
    if(s[0]=='\0')
        return 0;
    if(s[i]=='-')
        i++;
    if((s[i]=='0' && s[i+1]=='0') || s[i]=='.' || (s[i]=='0' && s[i+1]!='.' && s[i+1]!='\0'))
        return 0;
    while(s[i]!='\0')
    {
        if(c==0 && s[i]=='.')
        {
            c++;
            i++;
        }
        if(s[i]<'0' || s[i]>'9')
            return 0;
        i++;
    }
    return 1;
}

// Program principal:

void main()
{
    char *s;
    int i,l,n;
    printf("\n  Numarul de caractere este: n= ");
    scanf("%d",&n);
    s=(char*)malloc(n*sizeof(char));
    for(i=0;i<=n-1;i++)
       {
            printf("s[%d]= ",i);
            fflush(stdin);
            scanf("%c",&s[i]);
       }
    s[n]='\0';
    l=ValoareReala(s);
    printf("\n\n 1- Numar real, 0- numarul nu este real\n\n");
    printf(" valoarea este  : %d",l);
    free(s);
    getch();
}