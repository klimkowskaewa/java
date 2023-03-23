public class MStereoSystem {
    public static void main(String[] args) {

        MSong[] library = new MSong[3];
        library[0] = new MSong("Michael Jackson", "Beat It", "Thriller" );
        library[1] = new MSong("Pearl Jam", "Even Flow", "Ten");
        library[2] = new MSong("Portishead", "Over", "NYC Live");

        MPlayer[] players = {new MCDPlayer(library), new MMP3Player(library)};

        players[0].play();
        players[0].pause();
        players[0].next();
        players[0].play();
        players[0].stop();

        System.out.println();

        players[1].play();
        players[1].stop();
        players[1].next();
        players[1].play();
        players[1].previous();
        players[1].play();
        players[1].stop();
        players[1].next();
        players[1].play();
        players[1].next();
        players[1].play();
    }

}