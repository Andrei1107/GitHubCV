//Aplicatie de gestiunea bugetului
//clase:cheltuieli:alimentare,utilitare,intretinere,total_cheltuieli_data , total_cheltuieli_alimentare,utilitare,total_ch_lunare,total_ch_anuale
//   buget
//
//functii:


#include <iostream>
#include<fstream>

using namespace std;
#pragma warning(disable:4996)

//gestiunea bugetului familiei
class cheltuieliocazionale
{
private:
	char* denocazie;
	float bugetocazie;
	float pret;
	int ziocazie[25];
	int perocazie;

public:
	cheltuieliocazionale()
	{
		this->denocazie = NULL;
		this->bugetocazie = 0;
		this->pret = 0;
		this->perocazie = 0;

		for (int i = 0; i < 25; i++)
		{
			this->ziocazie[i] = 0;
		}


	}
	cheltuieliocazionale(char* denocazie, float bugetocazie, float pret, int perocazie, int ziocazie[25])
	{

		this->denocazie = new char[strlen(denocazie) + 1];
		strcpy(this->denocazie, denocazie);

		this->bugetocazie = bugetocazie;
		this->pret = pret;
		this->perocazie = perocazie;

		for (int i = 0; i < 15; i++)
		{
			this->ziocazie[i] = ziocazie[i];
		}

	}


	cheltuieliocazionale(const cheltuieliocazionale& o)
	{


		this->denocazie = new char[strlen(o.denocazie) + 1];
		strcpy(this->denocazie, o.denocazie);

		this->bugetocazie = o.bugetocazie;
		this->pret = o.bugetocazie;
		this->perocazie = o.perocazie;

		for (int i = 1; i <= o.perocazie; i++)
		{
			this->ziocazie[i] = o.ziocazie[i];
		}

	}

	float getbuget()
	{
		return this->bugetocazie;
	}
	void setbuget(float bugetnou)
	{
		if (bugetnou>0)
		{
			this->bugetocazie = bugetnou;
		}


	}
	bool operator==(cheltuieliocazionale o)
	{
		if (this->pret == o.pret)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	float getpret()
	{
		return this->pret;
	}

	void setpret(float pretnou)
	{
		if (pretnou > 0)
		{
			this->pret = pretnou;
		}
	}

	char* getnume()
	{
		return this->denocazie;
	}
	void setnume(char* numenou)
	{

		if (this->denocazie)
		{
			delete[] this->denocazie;
		}
		this->denocazie = numenou;
	}


	int gettimp()
	{
		return this->perocazie;

	}

	void settimp(int timpnou)
	{
		if (timpnou > 0)
		{
			this->perocazie = timpnou;
		}

	}


	int getzi()
	{

		return *this->ziocazie;
	}
	void setzi(int zinoua[15])
	{

		for (int i = 0; i < 15; i++)
		{
			this->ziocazie[i] = zinoua[i];

		}
	}
	float bugetnou()
	{
		this->bugetocazie -= this->pret;

		return bugetocazie;
	}
	cheltuieliocazionale operator++()
	{
		this->pret++;
		return *this;

	}
	cheltuieliocazionale operator++(int i)
	{
		cheltuieliocazionale temp = *this;
		this->pret++;
		return temp;

	}




	cheltuieliocazionale operator+(cheltuieliocazionale &o)                  //  +    //
	{
		cheltuieliocazionale temp = *this;
		temp.bugetocazie += o.bugetocazie;
		return temp;

	}
	explicit operator float()
	{
		return bugetocazie / pret;
	}
	bool operator>(cheltuieliocazionale o)
	{
		if (this->bugetocazie >o.bugetocazie)
		{
			return true;
		}
		else
			return false;
	}

	int& operator[](int i)
	{

		return this->ziocazie[i];

	}
	void operator!()
	{
		this->bugetocazie = 0;
	}






	friend ostream& operator << (ostream&, cheltuieliocazionale);
	friend istream& operator >> (istream&, cheltuieliocazionale&);

	cheltuieliocazionale& operator=(const cheltuieliocazionale& o)
	{
		if (denocazie)
		{
			delete[] denocazie;
		}


		this->bugetocazie = o.bugetocazie;
		this->pret = o.pret;
		this->perocazie = o.perocazie;
		for (int i = 1; i <= o.perocazie; i++)
		{
			this->ziocazie[i] = o.ziocazie[i];

		}

		return *this;
	}



	~cheltuieliocazionale()
	{

		if (this->denocazie != NULL)
		{
			delete[] denocazie;

		}
	}





};


ostream& operator << (ostream& out, cheltuieliocazionale o)
{
	out << "Numele ocaziei este: " << o.denocazie << endl;
	out << "Bugetul ocaziei este : " << o.bugetocazie << endl;
	out << "Pretul ocaziei este : " << o.pret << endl;

	for (int i = 1; i <= o.perocazie; i++)
	{
		out << "Timpul pentru ziua " << i << " este " << o.ziocazie[i] << endl;
	}




	return out;
}


istream& operator >> (istream& in, cheltuieliocazionale& o)
{
	if (o.denocazie != NULL)
	{
		delete[] o.denocazie;
	}
	char buffer[50];
	cout << "Numele ocaziei este: "; in.get(buffer, 50);
	o.denocazie = new char[strlen(buffer) + 1];
	strcpy(o.denocazie, buffer);

	cout << "Bugetul ocaziei este: ";
	in >> o.bugetocazie;

	cout << "Pretul ocaziei este: ";
	in >> o.pret;
	cout << "Numar de zile ocazie:";
	in >> o.perocazie;

	for (int i = 1; i <= o.perocazie; i++)
	{
		cout << "In ziua " << i << " timpul necesar renovarii(ore) a fost: ";
		in >> o.ziocazie[i];


	}


	return in;


}


class cheltuieliconcediu
{
private:
	char* destinatie;   //unde am mers
	int timpconcediu;//cat am stat
	float pretconcediu;//cat am cheltuit
	float bugetul;
	int notamancare[12];

public:

	cheltuieliconcediu()
	{

		this->timpconcediu = 0;



		this->bugetul = 0;
		this->destinatie = 0;
		this->pretconcediu = 0;
		for (int i = 0; i < 12; i++)
		{
			this->notamancare[i] = 0;
		}

	}

	cheltuieliconcediu(int timpconcediu, float bugetul, char* destinatie, float pretconcediu, int notamancare[12])
	{


		this->timpconcediu = timpconcediu;

		this->bugetul = bugetul;
		this->destinatie = new char[strlen(destinatie) + 1];
		strcpy(this->destinatie, destinatie);
		this->pretconcediu = pretconcediu;

		for (int i = 0; i < 10; i++)
		{
			this->notamancare[i] = notamancare[i];

		}

	}

	cheltuieliconcediu(const cheltuieliconcediu& c)
	{


		this->timpconcediu = c.timpconcediu;

		this->bugetul = c.bugetul;
		this->destinatie = new char[strlen(c.destinatie) + 1];
		strcpy(this->destinatie, c.destinatie);
		this->pretconcediu = c.pretconcediu;

		for (int i = 0; i < 12; i++)
		{
			this->notamancare[i] = c.notamancare[i];
		}


	}

