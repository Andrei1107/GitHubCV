#include <iostream>
#include <fstream>
#include <conio.h>
#include <ctype.h>
#include <map>

using namespace std;

class Sir {
private:
	char* pe;
	int lg;

public:
	Sir() {
		pe = new char[strlen("Sir Nou") + 1];
		strcpy(pe, "Sir Nou");
		lg = 7;
	}

	Sir(char* pe, int lg) {
		this->pe = new char[strlen(pe) + 1];
		strcpy(this->pe, pe);
		this->lg = lg;
	}

	Sir(const Sir &s) {
		this->pe = new char[strlen(s.pe) + 1];
		strcpy(this->pe, s.pe);
		this->lg = s.lg;
	}

	~Sir() {
		delete[] pe;
	}

	char* getPe() {
		return pe;
	}

	int getLg() {
		return lg;
	}

	bool operator!() {
		if (strcmp(this->pe, "") == 0) return true;
		else return false;
	}

	void operator=(Sir s) {
		delete[] pe;
		this->pe = new char[strlen(s.pe) + 1];
		strcpy(this->pe, s.pe);
		this->lg = s.lg;
	}

	Sir operator+(Sir s) {
		Sir temp = (*this);
		char *x;
		x = new char[strlen(temp.pe) + 1];
		strcpy(x, temp.pe);
		temp.lg += s.lg;
		delete[] temp.pe;
		temp.pe = new char[temp.lg + 1];
		strcpy(temp.pe, x);
		strcat(temp.pe, s.pe);

		return temp;
	}

	Sir operator+(const char *ch) {
		Sir temp = (*this);
		char *x;
		x = new char[strlen(temp.pe) + 1];
		strcpy(x, temp.pe);
		temp.lg += strlen(ch);
		delete[] temp.pe;
		temp.pe = new char[temp.lg + 1];
		strcpy(temp.pe, x);
		strcat(temp.pe, ch);

		return temp;
	}

	friend Sir operator+(const char *ch, Sir s) {
		Sir temp = s;
		char *x;
		x = new char[strlen(temp.pe) + 1];
		strcpy(x, temp.pe);
		temp.lg += strlen(ch);
		delete[] temp.pe;
		temp.pe = new char[temp.lg + 1];
		strcpy(temp.pe, ch);
		strcat(temp.pe, x);

		return temp;
	}

	Sir operator+=(Sir s) {
		strcat(this->pe, s.pe);
		this->lg += s.lg;

		return *this;
	}

	char operator[](int i) {
		return this->pe[i];
	}

	bool operator<(Sir s) {
		if (strcmp(this->pe, s.pe) < 0) return true;
		else return false;
	}

	bool operator>(Sir s) {
		if (strcmp(this->pe, s.pe) > 0) return true;
		else return false;
	}

	bool operator==(Sir s) {
		if (strcmp(this->pe, s.pe) == 0) return true;
		else return false;
	}

	operator char() {
		return this->pe[0];
	}

	friend ostream& operator<<(ostream &out, Sir s) {
		out << "Sir: " << s.pe << endl;
		out << "Lungime sir: " << s.lg << endl;
		out << endl;
		return out;
	}

	friend ofstream& operator<<(ofstream &out, Sir s) {
		out << s.pe << endl;
		out <<  s.lg << endl;
		out << endl;
		return out;
	}

	friend istream& operator >>(istream &in, Sir &s) {
		char aux[50];
		cout << "Sir: ";
		in >> aux;
		delete[] s.pe;
		s.pe = new char[strlen(aux) + 1];
		strcpy(s.pe, aux);

		cout << "Lungimea sirului: ";
		in >> s.lg;

		return in;
	}


	friend ifstream& operator >>(ifstream &in, Sir &s) {
		char aux[50];
		in >> aux;
		delete[] s.pe;
		s.pe = new char[strlen(aux) + 1];
		strcpy(s.pe, aux);
		in >> s.lg;

		return in;
	}

};

class SirNumeric : public Sir{
public:

	SirNumeric(char* pe, int lg) :Sir(pe, lg){}

	SirNumeric(const SirNumeric &sn) : Sir(sn){}

	bool validare() {
		int k = 0;
		
		for (int i = 0; i < this->getLg() + 1; i++) {
			if (isdigit(this->getPe()[i])) k++;
		}
		
		if (k != this->getLg()) return false;
		else return true;
	}

	int convert(char x) {
		switch (x) {
		case '0':
			return 0;
			break;
		case '1':
			return 1;
			break;
		case '2':
			return 2;
			break;
		case '3':
			return 3;
			break;
		case '4':
			return 4;
			break;
		case '5':
			return 5;
			break;
		case '6':
			return 6;
			break;
		case '7':
			return 7;
			break;
		case '8':
			return 8;
			break;
		case '9':
			return 9;
			break;
		}
	}

	long long operator+(SirNumeric sn) {
		SirNumeric temp = (*this);
		long long suma = 0;
		int k = 0;
		if (temp.validare() && sn.validare()) {
			for (int i = getLg() - 1; i >= 0; i--) {
				suma += convert(temp.getPe()[i]) * pow(10, k) + convert(sn.getPe()[i]) * pow(10, k);
				k++;
			}
		}
		else cout << "Sirurile introduse nu reprezinta numere.";
	
		return suma;
	}

	friend ostream& operator<<(ostream& out, SirNumeric sn) {
		out << (Sir)sn;

		return out;
	}
};

void main() {
	//5p
	Sir s1("", 0);
	Sir s2("Boss", 4);
	Sir s3("Mare", 4);
	Sir s4(s3);
	Sir s5;

	//cout << s1 << s2 << s3 << s4;

	//if (!s1) cout << "s1 este alocat dar nu contine niciun caracter\n";
	//if (!s2) cout << "s2 este alocat dar nu contine niciun caracter\n";
	//else cout << "s2 este alocat dar contine caractere\n";

	//s1 = s2;
	//cout << s1;

	//cout << s2 + s3 << endl;
	//cout << s2; 
	//cout << "Mare mare mare " + s2;

	//cout << s2 + " mare mare mare ";

	//if (s2 > s3) cout << "s2 inaintea lui s3 alfabetic";
	//else cout << "s2 dupa s3 alfabetic";
	
	//cin >> s1;
	//cout << s1;

	//cout << s5;
	//ofstream fisOut("siruri.txt", ios::out);
	//fisOut << s3;
	//fisOut.close();
	//ifstream fisIn("siruri.txt", ios::in);
	//fisIn >> s5;
	//fisIn.close();
	//cout << s5;

	//cout << s2[1];

	//cout << (char)s2;

	SirNumeric sn("1234567898765432", 16);
	SirNumeric sn2("1234567898765432", 16);

	//if(sn.validare() == true) cout <<"in sn ie numai cifre";
	//else cout << "in sn ie si litere";

	//if (sn2.validare() == true) cout << "in sn2 ie numai cifre";
	//else cout << "in sn2 ie si litere";

	cout << "sn + sn2 = " << sn + sn2 << endl;
	Sir sir1, sir2, sir3, sir4;

	map<string, Sir> ms;
	typedef pair<string, Sir> element;
	ms.insert(element("dog", sir1));
	ms.insert(element("cat", sir2));
	ms.insert(element("lyon", sir3));
	ms.insert(element("boss", sir4));

	map<string, Sir> ::iterator i;

	for (i = ms.begin(); i != ms.end(); ++i) {
		cout << (*i);
	}
	_getch();
}