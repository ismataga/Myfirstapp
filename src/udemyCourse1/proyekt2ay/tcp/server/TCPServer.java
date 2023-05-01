package udemyCourse1.proyekt2ay.tcp.server;


import udemyCourse1.proyekt2ay.util.FileUtility;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {
    public static void main(String[] args) throws Exception {
        readAsByte();
    }


    private static void readAsByte() throws Exception {

        ServerSocket ourFirstServerSocket = new ServerSocket(6789);

        while (true) {
            System.out.println("Yeni socket ucun ve ya basqa sozle basqa musteri ucun gozleyirrem");
            Socket connection = ourFirstServerSocket.accept();//gozleyecek
            System.out.println("urra yeni musteri geldi");

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());
            byte[] data = readMessage(dataStream);
            System.out.println("message length " + data.length);//500
            FileUtility.writeBytes("C:\\Users\\CoreTech\\Desktop\\educ\\ismat.png", data);
        }
    }


    public static byte[] readMessage(DataInputStream din) throws Exception {
        int msgLen = din.readInt();//0
        System.out.println("msgLen " + msgLen);//500
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;

    }


    private static void readAsString() throws IOException {
        ServerSocket ourFirstServerSocket = new ServerSocket(6789);

        while (true) {
            System.out.println("Yeni socket ucun ve ya basqa sozle basqa musteri ucun gozleyirrem");
            Socket connection = ourFirstServerSocket.accept();//gozleyecek
            System.out.println("urra yeni musteri geldi");
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(reader);

            String messageFromClient = bReader.readLine();
            System.out.println("musteri deyirki: " + messageFromClient);
        }
    }
}
