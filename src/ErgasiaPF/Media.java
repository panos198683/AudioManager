package ErgasiaPF;
import java.util.Objects;

public  class  Media {
    private String fileName;
    private String tittle;
    private String description;
    private String size;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }





    public Media(String fileName, String tittle, String description, String size) {
        this.fileName = fileName;
        this.tittle = tittle;
        this.description = description;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Media{" +
                "fileName='" + fileName + '\'' +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                 +                '}';
    }


}
