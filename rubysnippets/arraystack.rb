# Fun with monads. See http://codon.com/refactoring-ruby-with-monads

ArrayStack = Struct.new(:values) do 
  def push(value)
    ArrayStack.new([value] + values)
  end

  def top
    values.first
  end

  def pop
    ArrayStack.new(values.drop(1))
  end

  def empty?
    values.empty?
  end

  def self.empty
    new([])
  end

end


a = ArrayStack.empty
puts a
a = a.push(5)
puts a.top