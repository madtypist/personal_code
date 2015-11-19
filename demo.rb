def say_my_name()
  puts "Hello, what is your name?"
  name = gets.strip
  puts "Hello, #{name}!"
end

def age()
  puts "What year were you born?"
  birthyear = gets.strip.to_i
  age = 2015 - birthyear
  puts "You are #{age} years old"
end

say_my_name
age
puts "hello"