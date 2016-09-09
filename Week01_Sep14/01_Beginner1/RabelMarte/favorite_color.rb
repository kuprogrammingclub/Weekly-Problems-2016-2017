# Favorite Color
colors = ["blue", "red", "gray"]
puts "What is your favorite color?"
print "> "
color = gets.chomp
puts "Hmmm, #{color} is a cool color 😎. Mine's #{colors[rand(3)]}."
