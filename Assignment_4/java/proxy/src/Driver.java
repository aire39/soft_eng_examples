public class Driver {
    public static void main(String[] args) {
        SongProxyServer proxy_server = new SongProxyServer();

        proxy_server.searchById(2);
        proxy_server.searchByTitle("Test");
        proxy_server.searchByAlbum("Jaded");

        proxy_server.PrintMetadata();
    }
}