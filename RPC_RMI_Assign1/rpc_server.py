from xmlrpc.server import SimpleXMLRPCServer
from xmlrpc.server import SimpleXMLRPCRequestHandler
import socket


class RequestHandler(SimpleXMLRPCRequestHandler):
    rpc_paths = ('/RPC2',)

try:
    server = SimpleXMLRPCServer(
        ("0.0.0.0", 8000), 
        requestHandler=RequestHandler,
        allow_none=True,
        logRequests=True
    )

    server.register_introspection_functions()

    def add(a, b):
        return a + b

    def subtract(a, b):
        return a - b

    def multiply(a, b):
        return a * b

    server.register_function(add, "add")
    server.register_function(subtract, "subtract")
    server.register_function(multiply, "multiply")

    host_ip = socket.gethostbyname(socket.gethostname())
    print("RPC Server running in cloud...")
    print(f"Listening on port 8000")

    server.serve_forever()

except Exception as e:
    print("Server Error:", e)
