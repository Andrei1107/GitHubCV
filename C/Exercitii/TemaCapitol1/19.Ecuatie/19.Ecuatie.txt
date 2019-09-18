/* 19. Sã se scrie funcþia pentru aproximarea valorii soluþiei unei ecuaþii algebrice transcendente prin metoda tangentei.*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <conio.h>


double f(double x)
{
 return 4.5*cos(x/3)*cos(x/3)-x/4;
}
double newton(double (*f) (double), double x0)
{
double p=1.0,eps,x,df;
int k;
//Calculul preciziei masinii si a valorii eps
 do
p=p/2.0;
 while(p+1.0!=1.0);
 eps=pow(p,1/3.0);
 printf("p= %.20lf\teps= %.20lf",p,eps);
//Calculul solutiei
 x=x0;
 k=0;
 do
 {
 k++;
 x0=x;
 //calculul numeric al derivatei prin CDM
 df=(f(x+eps)-f(x-eps))/2/eps;
 //evitarea cazului in care df este zero
 if(df==0)
df=eps;
 //actualizarea solutiei
 x=x0-f(x)/df;
 printf("\nIteratia: %d: x= %15.12lf",k,x);

if(k>20)
 {
printf("\nNu converge!");
exit(1);
 }
 }
while(x!=x0);
 printf("\nSolutia ecuatiei este %15.12lf\nNr. de iteratii: %d",x,k);
 return x;
}
int main ()
{
 double x0,x;
 int k;
 printf("Solutia initiala: x0= ");
 scanf("%lf",&x0);
 newton(f,x0);
 while(!_kbhit());
 return 0;
}