	/*int prelungireconcediu()
	{
	this->timpconcediu += 2;
	return this-> timpconcediu;

	}*/

	cheltuieliconcediu&operator =(const cheltuieliconcediu& c)
	{
		this->bugetul = c.bugetul;
		if (this->destinatie != NULL)
		{
			delete[] this->destinatie;
		}

		this->destinatie = new char[strlen(c.destinatie) + 1];
		strcpy(this->destinatie, c.destinatie);

		this->timpconcediu = c.timpconcediu;

		this->pretconcediu = c.pretconcediu;

		for (int i = 0; i < 10; i++)
		{
			this->notamancare[i] = c.notamancare[i];
		}

		return *this;
	}

	cheltuieliconcediu operator+(cheltuieliconcediu &c)                  //  +    //
	{
		cheltuieliconcediu temp = *this;
		temp.timpconcediu += c.timpconcediu;
		return temp;

	}

	cheltuieliconcediu operator++()
	{
		this->pretconcediu++;
		return *this;

	}
	cheltuieliconcediu operator++(int i)
	{
		cheltuieliconcediu temp = *this;
		this->pretconcediu++;
		return temp;

	}

	bool operator==(cheltuieliconcediu c)
	{
		if (this->timpconcediu == c.timpconcediu)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	bool operator>(cheltuieliconcediu c)
	{
		if (this->pretconcediu > c.pretconcediu)
		{
			return true;
		}
		else {
			return false;
		}

	}

	explicit operator float()
	{
		return bugetul / timpconcediu;
	}


	void operator!()
	{
		this->bugetul = 0;
	}




	int& operator [](int i)
	{
		if (i >= 0 && i < 10)
		{
			return this->notamancare[i];
		}
	}










	float noulbuget()
	{
		this->bugetul -= this->pretconcediu;
		return this->bugetul;

	}








	void setbuget(float bugetnou)
	{
		if (bugetnou >= 0)
		{
			this->bugetul = bugetnou;

		}
		else
		{
			cout << "Nu ati introdus corect bugetul" << endl;
		}
	}
	float getbuget()
	{
		return this->bugetul;
	}

	int gettimpconcediu()
	{
		return this->timpconcediu;
	}
	void settimpconcediu(int timpnou)
	{
		if (timpnou >= 0)
		{


			this->timpconcediu = timpnou;
		}
		else
		{
			cout << "Reintroduce ti timpul:";
		}


	}
	float getpret()
	{
		return this->pretconcediu;
	}
	void setpret(float pretnou)
	{
		if (pretnou >= 0)
		{
			this->pretconcediu = pretnou;
		}
		else {

			cout << "Pretul nu este corect!" << endl;
		}


	}



	char* getdestinatie()
	{
		return this->destinatie;
	}
	void setdestinatie(char* destinatienoua)
	{
		if (this->destinatie)
		{
			delete[] this->destinatie;

		}
		this->destinatie = new char[strlen(destinatienoua) + 1];
		strcpy(this->destinatie, destinatienoua);

	}

	int getnotamancare()
	{
		return *this->notamancare;

	}
	void setnota(int notanoua[10])
	{
		for (int i = 0; i < 11; i++)
		{
			this->notamancare[i] = notanoua[i];
		}

	}

	~cheltuieliconcediu()
	{
		if (this->destinatie)
		{
			delete[] this->destinatie;
		}
	}



	friend ostream& operator<<(ostream&, cheltuieliconcediu);
	friend istream& operator >> (istream&, cheltuieliconcediu&);

};
istream& operator >> (istream& in, cheltuieliconcediu& c)
{

	char buffer[50];
	if (c.destinatie != NULL)
	{
		delete[]c.destinatie;
	}
	cout << " Destinatia este: "; in.get(buffer, 50);
	c.destinatie = new char[strlen(buffer) + 1];
	strcpy(c.destinatie, buffer);

	cout << "Bugetul: ";
	in >> c.bugetul;
	cout << endl;
	cout << "Timpul: ";

	in >> c.timpconcediu;

	cout << endl;
	cout << "Pretul: ";
	in >> c.pretconcediu;
	cout << endl;

	for (int i = 0; i < c.timpconcediu; i++)
	{
		cout << "Nota adresata mancarii " << " pentru ziua  " << i << " este ";
		in >> c.notamancare[i];

	}


	return in;
}







ostream& operator<<(ostream& out, cheltuieliconcediu c)
{
	out << "Destinatia :" << c.destinatie << endl;
	out << "Bugetul este:" << c.bugetul << endl;
	out << "Timpul(zile):" << c.timpconcediu << endl;
	out << "Pretul:" << c.pretconcediu << endl;

	for (int i = 0; i < c.timpconcediu; i++)
	{
		out << "Nota  " << i << " este  de  " << c.notamancare[i] << endl;
		out << endl;
	}

	return out;
}






















class cheltuielirenovare
{
private:
	float buget;
	float pret;
	char* numecamera;//camera ce va fi renovata
	int zi[15];
	int timp;

public:
	cheltuielirenovare()
	{
		this->numecamera = NULL;
		this->buget = 0;
		this->pret = 0;
		this->timp = 0;

		for (int i = 0; i < 15; i++)
		{
			this->zi[i] = 0;
		}


	}
	cheltuielirenovare(char* numecamera, float buget, float pret, int timp, int zi[15])
	{

		this->numecamera = new char[strlen(numecamera) + 1];
		strcpy(this->numecamera, numecamera);

		this->buget = buget;
		this->pret = pret;
		this->timp = timp;

		for (int i = 0; i < 15; i++)
		{
			this->zi[i] = zi[i];
		}

	}


	cheltuielirenovare(const cheltuielirenovare& r)
	{


		this->numecamera = new char[strlen(r.numecamera) + 1];
		strcpy(this->numecamera, r.numecamera);

		this->buget = r.buget;
		this->pret = r.pret;
		this->timp = r.timp;

		for (int i = 1; i <= r.timp; i++)
		{
			this->zi[i] = r.zi[i];
		}

	}

