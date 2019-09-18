#include <math.h>
double ecuatie1(double x)
{
    return pow(2,x);
}
double ecuatie2(double x)
{
    return 1/x;
}
double trapez(double a, double b,double (*pe)(double), int n)
{
    double rez;
    int i;
    double l;
    l=(b-a)/n;
    rez=0;
    for(i=1;i<n;i++)
        rez= rez+(*pe)(a+i*l);
    rez= rez+(*pe)(a)/2+(*pe)(b)/2;
    rez*=l;
    return rez;
}
int main(void)
{
    double (*pe)(double);
    pe=ecuatie1;
    //double integrala;
    double a,b;
    int n;
    scanf("%lf%lf%d",&a,&b,&n);
    printf("%lf\n",trapez(a,b,pe,n));
    getch();
}
