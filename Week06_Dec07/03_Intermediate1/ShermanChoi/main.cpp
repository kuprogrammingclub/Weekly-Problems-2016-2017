//Doing random stuff

#include <iostream>
#include <fstream>
#include <string>
#include <cmath>  
#include <exception>

std::ifstream map;
int myX = -1;
int myY = -1;
int princessX = -1;
int princessY = -1;;


void findUs(std::string where){
	map.open(where); //The file is open.
	try{
		//Value holders
		std::string lookHere = "";
		int size = 0;
		//the size is the n in nxn
		map >> size;
		getline(map,lookHere); //Skip a line, the line with the number
		//Scan all squares to find m and p.

		for(int y = 0; y < size; ++y){
			
			getline(map,lookHere);
			for(int x = 0; x < size; ++x){
				if(lookHere.at(x) == 'm'){
					//found m
					myX = x;
					myY = y;
					if(princessX != -1){
						//found both.
						break;
					}
				}
				
				if(lookHere.at(x) == 'p'){
					//found p
					princessX = x;
					princessY = y;
					if(myX != -1){
						//found both.
						break;
					}
				}
			}

		}

		if(myX == -1 || princessX == -1){
				//not found, end this!
				std::cout << "Error: 'm' or 'p' not found\n";
				return;
		}
		//Done
	}catch(std::exception e){
		std::cout << "There was an error: " << e.what() << "\n";
	}
	map.close();
}


int main(int argc, char** argv){
	if(argc == 2){
		findUs(argv[1]);
		if(myX == -1 || princessX == -1){
				//not found, end this!
				return(0);
		}
		
		//std::cout << myX << " " << myY << "     " << princessX << " " << princessY << "\n";
		for(int i = 0; i < std::abs(myY-princessY); ++i){
			if(myY > princessY){
				//m is below princess, go up.
				std::cout << "UP\n";
			}else{
				//m is above princess, go down.
				std::cout << "DOWN\n";
			}
		}
		for(int i = 0; i < std::abs(myX-princessX); ++i){
			if(myX > princessX){
				//m is to the right of princess, go left.
				std::cout << "LEFT\n";
			}else{
				//m is to the left of princess, go right.
				std::cout << "RIGHT\n";
			}
		}
	}else{
		std::cout << "Invalid Command\n";
	}

	
}

