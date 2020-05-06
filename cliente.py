from suds.client import Client

url= "http://localhost:40000/hexadecimal?wsdl"
client = Client(url)
#print(client)
valor = int(input("digite o primeiro numero: "))

response = client.service.decimalParaHexa(valor)
print (response)
