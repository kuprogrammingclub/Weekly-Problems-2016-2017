# Age
puts "How old are you?"
print "> "
is_valid = true
(age = gets.chomp.to_i) > 0 ? (print "I'm 20. ") : (is_valid = false)

if is_valid
  if age > 20 then puts "We are #{age - 20} year(s) apart. 👴🏼👵🏼"
  elsif age < 20 then puts "We are #{20 - age} year(s) apart. 🍼👶🏻"
  else puts "We are the same age! 🎉🎉" end
else
  puts "That's not cool 😞"
end
