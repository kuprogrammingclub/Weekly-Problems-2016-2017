# File: Beginner1.rb
# Author: Stefan Mendoza
# Date: 3 September 2016
# Description: Week-1/Beginner-1 for KU Programming Club (2016-2017)

# Prints to the console with a newline
puts "What's your favorite color?"

# Prints to the console with no newline
print "> "

# Gets input from the console trailing newlines or carriage returns removed
# See: http://ruby-doc.org/core-2.3.1/String.html#method-i-chomp
favoriteColor = gets.chomp

puts "Your's is #{favoriteColor}? That's a great color! Mine's red."
