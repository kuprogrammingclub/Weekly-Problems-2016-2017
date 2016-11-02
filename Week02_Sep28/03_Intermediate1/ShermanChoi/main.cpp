//This program takes a name and sees if it is a palindrome or not.

//You may bash Compile to compile this.
//You may bash Remove to remove the main.o and NameValuation files

#include<iostream>
#include<string>
using namespace std;

int ifPalindromeReturnLength(string a){ // A palindrome would never return zero. Returns the length of the string if it is a palindrome
	int rVal = (signed)a.length(); //return Value

	for(int x = 0; x < (signed)(a.length()/2); ++x){
		if(a.at(x) != a.at(a.length() - 1 - x)){ 
			//Characters don't match up! NOT A PALINDROME
			rVal = 0; // In other words. This substring does not count.
			break; // No need to continue.
		}
	}
	return(rVal); //Return its length.
}

int main(){
	string input;
	string recordHolder = ""; //For longest palindrome substring.
	cout << "Provide a String. I will find the longest Palindrome substring in it.\n"; 
	getline(cin,input);

	if(0 != ifPalindromeReturnLength(input)){ //string.substr Does not want to work with the first character, so this needs to be manually done...
		recordHolder = input;
	}

	for(int u = 0; u < (signed)input.length(); u+=1){
		for(int v = (u+1); v <= (signed)input.length(); v+=1){
			//These loops check all possible substrings.
			if((signed)recordHolder.length() < ifPalindromeReturnLength(input.substr(u,v))){
				recordHolder = input.substr(u,v);
			}
			//cout << u << " " << v << " " << ifPalindromeReturnLength(input.substr(u,v)) << " " << input.substr(u,v) << endl; //Debug for seeing what the code does.
		}
	}

	cout << recordHolder << endl;
	return(0);
}