	float getbuget()
	{
		return this->buget;
	}
	void setbuget(float bugetnou)
	{
		if (bugetnou>0)
		{
			this->buget = bugetnou;
		}


	}
	bool operator==(cheltuielirenovare r)
	{
		if (this->pret == r.pret)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	float getpret()
	{
		return this->pret;
	}

	void setpret(float pretnou)
	{
		if (pretnou > 0)
		{
			this->pret = pretnou;
		}
	}

	char* getnume()
	{
		return this->numecamera;
	}
	void setnume(char* numenou)
	{

		if (this->numecamera)
		{
			delete[] this->numecamera;
		}
		this->numecamera = numenou;
	}


	int gettimp()
	{
		return this->timp;

	}

	void settimp(int timpnou)
	{
		if (timpnou > 0)
		{
			this->timp = timpnou;
		}

	}


	int getzi()
	{

		return *this->zi;
	}
	void setzi(int zinoua[15])
	{

		for (int i = 0; i < 15; i++)
		{
			this->zi[i] = zinoua[i];

		}
	}
	float bugetnou()
	{
		this->buget -= this->pret;

		return buget;
	}
	cheltuielirenovare operator++()
	{
		this->pret++;
		return *this;

	}
	cheltuielirenovare operator++(int i)
	{
		cheltuielirenovare temp = *this;
		this->pret++;
		return temp;

	}




	cheltuielirenovare operator+(cheltuielirenovare &r)                  //  +    //
	{
		cheltuielirenovare temp = *this;
		temp.buget += r.buget;
		return temp;

	}
	explicit operator float()
	{
		return buget / pret;
	}
	bool operator>(cheltuielirenovare r)
	{
		if (this->buget >r.buget)
		{
			return true;
		}
		else
			return false;
	}

	int& operator[](int i)
	{

		return this->zi[i];

	}
	void operator!()
	{
		this->buget = 0;
	}






	friend ostream& operator << (ostream&, cheltuielirenovare);
	friend istream& operator >> (istream&, cheltuielirenovare&);

	cheltuielirenovare& operator=(const cheltuielirenovare& r)
	{
		if (numecamera)
		{
			delete[] numecamera;
		}


		this->buget = r.buget;
		this->pret = r.pret;
		this->timp = r.timp;
		for (int i = 1; i <= r.timp; i++)
		{
			this->zi[i] = r.zi[i];

		}

		return *this;
	}











	~cheltuielirenovare()
	{

		if (this->numecamera != NULL)
		{
			delete[] numecamera;

		}
	}





};


ostream& operator << (ostream& out, cheltuielirenovare r)
{
	out << "Numele camerei este: " << r.numecamera << endl;
	out << "Bugetul este : " << r.buget << endl;
	out << "Pretul este : " << r.pret << endl;

	for (int i = 1; i <= r.timp; i++)
	{
		out << "Timpul pentru ziua " << i << " este " << r.zi[i] << endl;
	}




	return out;
}


istream& operator >> (istream& in, cheltuielirenovare& r)
{
	if (r.numecamera != NULL)
	{
		delete[] r.numecamera;
	}
	char buffer[50];
	cout << "Numele camerei este: "; in.get(buffer, 50);
	r.numecamera = new char[strlen(buffer) + 1];
	strcpy(r.numecamera, buffer);

	cout << "Bugetul este: ";
	in >> r.buget;

	cout << "Pretul este: ";
	in >> r.pret;
	cout << "Numarul de zile necesar renovarii:";
	in >> r.timp;

	for (int i = 1; i <= r.timp; i++)
	{
		cout << "In ziua " << i << " timpul necesar renovarii(ore) a fost: ";
		in >> r.zi[i];


	}


	return in;


}









class cheltuieliUtilitare    // sa nu uit sa fac un vector alocat static
{
private:
	float bugettotal;

	int numarfacturi;

	char** tiputilitate;
	int *pret;
	int *cantitateconsumata;
	const int idutilitate;
	int zi;
	int luna;
	int an;

public:
	static int y;
	//constructor default:
	cheltuieliUtilitare() :idutilitate(0)
	{
		this->numarfacturi = 4;



		this->bugettotal = 0;



		this->tiputilitate = NULL;
		this->pret = 0;
		this->cantitateconsumata = 0;
		this->zi = 1;
		this->luna = 1;
		this->an = 2017;

		y++;
	}
	//constructor cu parametrii:
	cheltuieliUtilitare(float bugettotal, int numarfacturi, char **tiputilitate, int *pret, int* cantitateconsumata, int zi, int luna, int an) :idutilitate(1)
	{
		this->bugettotal = bugettotal;


		this->numarfacturi = numarfacturi;

		this->tiputilitate = new char*[numarfacturi];
		for (int i = 0; i < numarfacturi; i++)
		{
			this->tiputilitate[i] = new char[strlen(tiputilitate[i]) + 1];
		}
		this->pret = new int[numarfacturi];
		this->cantitateconsumata = new int[numarfacturi];
		for (int i = 0; i < numarfacturi; i++)
		{

			strcpy(this->tiputilitate[i], tiputilitate[i]);
			this->pret[i] = pret[i];
			this->cantitateconsumata[i] = cantitateconsumata[i];
		}
		this->zi = zi;
		this->luna = luna;
		this->an = an;
		y++;
	}
	//constructor de copiere
	cheltuieliUtilitare(const cheltuieliUtilitare& u) :idutilitate(3)
	{
		this->numarfacturi = u.numarfacturi;

		this->bugettotal = u.bugettotal;
		this->numarfacturi = u.numarfacturi;


		this->tiputilitate = new char*[u.numarfacturi];
		for (int i = 0; i < u.numarfacturi; i++)
		{
			this->tiputilitate[i] = new char[strlen(u.tiputilitate[i]) + 1];
		}
		this->pret = new int[u.numarfacturi];
		this->cantitateconsumata = new int[u.numarfacturi];
		for (int i = 0; i < u.numarfacturi; i++)
		{
			this->tiputilitate[i] = new char[strlen(tiputilitate[i]) + 1];
		}
		for (int i = 0; i < u.numarfacturi; i++)
		{
			strcpy(this->tiputilitate[i], u.tiputilitate[i]);
			this->pret[i] = u.pret[i];
			this->cantitateconsumata[i] = u.cantitateconsumata[i];
		}

		this->zi = u.zi;
		this->luna = u.luna;
		this->an = u.an;
		y++;
	}
	void operator ! ()
	{
		this->zi = 2000;
	}


	void setbuget(float bugetnou)
	{
		if (bugetnou >= 0)
		{
			this->bugettotal = bugetnou;
		}
		else
		{
			cout << "Va rugam introduceti un buget mai mare" << endl;
		}
	}

	float getbuget()
	{
		return this->bugettotal;
	}


	char** gettiputilitate()
	{
		return this->tiputilitate;
	}
	int getpret()
	{
		return *this->pret;
	}

	//operator [ ]
	int& operator[](int i)
	{

		return this->pret[i];

	}
	int getnumarfacturi()
	{
		return this->numarfacturi;
	}
	void setnumar(int numarnoufacturi)
	{
		if (numarnoufacturi > 0)
		{
			this->numarfacturi = numarnoufacturi;
		}
		else
		{
			cout << "  Reintroduceti numarul de facturi:";
		}
	}
	//operator cast
	explicit operator float()
	{
		return bugettotal / numarfacturi;
	}
	// operator !

	//operator >
	bool operator>(cheltuieliUtilitare u)
	{
		if (this->bugettotal >u.bugettotal)
		{
			return true;
		}
		else
			return false;
	}
	//operator ==
	bool operator==(cheltuieliUtilitare u)
	{
		if (this->zi == u.zi)
		{
			return true;
		}
		else
		{
			return false;
		}
	}



	// operator +
	cheltuieliUtilitare operator + (cheltuieliUtilitare& u)
	{
		cheltuieliUtilitare temp = *this;
		temp.bugettotal = temp.bugettotal + u.bugettotal;
		return temp;
	}

