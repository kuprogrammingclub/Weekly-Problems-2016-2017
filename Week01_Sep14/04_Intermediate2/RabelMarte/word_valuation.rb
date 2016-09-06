# Word Valuation
puts "What is the word you'd like to place a value on?"
word = gets.downcase.chomp
value = 0
is_valid = true

word.each_char do |letter|
  letter =~ /[A-Za-z]/ ? (value += (letter.ord - 96)) : (is_valid = false)
  if !is_valid then break end
end

puts is_valid ? "The total value of your word is #{value}" : "Not a proper word"
