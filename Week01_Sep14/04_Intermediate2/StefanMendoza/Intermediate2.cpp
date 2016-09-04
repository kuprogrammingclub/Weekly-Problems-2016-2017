/**
 * File: Intermediate2.cpp
 * Author: Stefan Mendoza
 * Date: 3 September 2016
 *
 * Week 1 / Intermediate 2 for KU Programming Club (2016-2017)
 */


#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

unordered_map<char, int>* generateletterValueMap() {
    unordered_map<char, int>* letterValueMap = new unordered_map<char, int>();

    for(int i = 65; i < 91; i++) {
        letterValueMap->insert({char(i), i - 64});
        letterValueMap->insert({char(i + 32), i - 64});
    }

    return letterValueMap;
}

int main(int argc, char** argv) {
    unordered_map<char, int>* letterValueMap = generateletterValueMap();

    std::cout << "What is the word you'd like to place a value on?" << std::endl;
    std::cout << "> ";
    string word;
    std::cin >> word;

    int value = 0;
    for(int i = 0; i < word.length(); i++) {
        if(letterValueMap->count(word[i]) == 0) {
            std::cout << "\nSorry! You entered a word with non-alphabetical characters." << std::endl;
            std::cout << "Exiting..." << std::endl;
            return 0;
        }
        else {
            value += letterValueMap->at(word[i]);
        }
    }

    std::cout << "The total value of your word is " << value << "." << std::endl;
    return 0;
}
