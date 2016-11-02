//Use the "make" command to compile

#include "inputPromptAndChecker.h"


//This method prints a "diamond word" given a string
void printDiamondWord(std::string word){
	int upperLimit, lowerLimit;
		upperLimit = (word.length() / 2) + (word.length() % 2); //Odd number of letters means an additional 1 to the upper limit.
		lowerLimit = (word.length() / 2);
		while(upperLimit != (signed) word.length()){
			for(int x = 0; x < upperLimit; ++x){
				//This for loop prints out blanks if x is below lowerLimit. If it is higher, it prints the character at that value.
				//This creates the "layer" of letters given the limits.
				if(x >= lowerLimit){
					std::cout << word.at(x);
				}else{
					std::cout << " ";
				}
			}
			//std::cout << " " << lowerLimit << "-" << upperLimit << " to "; //debug
			//Limit adjustment. It increases the range of letters that will be displayed onto the next layer.
			++upperLimit;
			--lowerLimit;
			//std::cout << " " << lowerLimit << "-" << upperLimit; //debug
			std::cout << std::endl;
		}
		while(upperLimit > lowerLimit){
			//This loop does everything the top does, but backwards in the sense that it is stripping the first and last letter of each layer.
			for(int x = 0; x < upperLimit; ++x){
				if(x >= lowerLimit){
					std::cout << word.at(x);
				}else{
					std::cout << " ";
				}
			}
			//std::cout << " " << lowerLimit << "-" << upperLimit << " to "; //debug
			--upperLimit;
			++lowerLimit;
			//std::cout << " " << lowerLimit << "-" << upperLimit; //debug
			std::cout << std::endl;
		}
		if(word.length() % 2  == 0){
			//Words with just even # of letters need an end line
			std::cout << std::endl;
		}

}


int main(){
	//gathers input and initializes variables.
	int howMany = InputPromptAndChecker::intPromptInputAndCheck("How many words do you want to input? ");
	std::string arrayOfStrings[howMany];
	
	for(int x = 0; x < howMany; ++x){
		std::cout << "What is word # " << (x+1) << "? ";
		std::cin >> arrayOfStrings[x];
		while(arrayOfStrings[x].length() >= 10){
			if(arrayOfStrings[x].length() >= 10);{
					std::cout << "Words may not be longer than 10 characters. Try Again: ";
			}
			std::cin >> arrayOfStrings[x];
		}
	}
	//finally prints everything.
	for(int x = 0; x < howMany; ++x){
		printDiamondWord(arrayOfStrings[x]);
	}
}
