# Evolution - Work in Progress

def fitness(s1, s2)
    raise "Strings not equal in lengths" if s1.length != s2.length
    (s1.chars.zip(s2.chars)).count {|l, r| l != r}
end

puts "Enter input string"
input = gets.downcase.chomp
evolve =  rand(36**input.length).to_s(36)
i = 0

t1 = Time.now
while input != evolve do
  i+=1
  evolve.each_char.with_index do |char, i|
    if evolve[i] != input[i] then evolve[i] = rand(36**1).to_s(36) end
  end
  puts "Gen: #{i}  | Fitness: #{fitness(input, evolve)}  | #{evolve}"
end
t2 = Time.now

delta_time = t2 - t1
puts "Elapsed time is #{delta_time} seconds"
