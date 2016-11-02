mainProgram : main.o inputPromptAndChecker.o
	g++ -std=c++11 -g -Wall main.o inputPromptAndChecker.o -o DiamondWords 
main.o: main.cpp
	g++ -std=c++11 -g -Wall -c main.cpp
inputPromptAndChecker.o: inputPromptAndChecker.cpp
	g++ -std=c++11 -g -Wall -c inputPromptAndChecker.cpp
clean:
	rm *.o DiamondWords *.gch
