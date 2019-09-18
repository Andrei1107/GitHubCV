#include <iostream>
using namespace std;

class Produs
{
private:
	int* istoricPreturi;
	int nrPreturi;
	const int codProdus;
public:

	Produs(int codProd) :codProdus(codProd)
	{

		this->istoricPreturi = NULL;
		this->nrPreturi = 0;
	}

	Produs(int codProdus, int* istoricPreturi, int nrPreturi) :codProdus(codProdus)
	{
		this->nrPreturi = nrPreturi;
		this-> istoricPreturi = new int[this->nrPreturi + 1];
		for (int i = 0; i < this->nrPreturi; i++)
		{
			this->istoricPreturi[i] = istoricPreturi[i];

		}

	}

	Produs(const Produs& p):codProdus(p.codProdus)
	{
		this->nrPreturi = p.nrPreturi;
		this->istoricPreturi = new int[p.nrPreturi + 1];
		for (int i = 0; i < p.nrPreturi; i++)
		{
			this->istoricPreturi[i] = p.istoricPreturi[i];

		}
	

	}






	int getNrPreturi()
	{
		return this->nrPreturi;

	}








};











void main()
{
	Produs p1(102);

	cout << p1.getNrPreturi()<<endl;
	int preturi[]{ 100,150,125,150,130 };
	Produs p2(104, preturi, 5);
	cout <<" \n"<< p2.getNrPreturi() << " ";

	Produs p3 = p2;
	//cout << p3.getCodProd() << endl;

	//int preturi2[]{ 500,525,400,450 };
	//p1.setPreturi(preturi2, 4);
	//cout << p1.getNrPreturi() << endl;



	//p3 = p1;

	//int pretMax = p3.getPretMaxim();
	//cout << pretMax << endl;

	//Produs p4(110);
	//cout << p4.getPretMaxim() << endl;

	//Produs* pp1 = new Produs(109);  //pointer la obiect,tre' sa alocam zona de memorie pt acel obiect!!!!!!!(new Produs)

	//*pp1 = p1;

	//cout << *pp1 << endl;
	//delete pp1;

	//int pretUltim = (int)p1;
	//cout << "\n" << pretUltim;

	//cout << endl;
	//p1 = ++p3;
	//cout << p1 << p3;


	//p4.setPreturi(preturi, 5);

	//if (p1 == p4)  //s-a aplicat automat cast pt ca n am implementat ==,in loc de p1 a luat cast ul la int,daca scriam explicit operator int,nu mai mergea operatorul == pt ca trebuia implementat
	//{
	//	cout << "Pretul mediu al lui p1 este egal cu p4";
	//}
	//else {
	//	cout << "Pretul mediu al lui p4 este egal cu p1";
	//}







}