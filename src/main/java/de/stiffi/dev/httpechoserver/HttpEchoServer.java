package de.stiffi.dev.httpechoserver;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HttpEchoServer {



    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Started Server on Port 8080");
        boolean running = true;

        while (running) {
            Socket socket = server.accept();


            int read;
            byte[] buffer = new byte[8192];

            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8")); PrintWriter out = new PrintWriter(socket.getOutputStream(), true);) {
                String date = SimpleDateFormat.getDateTimeInstance().format(new Date());
                System.out.println(date + " - Received Connection from " + socket.getRemoteSocketAddress());
                System.out.println("---");
                String line;
                while ((line = in.readLine()) != null) {
                    if (line.trim().isEmpty()) {
                        break;
                    }
                    System.out.println(line);
                }


            }

            System.out.println("=========================================");


            socket.close();
        }
    }



}