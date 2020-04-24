Simple Java Server that dumps a Socket to the console.

Can be used for connection debugging of all purposes.

Echo server is a bit misleading but that's the first thing I searched for as I found out that there is no server that just dumps all requests to the console.


Usage:

    docker run -itd -p 8080:8080 peez/http-echo-server