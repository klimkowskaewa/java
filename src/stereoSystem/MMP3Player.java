package stereoSystem;

public class MMP3Player extends MMusicPlayer{
    public MMP3Player(MSong[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 play " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("MP3 pause " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");
    }
}