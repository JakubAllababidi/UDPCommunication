import java.net.*;

public class Client {
    String nome;
    int porta;
    DatagramSocket dSocket;
    DatagramPacket outPacket;
    DatagramPacket inPacket;
    InetAddress serverAddress; //indirizzo ip

    public Client(String nome, int porta) {
        this.nome = nome;
        this.porta = porta;

    }
   

    public void inizio() {
        try {
            serverAddress = InetAddress.getLocalHost();
            dSocket = new DatagramSocket();
            System.out.println("DatagramSocket  del Client creato!");
        } catch (SocketException e) {
            System.err.println("Errore durante la creazione del DatagramSocket");
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            System.err.println("Errore ricerca dell'indirizzo del Server.");
            throw new RuntimeException(e);
        }
    }

    public void richiedi() {
    }

    public void ricevi() {
    }

    public void chiudi() {
        if (dSocket != null) {
            dSocket.close();
            System.out.println("Comunicazione interrotta");
        }

    }
}


