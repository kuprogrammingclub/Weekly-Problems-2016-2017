#include <string>
#include <iostream>
#include <limits>

#ifndef INPUT_PROMPT_AND_CHECKER
#define INPUT_PROMPT_AND_CHECKER

class InputPromptAndChecker
{
	public:
		static int intPromptInputAndCheck(std::string message);
		static float floatPromptInputAndCheck(std::string message);
		static double doublePromptInputAndCheck(std::string message);
}; 

#endif

