#include "inputPromptAndChecker.h"

//A better cin meant for checking int inputs.
int InputPromptAndChecker::intPromptInputAndCheck(std::string message){//checks if an int is valid!
	int inputInt = 0; //Holds input.
	std::cout << message;
	std::cin >> inputInt; //Gets input
	while(std::cin.fail()){ //Makes sure input is correct
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
		std::cout << "Invalid Integer Value\n";
		std::cout << message;
		std::cin >> inputInt;
	}
	return(inputInt);
}
//A better cin meant for checking float inputs.
float InputPromptAndChecker::floatPromptInputAndCheck(std::string message){//checks if a float is valid!
	float inputFloat = 0; //Holds input.
	std::cout << message;
	std::cin >> inputFloat; //Gets input
	while(std::cin.fail()){ //Makes sure input is correct
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
		std::cout << "Invalid Float Value\n";
		std::cout << message;
		std::cin >> inputFloat;
	}
	return(inputFloat);
}
//A better cin meant for checking double inputs.
double InputPromptAndChecker::doublePromptInputAndCheck(std::string message){//checks if a double is valid!
	float inputDouble = 0; //Holds input.
	std::cout << message;
	std::cin >> inputDouble; //Gets input
	while(std::cin.fail()){ //Makes sure input is correct
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
		std::cout << "Invalid Double Value\n";
		std::cout << message;
		std::cin >> inputDouble;
	}
	return(inputDouble);
}