	cheltuieliUtilitare operator ++ ()
	{
		this->bugettotal++;
		return *this;
	}
	cheltuieliUtilitare operator ++ (int i)
	{
		cheltuieliUtilitare temp = *this;
		this->bugettotal++;
		return temp;
	}



	void setnumarfacturi(int numarnoufacturi)
	{
		if (numarnoufacturi > 0)
		{
			this->numarfacturi = numarnoufacturi;
		}
		else
		{
			cout << "Cate facturi doriti sa mai platiti?:";
		}
	}
	int getan()
	{
		return this->an;
	}


	// operatorul =
	cheltuieliUtilitare& operator=(const cheltuieliUtilitare& u)
	{

		if (tiputilitate)
		{
			for (int i = 0; i < numarfacturi; i++)
			{
				delete[] tiputilitate[i];
			}
			delete[] tiputilitate;
		}
		if (pret)
		{
			delete[] pret;
		}
		if (cantitateconsumata)
		{
			delete[] cantitateconsumata;
		}
		this->numarfacturi = u.numarfacturi;

		this->bugettotal = u.bugettotal;
		this->numarfacturi = u.numarfacturi;

		if (u.cantitateconsumata)
		{

			this->tiputilitate = new char*[numarfacturi];
			for (int i = 0; i < numarfacturi; i++)
			{
				this->tiputilitate[i] = new char[strlen(u.tiputilitate[i]) + 1];
			}
			this->pret = u.pret;
			this->cantitateconsumata = u.cantitateconsumata;
			for (int i = 0; i < u.numarfacturi; i++)
			{

				strcpy(this->tiputilitate[i], u.tiputilitate[i]);
				this->pret[i] = u.pret[i];
				this->cantitateconsumata[i] = u.cantitateconsumata[i];
			}
			this->zi = u.zi;
			this->luna = u.luna;
			this->an = u.an;
		}
		return *this;
	}

	friend ostream& operator << (ostream&, cheltuieliUtilitare);
	friend istream& operator >> (istream&, cheltuieliUtilitare&);

	float getBugettotal()
	{
		return this->bugettotal;
	}


	int getTotalPret()
	{
		int totalpret = 0;
		for (int i = 0; i < this->numarfacturi; i++)
		{
			totalpret += this->pret[i];
		}
		return totalpret;
	}






	//destructor
	~cheltuieliUtilitare()
	{

		if (this->tiputilitate != NULL)
			for (int i = 0; i < this->numarfacturi; i++)
			{
				delete[] this->tiputilitate[i];
			}
		delete[] this->tiputilitate;
		if (this->pret)
		{
			delete[] this->pret;
		}
		if (this->cantitateconsumata)
		{
			delete[] this->cantitateconsumata;
		}
	}

};
int cheltuieliUtilitare::y = 0;

// operatorul >>
istream& operator >> (istream& in, cheltuieliUtilitare& u)
{

	if (u.tiputilitate)
	{
		for (int i = 0; i < u.numarfacturi; i++)
		{
			delete[] u.tiputilitate[i];
		}
		delete[] u.tiputilitate;
	}
	if (u.pret)
	{
		delete[] u.pret;
	}
	if (u.cantitateconsumata)
	{
		delete[] u.cantitateconsumata;
	}






	cout << "Introduceti bugetul";
	in >> u.bugettotal;
	cout << " Bugetul este: " << u.bugettotal << endl;
	cout << endl;
	cout << " Numarul de facturi: ";
	in >> u.numarfacturi;

	u.pret = new int[u.numarfacturi];
	u.cantitateconsumata = new int[u.numarfacturi];


	u.tiputilitate = new char*[u.numarfacturi];
	char buffer1[100];

	for (int i = 0; i < u.numarfacturi; i++)
	{

		cout << " Tipul Utilitatii:(apa,gaze ,etc..) " << i << " este: ";
		in >> buffer1;
		cout << endl;
		u.tiputilitate[i] = new char[strlen(buffer1) + 1];
		strcpy(u.tiputilitate[i], buffer1);
		cout << " pretul utilitatii  " << i << " este: ";
		in >> u.pret[i];
		cout << endl;
		cout << " Consumul facturii  " << i << " este: ";
		in >> u.cantitateconsumata[i];
		cout << endl;
	}
	cout << " ziua este: ";
	in >> u.zi;
	cout << endl;
	cout << " luna este: ";
	in >> u.luna;
	cout << endl;
	cout << " anul este: ";
	in >> u.an;
	cout << endl;
	return in;
}


//operatorul <<
ostream& operator << (ostream& out, cheltuieliUtilitare u)
{
	out << endl;



	if (u.cantitateconsumata != NULL)
	{
		for (int i = 0; i < u.numarfacturi; i++)
		{

			out << " Tipul facturii  " << i << " este " << u.tiputilitate[i] << endl;
			out << " Pretul produsului " << i << " este " << u.pret[i] << endl;
			out << " Consumul facturii (kW,cm^3,etc) " << i << " este " << u.cantitateconsumata[i] << endl;
		}
	}
	out << " Ziua este: " << u.zi << endl;
	out << " Luna este: " << u.luna << endl;
	out << " Anul este: " << u.an << endl;
	out << endl;
	return out;
}



class cheltuieli_alimentare
{

private:
	char* nume_familie;
	

	int zi;
	int luna;
	int an;
	const	int TVA = 16;
	float noul_buget;
	const float sumaoct = 140;

	char luna1[10] = "Ianuarie";
	char luna2[10] = "Februarie";
	char luna3[10] = "Martie";
	char luna4[10] = "Aprilie";
	char luna5[10] = "Mai";
	char luna6[10] = "Iunie";
	char luna7[10] = "Iulie";
	char luna8[10] = "August";
	char luna9[11] = "Septembrie";
	char luna10[10] = "Octombrie";



	int suma;
	float buget;


public:
	cheltuieli_alimentare() :noul_buget(noul_buget)     //constructorul fara parametrii
	{
		nume_familie = new char[strlen("Necunoscut") + 1];
		strcpy(nume_familie, "Necunoscut");

		zi = 0;
		luna = 0;
		suma = 200;

		an = 0;
	}





	cheltuieli_alimentare(char *nf, int z, int l, int s, int a) :noul_buget(noul_buget)    //constructor cu parametrii
	{
		this->nume_familie = new char[strlen(nf) + 1];
		strcpy(nume_familie, nf);


		zi = z;
		luna = l;
		suma = s;

		an = a;
	}




	cheltuieli_alimentare(const cheltuieli_alimentare& al) : noul_buget(noul_buget)    //constructorul de copiere
	{
		this->nume_familie = new char[strlen(al.nume_familie) + 1];
		strcpy(this->nume_familie, al.nume_familie);
		this->luna = al.luna;
		this->zi = al.zi;
		this->suma = al.suma;

		this->an = al.an;

	}

