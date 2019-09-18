#include <iostream>
using namespace std;
#pragma warning(disable:4996)


class Student
{
public:
	char* nume;

private:
	int matricol;
protected:
	float medie;

public:
	Student()   //constructor fara parametrii
	{
		nume = new char[7];
		strcpy(nume, "Anonim");
		matricol = 0;
		medie = 0;
		cout << "S-a apelat constructorul implicit" << endl;
	}
	Student(char *n, int nr, float m)   //constructor cu parametrii
	{
		this->nume = new char[strlen(n) + 1];
		strcpy(nume, n);
		matricol = nr;
		medie = m;
		cout << "S-a apelat constructorul cu parametrii" << endl;
	}
	//}
	//Student(char*n = "Anonim", int nr = 0, float m = 0) : matricol(nr), medie(m)
	//{
	//	strcpy(nume, n);
	//	cout << "S-a apelat constructorul hibrid" << endl;
	//}

	Student(const  Student& s)             //constructor de copiere
	{
	
		this->nume = new char[strlen(s.nume) + 1];
		strcpy(this->nume, s.nume);
		this->matricol = s.matricol;
		this->medie = s.medie;

		cout << "S-a apelat constructorul de copiere" << endl;


	}

	~Student()
	{

		delete[]this->nume;
		cout << "S-a apelat destructorul"<<endl;
	}



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
	Student s1;
	Student s2("Nume", 123, 10);
//	s.init("Nume", 123, 5);
	cout << s1.nume << endl;
	//s.afiseaza_adresa();
	cout << s2.get_medie() << endl;
	Student s3 = s2;  //aici apelez constructorul de copiere,l-am copiat pe s2 in s3 ,aici compilatorul aloca memorie intr o zona de memorie nealocata
//	Student s3(s2);

	/*Student *ps;
	ps = new Student;
	delete ps;
	ps = new Student("Nume", 2, 10);
	delete ps;
	Student grupa[3];
	grupa[0] = Student("Nume1", 1, 8);
	grupa[1] = Student("Nume2", 2, 9);
	grupa[2] = Student("Nume3", 3, 10);

	cout << grupa[1].get_medie();*/


}