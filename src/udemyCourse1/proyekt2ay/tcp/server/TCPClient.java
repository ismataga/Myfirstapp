package udemyCourse1.proyekt2ay.tcp.server;

import udemyCourse1.proyekt2ay.util.FileUtility;

import java.io.DataOutputStream;

import java.io.OutputStream;
import java.net.Socket;



public class TCPClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6789);
        System.out.println("iuuuuhhjk");
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] bytes = FileUtility.readBytes("C:/Users/CoreTech/Desktop/educ/ismat.png");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write("Salam server necesen".getBytes());
        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();


    }
}
