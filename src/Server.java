import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class Server {

    public int port = 3200;

    public DatagramSocket dSocket;
    public DatagramPacket inPacket;
    public DatagramPacket outPacket;
    public byte[] bufferIn, bufferOut;
    public String messageIn, messageOut;
    public Date d;

    public Server() {
        try {
            // Creazione del socket UDP sulla porta specificata
            dSocket = new DatagramSocket(port);
            System.out.println("Server avviato sulla porta: " + port);
        } catch (BindException e) {
            System.err.println("Errore: porta già in uso.");
        } catch (SocketException e) {
            System.err.println("Errore nella creazione del socket UDP.");
        }
    }

    public void ascolto() {
        while (true) {
            System.out.println("Server in ascolto sulla porta " + port + "!\n");
            bufferIn = new byte[256];
        }
    }
}
