public class MainClient {
    public static void main(String[] args) {
        int port = 1500;
        String serverAddress = "localhost";
        Client c = new Client(serverAddress,port);
        c.inizio();
        c.richiedi();
        c.ricevi();
        c.chiudi();
    }
}
