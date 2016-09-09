# Palindrome
puts "What is your name?"
name = gets.chomp
print "Your name backwards is #{name.reverse}, "
puts name.downcase == name.downcase.reverse ?  "that is a palindrome" : "that is not a palindrome."
