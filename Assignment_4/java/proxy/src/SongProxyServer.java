import java.util.List;
import java.util.Vector;

public class SongProxyServer implements SongService {
    private Vector<Metadata> metadataCache;
    private SongService songServer = null;

    SongProxyServer() {
        metadataCache = new Vector<>();
    }

    @Override
    public Song searchById(Integer songID) {
        if (songServer == null) {
            songServer = new SongServer();
        }

        Song song = songServer.searchById(songID);
        metadataCache.add(song.GetMetadata());

        return song;
    }

    @Override
    public Vector<Song> searchByTitle(String title) {
        if (songServer == null) {
            songServer = new SongServer();
        }

        Vector<Song> song_list = songServer.searchByTitle(title);
        for (Song s : song_list) {
            if (s.GetMetadata().title == title) {
                metadataCache.add(s.GetMetadata());
            }
        }

        return song_list;
    }

    @Override
    public Vector<Song> searchByAlbum(String album) {
        if (songServer == null) {
            songServer = new SongServer();
        }

        Vector<Song> song_list = songServer.searchByAlbum(album);
        for (Song s : song_list) {
            if (s.GetMetadata().album == album) {
                metadataCache.add(s.GetMetadata());
            }
        }

        return song_list;
    }

    void PrintMetadata () {
        for (Metadata m : metadataCache) {
            System.out.println("Song ID: " + m.id);
            System.out.println("Song Title: " + m.title);
            System.out.println("Song Album: " + m.album);
            System.out.println("Song Duration: " + m.duration);
        }
    }
}
