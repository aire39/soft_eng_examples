import java.util.Vector;

public class Song {
    private Metadata metadata;
    private String dataStream; // treated more like the name of the data file for this example

    Song(Metadata meta_data, String data_stream) {
        metadata = meta_data;
        dataStream = data_stream;
    }

    public Metadata GetMetadata() {
        return metadata;
    }

    public void SetDataStream(String data_stream) {
        dataStream = data_stream;
    }

    public void Play() {
        System.out.println("Play "  + dataStream);
    }
}
