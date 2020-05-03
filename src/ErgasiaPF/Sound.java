package ErgasiaPF;

public class Sound extends Media {
    private String soundQuality;

    public Sound(String fileName, String tittle,String size,String description,String soundQuality) {
        super(fileName, tittle, description, size);
        this.soundQuality = soundQuality;
    }

    public String getSoundQuality() {
        return soundQuality;
    }

    public void setSoundQuality(String soundQuality) {
        this.soundQuality = soundQuality;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "soundQuality='" + soundQuality + '\'' +
                '}';
    }
}
