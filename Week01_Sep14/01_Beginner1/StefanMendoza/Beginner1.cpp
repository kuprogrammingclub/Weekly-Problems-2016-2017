/**
 * File: Beginner1.cpp
 * Author: Stefan Mendoza
 * Date: 2 September 2016
 *
 * Week 1 / Beginner 1 for KU Programming Club (2016-2017)
 */

#include <iostream>
#include <string>

int main() {
    std::cout << "What's your favorite color?" << std::endl;
    std::cout << "> ";
    std::string favoriteColor;
    std::cin >> favoriteColor;
    std::cout << "Your's is " << favoriteColor
    << "?  That's a great color! Mine's red." << std::endl;

    return 0;
}
