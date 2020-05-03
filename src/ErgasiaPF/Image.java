package ErgasiaPF;

public class Image extends Media {
    private String imageQuality;

    public Image(String fileName, String tittle, String description, String size,String imageQuality) {
        super(fileName, tittle, description, size);
        this.imageQuality=imageQuality;
    }

    public String getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(String imageQuality) {
        this.imageQuality = imageQuality;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageQuality='" + imageQuality + '\'' +
                '}';
    }
}
