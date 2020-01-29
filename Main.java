public class Main {
    public static void main(String[] args) {
        Song song = new Song("Bieber", 100, 8);
        Singer singer = new Singer("Pappy");
        song.addSinger(singer);
        song.addSinger(new Singer ("nik"));
        song.playNow();


    }
}
