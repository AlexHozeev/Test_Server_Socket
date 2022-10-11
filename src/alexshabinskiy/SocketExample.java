package alexshabinskiy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketExample {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1111)){
            Socket accept = serverSocket.accept();   // wait for connection
            System.out.println("connection is established");
            Scanner scanner = new Scanner(accept.getInputStream(), StandardCharsets.UTF_16);
            var massage = scanner.nextLine();
            while (!massage.equals("exit")){
                System.out.println(massage);
                massage= scanner.nextLine();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
