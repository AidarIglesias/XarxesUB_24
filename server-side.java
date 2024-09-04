import java.net.*;
import java.io.*;

public class server{
    public static main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("Client successfully connected!");
    }
}