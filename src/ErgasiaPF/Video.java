package ErgasiaPF;

public class Video extends Media {

    private String videoQuality;
    public Video(String fileName, String tittle, String description, String size,String VideoQuality) {
        super(fileName, tittle, description, size);
        this.videoQuality =VideoQuality;
    }

    public String getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoQuality='" + videoQuality + '\'' +
                '}';
    }
}
