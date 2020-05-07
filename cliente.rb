         
         require 'savon'

client = Savon.client(wsdl: 'http://localhost:40000/hexadecimal?wsdl')

puts "Digite um numero: "
valor = gets

response = client.call(:decimalParaHexa, message:{valores: valor})

puts response.body
