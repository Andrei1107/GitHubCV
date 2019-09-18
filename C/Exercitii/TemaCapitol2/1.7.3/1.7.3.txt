#include <stdio.h>
#include <conio.h>
#include <malloc.h>
float** evaluare(float *x, int nrp, float (*f[])(float),int nrf,int *l, int *c)
{
	int i,j;
	float **mat;
	*l=nrf;
	*c=nrp;
	mat=(float**)malloc(nrf*sizeof(float*));
	for(i=0;i<nrf;i++)
		mat[i]=(float*)malloc(nrp*sizeof(float));
	for(i=0;i<nrf;i++)
		for(j=0;j<nrp;j++)
			mat[i][j]=(*f[i])(x[j]);
	return mat;
}
float f1(float x)
{
	return x;
}
float f2(float x)
{
	return 2*x;
}
float f3(float x)
{
	return x*x;
}
float f4(float x)
{
	return 1/x;
}
void main()
{
	float puncte[]={1,2,3,4,5,6,7,8,9,10};
	int n=10,nf=4;
	float(*func[5])(float);
	float **rez;
	int i,j,lin,col;
	func[0]=f1;
	func[1]=f2;
	func[2]=f3;
	func[3]=f4;
	rez=evaluare(puncte,n,func,nf,&lin,&col);
	printf("\n");
	for(i=0;i<n;i++)
		printf("%6.2f",puncte[i]);
	for(i=0;i<nf;i++)
	{
		printf("\n");
		for(j=0;j<n;j++)
			printf("%6.2f",rez[i][j]);
	}
		for(i=0;i<n;i++)
			free(rez[i]);
		free(rez);
		getch();
}
