#include <iostream>
using namespace std;
#pragma warning(disable:4996)


class Student
{
public:
	char nume[40];

private:
	int matricol;
protected:
	float medie;

public:
	void init(char* n = "Anonim", int nr = 0, float m = 0)
	{
		strcpy(nume, n);
		matricol = nr;
		medie = m;
	}

	char* returneaza_nume()
	{
		return this->nume;
	}
	void afiseaza_adresa();

	void modificanume(char* n)
	{
		strcpy(this->nume, n);
	}
	float get_medie()
	{
		if (this->medie > 9)
		{
			return this->medie;
		}
		else {
			return 0;
		}
	}
	void set_medie(float m)
	{
		this->medie = m;
	}


};

void Student::afiseaza_adresa()
{
	cout << "Adresa obiectului curent este : " << this << endl;

}


void main()
{
	Student s;
	s.init("Nume", 123, 5);
	cout << s.nume << endl;
	s.afiseaza_adresa();
	cout << s.get_medie()<<endl;




}