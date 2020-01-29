import java.util.ArrayList;

public class Song extends Media {
    private int channels;
    private ArrayList<Singer> singers = new ArrayList<>();

    public Song(){
    }

    public Song(String title, int duration, int channel) {
        super(title, duration);
        this.channels = channel;
    }

    @Override
    public void playNow() {
        super.playNow();
        System.out.println(channels);
        for(Singer s: singers){
            System.out.println(s.getName());
        }
    }
    public void addSinger(Singer singer){
        singers.add(singer);
    }
}
