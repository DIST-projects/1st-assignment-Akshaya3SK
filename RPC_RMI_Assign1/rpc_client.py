import xmlrpc.client

try:
    proxy = xmlrpc.client.ServerProxy("http://18.222.126.130:8000/RPC2")

    print("Addition Result:", proxy.add(10, 5))
    print("Subtraction Result:", proxy.subtract(20, 8))
    print("Multiplication Result:", proxy.multiply(6, 7))

except Exception as e:
    print("RPC Error:", e)
