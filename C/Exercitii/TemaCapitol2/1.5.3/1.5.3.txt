#include<stdio.h>
#include<conio.h>
#include<string.h>

void dir_inv(char a[], int i)
{
	if(a[i])
	{
		printf("%c",a[i]);
		dir_inv(a,i+1);
		printf("%c",a[i]);
	}
}
void main()
{
	char v[80];
	int i,n=0;
	for(i=0;i<n;i++)
	{
		printf("v[%d]=");
		scanf("%c",v[i]);
	}
	dir_inv(v,n);
	getch();
}
