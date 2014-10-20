puts "Difference between puts and print"
3.upto(7) {|i| puts i}

3.upto(7) {|i| print i}

# while line = gets
#   puts line
# end

puts "\n\nAnd now, IO stuff"
puts "What is your name?"
name = gets
puts "Hello, #{name}"