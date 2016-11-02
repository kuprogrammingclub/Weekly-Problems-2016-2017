//This program takes a name and sees if it is a palindrome or not.

//You may bash Compile to compile this.
//You may bash Remove to remove the main.o and NameValuation files

#include<iostream>
#include<string>
using namespace std;
int main(){
	string input = "";
	bool isPalindrome = true;
	cout << "What is your name? (lowercase): ";
	cin >> input;


	for(int x = 0; x < input.length() -1 ; x++){
		
		if(input.at(x) != input.at(input.length() - 1 - x)){
		//This checks for character equality betwen the xth letter and the (last-x)th letter. Any inequality would result in isPalindrome becoming false.
			isPalindrome = false;
			break;
		}
	}

	cout << "Your name backwards is \"";
	for(int y = 0; y < input.length(); y++){
		cout << input.at((input.length() - 1 - y)); //prints the name backwards character by character.
	}

	if(isPalindrome){
		cout << "\", this is a palindrome.\n";
	}else{
		cout << "\", this is not a palindrome.\n";
	}


	return(0);


}
