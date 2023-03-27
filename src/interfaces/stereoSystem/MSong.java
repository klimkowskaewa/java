package interfaces.stereoSystem;

public class MSong {
    private String artist;
    private String title;
    private String album;

    public MSong(String artist, String title, String album) {
        this.artist = artist;
        this.title = title;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

}