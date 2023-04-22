import java.util.Vector;

public interface SongService {
    Song searchById(Integer songID);
    Vector<Song> searchByTitle(String title);
    Vector<Song> searchByAlbum(String album);
}
