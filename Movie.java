public class Movie extends Media {
    private boolean color;

    public Movie(){
    }

    public Movie(String title, int duration, boolean color) {
        super(title, duration);
        this.color = color;
    }

    @Override
    public void playNow() {
        super.playNow();
        System.out.println(color);
    }
}
