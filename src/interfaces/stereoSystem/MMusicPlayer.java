package interfaces.stereoSystem;

public abstract class MMusicPlayer implements MPlayer{
    private MSong[] library;
    private int current;

    public MMusicPlayer(MSong[] library) {
        this.library = library;
        this.current = 0;
    }

    public MSong getCurrentSong() {
        return library[current];
    };

    @Override
    public void next() {
        if(++current >= library.length) {
            current = 0;
        }
        play();
    }

    @Override
    public void previous() {
        if(--current < 0 ) {
            current = library.length - 1;
        }
        play();
    }

}