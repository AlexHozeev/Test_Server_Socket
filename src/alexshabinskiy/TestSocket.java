package alexshabinskiy;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestSocket {
    public static void main(String[] args) throws IOException {
        var connection = new ServerService(1111).getConnection();
        Scanner scanner = new Scanner(connection.getInputStream(), StandardCharsets.UTF_8);
        System.setOut(new PrintStream(connection.getOutputStream()));
        // code here

        //this code is work on server
    }
}
