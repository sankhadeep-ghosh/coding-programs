import socket
client=socket.socket()
client.connect(('localhost',7777))
print(client.recv(1024).decode())