	/*cheltuieli_alimentare(const cheltuieli_alimentare& al2)
	{
	this->nume_familie = new char[strlen(al2.nume_familie) + 1];
	strcpy(this->nume_familie, al2.nume_familie);
	this->luna = al2.luna;
	this->zi = al2.zi;
	this->suma = al2.suma;
	this->buget = al2.buget;
	this->an = al2.an;


	}*/
	int get_zi()
	{
		return this->zi;

	}
	int get_luna()
	{
		return this->luna;
	}
	int get_an()
	{
		return this->an;
	}
	char get_luna1()
	{
		return *this->luna1;

	}


	int set_zi(int z)
	{
		this->zi = z;
		return z;
	}
	int set_luna(int l)
	{
		this->luna = l;
		return l;
	}
	int set_an(int a)
	{
		this->an = a;
		return a;
	}

	float get_buget()
	{
		return this->buget;

	}
	float set_buget(float b)
	{
		this->buget = b;
		return b;
	}

int	 getsuma()
	{
		return this->suma;
	}
	float set_suma(float s)
	{
		this->suma = s;

	}


	void generareRaport(char* numeFisier)
	{
		//declarare + deschidere fisier binar
		ofstream fisier;
		fisier.open(numeFisier, ios::out | ios::binary);
		if (fisier.is_open())
		{
			fisier.write(this->nume_familie, sizeof(cheltuieli_alimentare::nume_familie));
			fisier.write((char*)&this->suma, sizeof(int));
			fisier.write((char*)this->zi, sizeof(cheltuieli_alimentare::zi));
			fisier.write((char*)this->luna, sizeof(cheltuieli_alimentare::luna));
			fisier.write((char*)this->an, sizeof(cheltuieli_alimentare::an));
		}

		fisier.close();
	}

	

	cheltuieli_alimentare operator+(cheltuieli_alimentare& ch)   //operator +
	{

		cheltuieli_alimentare alsum = *this;
		alsum.suma += ch.TVA;
		return alsum;
	}




	~cheltuieli_alimentare()
	{
		delete[] this->nume_familie;

	}







	cheltuieli_alimentare& operator=(const cheltuieli_alimentare& al2)
	{
		if (this->nume_familie != NULL)
		{
			delete[] this->nume_familie;
		}
		if (al2.nume_familie != NULL)
		{

			this->nume_familie = new char[strlen(al2.nume_familie) + 1];
			strcpy(this->nume_familie, al2.nume_familie);
		}
		else {

			this->nume_familie = NULL;
			this->zi = al2.zi;
			this->luna = al2.luna;
			this->buget = al2.buget;
			this->suma = al2.suma;
			this->an = al2.an;
			this->luna1[10] = al2.luna1[10];
		}
		return *this;

	}

	int bugetul()
	{
		this->suma = 100;
		this->noul_buget = this->buget - this->suma;

		return noul_buget;
	}


	void registru();

	cheltuieli_alimentare operator-(int bugetoct)       //operator -
	{
		cheltuieli_alimentare rezbug = *this;
		rezbug.noul_buget = rezbug.buget - bugetoct;
		return rezbug;

	}

	void scrieInFB(ostream& f)
	{
		f.write(this->nume_familie, sizeof(cheltuieli_alimentare::nume_familie));
		f.write((char*)this->zi, sizeof(cheltuieli_alimentare::zi));
		f.write((char*)this->luna, sizeof(cheltuieli_alimentare::luna));
		f.write((char*)this->an, sizeof(cheltuieli_alimentare::an));
		f.write((char*)this->suma, sizeof(cheltuieli_alimentare::suma));


	}




