package stereoSystem;

public class MCDPlayer extends MMusicPlayer{
    public MCDPlayer(MSong[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CD plays " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("CD pause " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }

}