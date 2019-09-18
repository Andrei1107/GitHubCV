#include<iostream>
using namespace std;
#include<fstream>

class Profesor
{
private:
	char* nume;
	int* nrActivitati;
	int vechime;
	char facultate[10];

public:
	Profesor()
	{
		this->nume = NULL;
		this->vechime = 0;
		this->nrActivitati = NULL;
		strcpy(this->facultate, "None");
	}

	Profesor(char* nume, int* nrActivitati, int vechime, char facultate[])
	{
		if (nume != NULL)
		{
			this->nume = new char[strlen(nume) + 1];
			strcpy(this->nume, nume);
		}
		else
			this->nume = NULL;
		this->vechime = vechime;
		if (nrActivitati != NULL)
		{
			this->nrActivitati = new int[vechime];
			for (int i = 0; i < vechime; i++)
				this->nrActivitati[i] = nrActivitati[i];
		}
		else
			this->nrActivitati = NULL;
		strcpy(this->facultate, facultate);
	}

	Profesor(const Profesor& prof)
	{
		if (prof.nume != NULL)
		{
			this->nume = new char[strlen(prof.nume) + 1];
			strcpy(this->nume, prof.nume);
		}
		else
			this->nume = NULL;
		this->vechime = prof.vechime;
		if (prof.nrActivitati != NULL)
		{
			this->nrActivitati = new int[vechime];
			for (int i = 0; i < vechime; i++)
				this->nrActivitati[i] = prof.nrActivitati[i];
		}
		else
			this->nrActivitati = NULL;
		strcpy(this->facultate, prof.facultate);
	}

	Profesor& operator=(const Profesor& prof)
	{
		if (this->nume != NULL)
			delete[] this->nume;
		if (this->nrActivitati != NULL)
			delete[] this->nrActivitati;

		if (prof.nume != NULL)
		{
			this->nume = new char[strlen(prof.nume) + 1];
			strcpy(this->nume, prof.nume);
		}
		else
			this->nume = NULL;
		this->vechime = prof.vechime;
		if (prof.nrActivitati != NULL)
		{
			this->nrActivitati = new int[vechime];
			for (int i = 0; i < vechime; i++)
				this->nrActivitati[i] = prof.nrActivitati[i];
		}
		else
			this->nrActivitati = NULL;
		strcpy(this->facultate, prof.facultate);

		return *this;
	}

	~Profesor()
	{
		if (this->nume != NULL)
			delete[] this->nume;
		if (this->nrActivitati != NULL)
			delete[] this->nrActivitati;
	}

	friend ostream& operator<<(ostream& out, const Profesor& prof);
	friend ofstream& operator<<(ofstream& out, const Profesor& prof); //output file stream
	friend ifstream& operator >> (ifstream& in, Profesor& prof); 
	friend void raport1(Profesor* listaP, int nrProf, char* numeFisier);
    friend void raport2(Profesor* listaP, int nrProf, char* numeFisier);
};

ostream& operator<<(ostream& out, const Profesor& prof)
{
	if (prof.nume != NULL)
		out << "\n" << prof.nume << " are ";
	out << prof.vechime << " ani vechime la facultatea: " << prof.facultate;
	out << " Nr activitati : ";
	for (int i = 0; i < prof.vechime; i++)
		out << prof.nrActivitati[i] << " ";
	return out;
}

ofstream& operator<<(ofstream& out, const Profesor& prof)
{
	out << prof.nume << endl;
	out << prof.facultate << endl;
	out << prof.vechime << endl;
	for (int i = 0; i < prof.vechime; i++)
		out << prof.nrActivitati[i] << " ";
	out << endl;

		return out;
		
}

void raport1(Profesor* listaP, int nrProf, char* numeFisier)
{
	ofstream fRaport;
	fRaport.open(numeFisier, ios::out);
	float medie;

	for (int i = 0; i < nrProf; i++)
	{
		medie = 0;
		for (int j = 0; j < listaP[i].vechime; j++)
		{
			medie += listaP[i].nrActivitati[j];
		}
		medie = medie / listaP[i].vechime;

		fRaport << listaP[i].nume << " " << medie << endl;
	}

	fRaport.close();
}

void raport2(Profesor* listaP, int nrProf, char* numeFisier)
{
	ofstream fRaport;
	fRaport.open(numeFisier, ios::out);
	//scrie in fisier profesoriicu vechimea in ordine crescatoare
	int vechime[100];
	int pozitie[100];

	for (int i = 0; i < nrProf; i++)
	{
		vechime[i] = listaP[i].vechime;
		pozitie[i] = i;
	}

	for (int i = 0; i < nrProf; i++)
	
		for (int j = i + 1; j < nrProf; j++)
		{
			if (vechime[i] > vechime[j])
			{
				swap(vechime[i], vechime[j]);   //echivalent cu aux
				swap(pozitie[i], pozitie[j]);  
			}
		}
	
	for (int i = 0; i < nrProf; i++)
		fRaport << listaP[pozitie[i]] << " " << vechime[i] << endl;


		fRaport.close();
}


void main()
{
	int activitati1[] = { 10,3,4 };
	int activitati2[] = { 2,5 };
	Profesor p1("Costachescu", activitati1, 3, "CSIE");
	Profesor p2("Ionescu", activitati2, 2, "Mk");
	Profesor p3("Bradut", activitati2, 2, "CSIE");
	Profesor p4("Mandarina", activitati1, 3, "Mk");

	Profesor listaProfesori[] = { p1,p2,p3,p4 };

	ofstream fOut;  //am declarat un obiect de tip ofstream
	fOut.open("profesori.txt", ios::out);



	for (int i = 0; i < 4; i++)
		fOut << listaProfesori[i];  //afiseaza porfesorii in fisier
	fOut.close();
	 

	raport1(listaProfesori, 4, "raport1.txt");		
	raport2(listaProfesori, 4, "raport2.txt");

}