	friend istream& operator >> (istream& in, cheltuieli_alimentare& al);
	friend ostream& operator <<(ostream& out, cheltuieli_alimentare al);
	friend ofstream& operator <<(ofstream& out,const cheltuieli_alimentare& al);
	friend ifstream& operator >> (ifstream& in, cheltuieli_alimentare& al);
	void afisare();


};

ostream& operator <<(ostream& out, cheltuieli_alimentare al)
{
	if (al.nume_familie != NULL) {
		out << "\nNume familie: " << al.nume_familie;
	}
	else {
		out << "\n Nume familie: -- ";
	}
	if (al.suma != NULL)
	{
		out << "\nSuma:      " << al.suma << "  lei";

	}
	else {
		out << "\n\n Suma:--";
	}
	if (al.zi != NULL)
	{
		out << "\n\nZi: " << al.zi;
	}
	else {
		out << "\n\nZi:--";
	}
	if (al.zi > 32)
	{
		out << "\n\nZiua nu este valabila";
	}

	if (al.luna != NULL)
	{
		out << "\n\nLuna: " << al.luna;
	}
	else {
		out << "\n\nLuna:--";
	}
	if (al.luna > 12)
	{
		out << "\n\nLuna nu este valabila";
	}
	if (al.an != NULL)
	{
		out << "\n\nAn: " << al.an;
	}
	else {
		out << "\n\nAn:--";
	}


	return out;


}
ifstream& operator >> (ifstream& in, cheltuieli_alimentare& al)
{
	int b1;
	char buffer3[100];
	int modificabugetul;

	cout << "\n Introduceti numele familiei dumneavoastra:"; in.get(buffer3, 100);

	al.nume_familie = new char[strlen(buffer3) + 1];
	strcpy(al.nume_familie, buffer3);


	cout << "\n\nIntroduceti  bugetul lunii : ";
	in >> al.buget;
	cout << "Bugetul dumneavoastra: " << al.get_buget() << endl;
	cout << "Daca ati gresit introducerea bugetului ,il puteti modifica apasand tasta 1,daca nu,tasta 0:";
	cin >> modificabugetul;
	if (modificabugetul == 1)
	{

		cout << "Noul buget:";
		cin >> b1;
		cout << al.set_buget(b1);

		cout << endl;
		cout << "Noul buget: " << al.get_buget();
		cout << endl;
	}
	cout << "Zi:";
	if (al.zi > 31)
	{
		cout << "Ziua nu este valabila ";
		in >> al.zi;

	}
	in >> al.zi;




	cout << "\n\n An: "; in >> al.an;
	int alegere;
	int alegere2;

	cout << "Doriti sa achitati cheltuielile alimentare in valoare de 100 de lei?(Da=1/Nu=0)" << endl;
	cin >> alegere;
	if (alegere == 1)
	{
		cout << "Ati achitat cheltuielile alimentare pe luna Noiembrie!(cu TVA)" << endl;
		cout << "Familia " << al.nume_familie << " s-a achitat de cheltuielile alimentare" << endl;
		cout << "Data: " << al.zi << "." << al.luna << "." << al.an << endl;


		cout << "Buget disponibil: " << al.bugetul() << endl;
	}

	return in;
}

ofstream& operator<<(ofstream& out, const cheltuieli_alimentare& al)
{
	
	out << "Nume familie:" ;
	
	out << "\t\t\tSuma achitata:" ;

	out << "\t\t\tZi:" ;
	
	out << "\t\t\tLuna:" ;
	
	out << "\t\t\tAn:"<<endl ;
	out << al.nume_familie << "\t\t\t\t\t\t";
	out << al.suma << "\t\t\t\t\t";
	out << al.zi << "\t\t\t";
	out << al.luna << "\t\t\t\t";
	out << al.an << "\t\t\t\t\t\t";


	out << endl;


	return out;

}













void cheltuieli_alimentare::registru()
{

	cout << "Luna:                      ";
	cout << "Anul:                      ";
	cout << "Tipul cheltuielii:           ";
	cout << "Suma:     ";
	cout << "Nume familie: ";
	cout << endl;
	cout << this->luna1 << "  (1) ";
	cout << "           2017      ";
	cout << "         Cheltuiala alimentara            ";
	cout << "120              ";
	cout << "Oprea" << endl;
	cout << endl;
	cout << this->luna2 << "  (2) ";
	cout << "          2017                 ";
	cout << " Cheltuiala alimentara           ";
	cout << "  125             ";
	cout << "  Oprea" << endl;
	cout << endl;
	cout << this->luna3 << "  (3) ";
	cout << "             2017                   ";
	cout << "  Cheltuiala alimentara            ";
	cout << "  140              ";
	cout << "  Oprea" << endl;
	cout << endl;
	cout << this->luna4 << "   (4) ";
	cout << "          2017                   ";
	cout << " Cheltuiala alimentara            ";
	cout << "   120              ";
	cout << " Oprea" << endl;
	cout << endl;
	cout << this->luna5 << "    (5)  ";
	cout << "              2017                   ";
	cout << "   Cheltuiala alimentara            ";
	cout << "120              ";
	cout << " Oprea" << endl;
	cout << endl;
	cout << this->luna6 << "     (6) ";
	cout << "          2017              ";
	cout << "  Cheltuiala alimentara        ";
	cout << "     120        ";
	cout << "        Oprea" << endl;
	cout << endl;
	cout << this->luna7 << "   (7) ";
	cout << "            2017           ";
	cout << "  Cheltuiala alimentara            ";
	cout << "     120    ";
	cout << "          Oprea" << endl;
	cout << endl;
	cout << this->luna8 << "    (8) ";
	cout << "           2017                   ";
	cout << " Cheltuiala alimentara            ";
	cout << " 120              ";
	cout << " Oprea" << endl;
	cout << endl;
	cout << this->luna9 << " (9)  ";
	cout << "           2017                   ";
	cout << " Cheltuiala alimentara            ";
	cout << " 120              ";
	cout << " Oprea" << endl;
	cout << endl;
	cout << this->luna10 << "   (10)  ";
	cout << "           2017                   ";
	cout << "Cheltuiala alimentara            ";
	cout << "     " << this->sumaoct;
	cout << "Oprea" << endl;
	cout << endl;
	cout << "Noiembrie(" << this->luna << ")";
	cout << "              " << this->an;
	cout << "                Cheltuiala alimentara            ";
	cout << "                     " << this->suma;
	cout << "                   " << this->nume_familie << endl;
	cout << endl;
	// cout << this->luna4 << "                   ";
	cout << "2017                   ";
	cout << "Cheltuiala alimentara            ";
	cout << "120              ";
	cout << "Oprea" << endl;

}










istream& operator >> (istream& in, cheltuieli_alimentare& al)
{
	float b;
	int modificabuget;
	int negare, alegereg;

	if (al.nume_familie != NULL)
	{
		delete[] al.nume_familie;
	}
	char buffer[100];


	cout << "\n Introduceti numele familiei dumneavoastra:"; in.get(buffer, 100);

	al.nume_familie = new char[strlen(buffer) + 1];
	strcpy(al.nume_familie, buffer);


	cout << "\n\nIntroduceti  bugetul lunii Noiembrie: ";
	in >> al.buget;
	cout << "Bugetul dumneavoastra: " << al.get_buget() << endl;
	cout << "Daca ati gresit introducerea bugetului ,il puteti modifica apasand tasta 1,daca nu,tasta 0:";
	cin >> modificabuget;
	if (modificabuget == 1)
	{

		cout << "Noul buget:";
		cin >> b;
		cout << al.set_buget(b);

		cout << endl;
		cout << "Noul buget: " << al.get_buget();
		cout << endl;
		cout << "Zi:";
		if (al.zi > 31)
		{
			cout << "Ziua nu este valabila ";
			in >> al.zi;

		}
		in >> al.zi;


		cout << "\n\nLuna(noiembrie): "; in >> al.luna;


		cout << "\n\n An: "; in >> al.an;
		int alegere;
		int alegere2;

		cout << "Doriti sa achitati cheltuielile alimentare in valoare de 100 de lei?(Da=1/Nu=0)" << endl;
		cin >> alegere;
		if (alegere == 1)
		{
			cout << "Ati achitat cheltuielile alimentare pe luna Noiembrie!(cu TVA)" << endl;
			cout << "Familia " << al.nume_familie << " s-a achitat de cheltuielile alimentare" << endl;
			cout << "Data: " << al.zi << "." << al.luna << "." << al.an << endl;


			cout << "Buget disponibil: " << al.bugetul() << endl;
			cout << "Doriti sa vizualizati registrul pe acest an?(Da=1/Nu=0)";
			cin >> alegere2;
		}
		else if (alegere == 0)
		{
			cout << "Doriti sa vizualizati registrul pe acest an?(Da=1/Nu=0)";
			cin >> alegere2;

		}
		if (alegere2 == 1)
		{
			al.registru();



		}
	}
	else if (modificabuget == 0) {
		cout << "Zi:";
		if (al.zi > 31)
		{
			cout << "Ziua nu este valabila ";
			in >> al.zi;

		}
		in >> al.zi;


		cout << "\n\nLuna: "; in >> al.luna;


		cout << "\n\n An: "; in >> al.an;
		int alegere;
		int alegere2;

		cout << "Doriti sa achitati cheltuielile alimentare in valoare de 100 de lei?(Da=1/Nu=0)" << endl;
		cin >> alegere;
		if (alegere == 1)
		{
			cout << "Ati achitat cheltuielile alimentare pe luna Noiembrie!(cu TVA)" << endl;
			cout << "Familia " << al.nume_familie << " s-a achitat de cheltuielile alimentare" << endl;
			cout << "Data: " << al.zi << "." << al.luna << "." << al.an << endl;


			cout << "Buget disponibil: " << al.bugetul() << endl;
			cout << "Doriti sa vizualizati registrul pe acest an?(Da=1/Nu=0)";
			cin >> alegere2;
		}
		else if (alegere == 0)
		{
			cout << "Doriti sa vizualizati registrul pe acest an?(Da=1/Nu=0)";
			cin >> alegere2;

		}
		if (alegere2 == 1)
		{
			al.registru();



		}

	}
	cout << "Cheltuielile alimentare pentru luna Octombrie nu sunt platite!!!" << endl;
	cout << "Doriti sa achitati cheltuielile alimentare pentru luna Octombrie? (1-Da,2-Nu)" << endl;
	cin >> negare;

	if (negare == 1)
	{
		cout << "Ati achitat cheltuielile alimentare pentru luna Octombrie" << endl;
//############operatorul de negare################;

		cout << "Bugetul curent: " << al.bugetul() << endl;

		cout << "Doriti sa verificati registrul?(1-Da,0-Nu)";
		cin >> alegereg;
		if (alegereg == 1)
		{
			al.registru();
		}
	}


	return in;


}










//IN MAIN SUNT TOTATE SUPRAINCARCARILE,DAR PROGRAMUL INCEPE CU INTRODUCEREA DATELOR DE LA CLASA CHLTUIELI ALIMENTARE,PUTETI COMENTA ASTA
//PENTRU A VEDEA EFICIENTA SUPRAINCARCARILOR




void main()
{
	cheltuieli_alimentare ch;
	cheltuieli_alimentare ch1("Oprea",10,12,100,2017);
	cheltuieli_alimentare ch2("Nita", 11, 5, 250, 2017);
	cheltuieli_alimentare ch3("Cristescu", 15, 1, 300, 2016);
	cheltuieli_alimentare ch4("Ionescu", 20, 9, 400, 2017);
	cheltuieli_alimentare ch5("Lupuleasa", 26, 8, 120, 2017);

	cheltuieli_alimentare listacheltuieli[] = {ch1,ch2,ch3,ch4,ch5};


	ofstream falim;  //am declarat un obiect de tip ofstream
	falim.open("raportcheltuielialimentare.txt", ios::out);

	for (int i = 0; i < 5; i++) {

		falim << listacheltuieli[i];
	}
	falim.close();


	


	int alegere;
	int optiune1;

	cout << "MENIU" << endl;
	
	cout << "1.Cheltuieli alimentare" << endl;
	cout << "2.Cheltuieli concediu" << endl;
	cout << "3.Cheltuieli renovare" << endl;
	cout << "4.Cheltuieli utilitare" << endl;
	cout << "5.Cheltuieli ocazionale" << endl;
	cout << "Selectati tipul cheltuielii pe care doriti sa il gestionati:" ;
	cin >> alegere;

	switch (alegere)
	{
	case 1:
	{
		cout << endl;
		cout << "1.Adauga cheltuiala" << endl;
		cout << "2.Genereaza raport in fisier binar si text" << endl;
		cout << "3.Vizualizati raport" << endl;
		cout << "Alegeti optiunea dorita: ";
		cin >> optiune1;
		switch (optiune1)
		{
		case 1:
			{


			break;
		}
		case 2:
		{

			break;

		}
		case 3:
		{
			

			break;
		}
		}


		break;
	}






	}





	//registru();
	//***************************************Cheltuieli Alimentare********************************************************8
	//cheltuieli_alimentare al2;
	////	cheltuieli_alimentare ch1;
	//cheltuieli_alimentare ch2;
	//cheltuieli_alimentare al;

	////al2 = al +16;

	//cheltuieli_alimentare al6;
	////al6 = al2 + al;
	////cout << al6.getsuma();

	////al2 = al - 140;
	//cin >> al2;

	//cin >> ch1;
	//cin >> al2;





	//cout << ch1;








	//**************************************************************************************************************

	//*******************************************CLASA CheltuieliConcediu******************************************8
	//int nm[10] = { 2,2,3,4,5,6,7,8,9,10 };

	//cheltuieliconcediu c1;
	//cheltuieliconcediu c2(5, 1000, "Mamaia", 200, nm);
	//cheltuieliconcediu c3(4, 1000, "Mamaia", 200, nm);
	//cheltuieliconcediu c4;
	//cheltuieliconcediu c5;

	//cout << "Apel prin constructorul cu parametrii:" << endl;
	//cout << c2 << endl;
	//cout << "GetDestinatie:";
	//cout << c2.getdestinatie() << endl;
	//cout << "GetNoteMancare:" << endl;
	//cout << c2.getnotamancare() << endl;
	//cout << "Buget ramas:";
	//cout << c2.noulbuget();
	//cout << endl;

	//cout << "OPERATORUL +(ADUNA TIMPUL LUI C2 CU TIMPUL LUI C3)" << endl;
	//c4 = c2 + c3;
	//cout << c4.gettimpconcediu();
	//cout << endl;
	////cout << c2;
	////cin >> c1;
	//c5 = ++c2;
	//cout << "OPERATORUL ++(PRE INCREMENTARE) :" << endl;
	//cout << c5.getpret() << endl;
	//c5 = c2++;
	//cout << "OPERATORUL ++ (POST INCREMENTARE):" << endl;
	//cout << c2.getpret() << endl;
	//cout << "OPERATORUL [](MODIFICA PRIMA NOTA CU 10):" << endl;
	//c2[0] = 10;
	//cout << c2.getnotamancare() << endl;

	//cout << "OPERATORUL CAST(IMPARTE BUGETUL LA TIMP SI CONVERTESTE)" << endl;

	//float x = float(c2);
	//cout << x << endl;




	//cout << "OPERATORUL DE NEGARE (NEAGA BUGETUL)" << endl;
	//!c2;

	//cout << "OPERATORUL > COMPARA PRETURILE CELOR DOUA OBIECTE:C2,C3" << endl;
	//cout << c2.getbuget() << endl;
	//cout << "C2: " << c2.getpret() << endl;
	//cout << "c1:" << c1.getpret() << endl;

	//if (c2 > c3)
	//{
	//	cout << "Pretul lui c2 este mai mare decat c1" << endl;
	//}
	//else
	//{
	//	cout << "Pretul lui c1 este mai mare decat c2" << endl;
	//}


	//cout << "OPERATORUL == VERIFICA DACA TIMPUL CELOR DOUA VACANTE ESTE EGAL" << endl;
	//if (c2 == c3)
	//{
	//	cout << "Timpul celor doua vacante este egal " << endl;
	//}
	//else
	//{
	//	cout << "Timpul nu este egal" << endl;
	//}

	////*******************************************************************************************************************************

	////***********************************************************Cheltuielirenovare*********************************

	//int z[5] = { 1,2,3,4,5 };

	//cheltuielirenovare r1("Dormitor", 500, 100, 3, z);
	//cheltuielirenovare r2("Sufragerie", 300, 100, 3, z);

	//cout << "Bugetul ramas este: " << endl;
	//cout << r2.bugetnou() << endl;

	//cheltuielirenovare r3;
	//cheltuielirenovare r4;

	////cin >> r3;
	////cout << r3<<endl;
	////r4 = r2;

	////cout << "OPERATORUL EGAL(R3,R4)" << endl;
	////	cout << r4;

	//cout << "Operatorul +(aduna bugetul lui r1 cu bugetul lui r2" << endl;
	//cheltuielirenovare r5;
	//r5 = r1 + r2;
	//cout << "Bugetul celor doua obiecte adunate:" << r5.getbuget() << endl;

	//cout << "Opertorul []  ";
	//r5[1];
	//cout << r5.getzi() << endl;
	//cout << "Operatorul !(neaga bugetul): ";
	//!r5;
	//cout << r5.getbuget() << endl;
	//cout << "Operatorul > compara bugete(r1,r2) " << endl;
	//if (r1 > r2)
	//{
	//	cout << "Bugetul lui r1 este mai mare ca bugetul lui r2" << endl;
	//}
	//else
	//{
	//	cout << "Bugetul lui r2 este mai mare ca bugetul lui r1" << endl;
	//}
	//cout << "Operatorul == compara zilele celor doua obiecte" << endl;
	//if (r1 == r2)
	//{
	//	cout << "R1 are mai multe zile ca r2" << endl;
	//}
	//else
	//{
	//	cout << "R2 are mai multe zile ca r1" << endl;
	//}

	//cheltuielirenovare r6;
	//r6 = ++r2;
	//cout << "Operatorul de pre incrementare creste pretul" << endl;
	//cout << r6.getpret() << endl;

	//cout << "Operatorul de post  incrementare :" << endl;
	//r6 = r2++;
	//cout << r2.getpret() << endl;


	//cout << "Operatorul cast (imparte bugetul la pret):";

	//float j = float(r1);
	//cout << j << endl;

	//cout << "Operatorul == verifica daca preturile obiectelor r1,r2 sunt egale:" << endl;
	//if (r1 == r2)
	//{
	//	cout << "R1 are pretul egal cu cel al lui r2" << endl;
	//}
	//else {
	//	cout << "Preturile nu sunt egale" << endl;
	//}

	////***************************************************************************************************************************************
	////*****************************************************CheltuieliUtilitare****************************************************************
	//cheltuieliUtilitare u1;

	//cout << " Bugetul lui u1 prin constructorul default este: " << u1.getbuget() << endl << endl;

	//char buffer1[100];

	//char** tip;
	//tip = new char*[4];
	//for (int i = 0; i < 4; i++)
	//{
	//	tip[i] = new char[strlen(buffer1) + 1];
	//	strcpy(tip[i], buffer1);
	//}

	//tip[0] = "Apa";
	//tip[1] = "Gaze";
	//tip[2] = "Curent";
	//tip[3] = "intretinere";

	//int pr[4] = { 100,200,300,100 };
	//int cantutiliz[4] = { 10,20,20,40 };

	//cheltuieliUtilitare u2(1000, 4, tip, pr, cantutiliz, 1, 1, 2000);
	//cheltuieliUtilitare u3(1200, 4, tip, pr, cantutiliz, 2, 2, 2000);
	//cheltuieliUtilitare u7(1200, 4, tip, pr, cantutiliz, 2, 2, 2000);


	//float q = (float)u2;
	//cout << "Prin operatorul de 'cast' explicit, q= " << q << endl;

	//cout << u2.getbuget() << endl;
	//cheltuieliUtilitare u4;
	//u4 = u3 + u2;
	//cheltuieliUtilitare u6 = u2++;
	//cout << "Bugetul lui u2 s-a incrementat si este " << u2.getbuget() << endl;
	//cout << endl << "Bugetul  u4 ( operatorului '+') este: " << u4.getbuget();
	//cheltuieliUtilitare u5 = ++u2;
	//cout << endl;
	//cout << "Bugetul lui u5 ( operator '++' de preincrementare(u2)) este: " << u5.getbuget() << endl;

	//cout << "Bugetul lui u6 ( operator '++' de postincrementare(u2) )este: " << u6.getbuget() << endl;
	//!u2;
	//cout << "Am modificat anul prin intermediul operatorului ! " << u2.getan() << endl;

	//u2[0] = 300;
	//cout << "Operatorul [] a modificat pretul : " << u2.getpret();


	//if (u2 == u7)
	//{
	//	cout << "Anii sunt egali, ( operatorul '==' )" << endl;
	//}
	//else
	//{
	//	cout << "Anii nu sunt egali, ( operatorul '==')" << endl;
	//}
	//cout << endl;


	//cout << "Bugetul lui u2 este: " << u2.getbuget() << endl;
	//cout << "Bugetul lui u7 este: " << u7.getbuget() << endl;

	//if (u2 > u7)
	//{
	//	cout << " Bugetul lui u2 > u7( '>') " << endl;
	//}
	//else
	//{
	//	cout << " Bugetul lui u2 < u7,( '>')" << endl;
	//}



	//cheltuieliUtilitare u10(u2);
	//cout << endl;
	//cout << "u3 prin constructorul de copiere la u2, a devenit: " << endl;
	//cout << u3;

	//cout << u2;
	///*cheltuieliUtilitare u8;
	//cout << "Se doreste citirea lui u8:  " << endl;
	//cin >> u8;
	//cout << endl;
	//cout << "u8 este:" << endl;
	//cout << u8;
	//cheltuieliUtilitare u9;
	//u5 = u4;
	//cout <<"u5 prin operatorul '=' este: "<< u5;*/

	////**************************************************CheltuieliOcazionale*******************************************************

	//int zo[5] = { 4,5,6,7,7 };

	//cheltuieliocazionale o1("onomastica", 500, 100, 3, zo);
	//cheltuieliocazionale o2("Sufragerie", 300, 100, 3, zo);

	//cout << "Bugetul ramas este: " << endl;
	//cout << o2.bugetnou() << endl;

	//cheltuieliocazionale o3;
	//cheltuieliocazionale o4;

	////cin >> o3;
	////cout << 03<<endl;
	////o4 = o2;

	////cout << "OPERATORUL EGAL (o3,o4)" << endl;
	////	cout << o4;

	//cout << "Operatorul +(aduna bugetul lui o1 cu bugetul lui o2" << endl;
	//cheltuieliocazionale o5;
	//o5 = o1 + o2;
	//cout << "Bugetul celor doua obiecte adunate:" << o5.getbuget() << endl;

	//cout << "Opertorul []  ";
	//o5[1];
	//cout << o5.getzi() << endl;
	//cout << "Operatorul !(neaga bugetul): ";
	//!o5;
	//cout << o5.getbuget() << endl;
	//cout << "Operatorul > compara bugete(o1,o2) " << endl;
	//if (o1 > o2)
	//{
	//	cout << "Bugetul lui o1 este mai mare ca bugetul lui o2" << endl;
	//}
	//else
	//{
	//	cout << "Bugetul lui o2 este mai mare ca bugetul lui o1" << endl;
	//}
	//cout << "Operatorul == compara zilele celor doua obiecte" << endl;
	//if (o1 == o2)
	//{
	//	cout << "o1 are mai multe zile ca o2" << endl;
	//}
	//else
	//{
	//	cout << "o2 are mai multe zile ca o1" << endl;
	//}

	//cheltuieliocazionale o6;
	//o6 = ++o2;
	//cout << "Operatorul de pre incrementare creste pretul" << endl;
	//cout << o6.getpret() << endl;

	//cout << "Operatorul de post  incrementare :" << endl;
	//o6 = o2++;
	//cout << o2.getpret() << endl;


	//cout << "Operatorul cast (imparte bugetul la pret):";

	//float w = float(o1);
	//cout << w << endl;

	//cout << "Operatorul == verifica daca preturile obiectelor o1,o2 sunt egale:" << endl;
	//if (o1 == o2)
	//{
	//	cout << "o1 are pretul egal cu cel al lui o2" << endl;
	//}
	//else {
	//	cout << "Preturile nu sunt egale" << endl;
	//}



















}










