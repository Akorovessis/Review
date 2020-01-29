public class Media {
    private String title;
    private int duration;

    public Media(){
    }

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
    public void playNow(){
        System.out.println(title + ", " + duration);
    }
}
