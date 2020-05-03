package ErgasiaPF;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ManageFiles {
    private  ArrayList<Media> mediafiles = new ArrayList<>();

    public void addMedia(Media media){
        mediafiles.add(media);

    }
    public void dispayMedia()
    {
        mediafiles.forEach(System.out::println);


    }
    public void remove(int index){
        if (index>=0 && index < mediafiles.size()){
            mediafiles.remove(index);
        }
    }
    public void save(String filename)   {

        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Media p : mediafiles) {
                printWriter.println(p.getFileName() + "," + p.getDescription() + "," + p.getSize()
                        + "," + p.getTittle());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be saved");
        }

    }


}
