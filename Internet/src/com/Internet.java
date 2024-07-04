package com;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Internet{

    
    public static boolean isAvailable() {
        // Create a socket object and set the timeout to 3 seconds
        Socket socket = new Socket();
        int timeout = 3000;

        try {
            // Try connecting to a well-known, fast and reliable host (Google DNS)
            InetSocketAddress socketAddress = new InetSocketAddress("8.8.8.8", 53);
            socket.connect(socketAddress, timeout);
            socket.close();
            return true;
        } catch (IOException e) {
            // An exception occurred, indicating that the internet connection is not available
            return false;
        }
    }

    public static boolean isAvailable(String hostName, int portNumber) {
        // Create a socket object and set the timeout to 3 seconds
        Socket socket = new Socket();
        int timeout = 3000;

        try {
            InetSocketAddress socketAddress = new InetSocketAddress(hostName, portNumber);
            socket.connect(socketAddress, timeout);
            socket.close();
            return true;
        } catch (IOException e) {
            // An exception occurred, indicating that the internet connection is not available
            return false;
        }
    }
    
}
