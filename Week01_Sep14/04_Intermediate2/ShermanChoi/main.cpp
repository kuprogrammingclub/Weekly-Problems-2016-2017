//This program takes a string and scores it based on its letters. It sums up all the letters' values, which are 1=a,2=b,3=c, and so on.

//You may bash Compile to compile this.
//You may bash Remove to remove the main.o and NameValuation files

#include<iostream>
#include<string>
using namespace std;
int main(){
	string input = "";
	cout << "Enter a word to be evaluated: ";
	cin >> input;
	int pointCounter = 0;
	for(int i = 0; i < (int) input.length(); i++){
		// cout << ((int)input.at(i)) << endl; //debug: What would the characters be in int values?
		pointCounter +=	(tolower(((int)input.at(i))) - 96); //-96 accounts for the starting value of a (97)
	}
	cout << "Total Value of Word: " << pointCounter << endl;

	return(0);
}
