package alexshabinskiy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerService {

    private final ServerSocket serverSocket;

    public ServerService(int port) {
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Socket getConnection() {
        try {
            return this.serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
