#include <stdio.h>
#include <conio.h>
void main(int argc, char* argv[])
{
	int i;
	printf("programul a primit %d parametri:\n\n",argc);
	for(i=0;i<argc;i++)
		puts(argv[i]);
}
