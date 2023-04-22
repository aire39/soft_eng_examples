import java.util.List;
import java.util.Vector;

public class SongServer implements SongService {
    private final Vector<Song> songs;

    private void EstablishConnectionTime(int duration_milliseonds) {
        try {
            Thread.sleep(duration_milliseonds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    SongServer() {
        System.out.println("Connecting to Song Server...");

        songs = new Vector<>();

        Metadata meta_0 = new Metadata();
        meta_0.id = 0;
        meta_0.title = "Test";
        meta_0.album = "Records To be Tested";
        meta_0.duration = 15*60;
        String data_stream_test = "TestData";
        Song song_0 = new Song(meta_0, data_stream_test);

        Metadata meta_1 = new Metadata();
        meta_1.id = 1;
        meta_1.title = "Bravo";
        meta_1.album = "Jaded";
        meta_1.duration = 18*60;
        String data_stream_bravo = "JTestData";
        Song song_1 = new Song(meta_1, data_stream_bravo);

        Metadata meta_2 = new Metadata();
        meta_2.id = 2;
        meta_2.title = "Jump Up";
        meta_2.album = "Jump Records";
        meta_2.duration = 12*60;
        String data_stream_jump = "JumpTestData";
        Song song_2 = new Song(meta_2, data_stream_jump);

        Metadata meta_3 = new Metadata();
        meta_3.id = 1;
        meta_3.title = "Nice-Ice";
        meta_3.album = "Jaded";
        meta_3.duration = 12*60;
        String data_stream_nice_ice = "JTestData";
        Song song_3 = new Song(meta_3, data_stream_nice_ice);

        songs.add(song_0);
        songs.add(song_1);
        songs.add(song_2);
        songs.add(song_3);

        EstablishConnectionTime(1000);

        System.out.println("Connecting successful!");
    }

    void AddSongs(Vector<Song> songs_on_server) {
        for (Song s : songs_on_server) {
            songs.add(s);
        }
    }

    @Override
    public Song searchById(Integer songID) {

        EstablishConnectionTime(100);

        Song r_song = null;
        for (Song s : songs) {
            if (s.GetMetadata().id == songID) {
                r_song = s;
                break;
            }
        }

        return r_song;
    }

    @Override
    public Vector<Song> searchByTitle(String title) {

        EstablishConnectionTime(200);

        Vector<Song> song_list = new Vector<>();

        for (Song s : songs) {
            if (s.GetMetadata().title == title) {
                song_list.add(s);
            }
        }

        return song_list;
    }

    @Override
    public Vector<Song> searchByAlbum(String album) {

        EstablishConnectionTime(200);

        Vector<Song> song_list = new Vector<>();

        for (Song s : songs) {
            if (s.GetMetadata().album == album) {
                song_list.add(s);
            }
        }

        return song_list;
    }
}
