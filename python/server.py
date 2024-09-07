import socket
server=socket.socket()
print("Socket Created")
server.bind(('localhost',7777))
server.listen(3)
print("Waiting for Connection")
while True :
	client,address=server.accept()
	print("Connect With ", address)
	client.send(bytes('You are Connected','UTF-8'))
client.close()