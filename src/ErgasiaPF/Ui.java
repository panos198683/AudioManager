package ErgasiaPF;

import java.util.Scanner;

public class Ui {

    public Choice menu() {


        System.out.println("1. Add a file    2. Remove a file" +
                "    3. Display files    4.  Save file     0. Exit" +
                "");
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return Choice.ADD;
                case 2:
                    return Choice.REMOVE;
                case 3:
                    return Choice.DISPLAY;
                case 4:
                    return Choice.SAVE;
                case 5:
                    return Choice.EXIT;

            }
        } catch (Exception e) {
            return Choice.ERROR;
        }

return null;
    }
    public   Media createMedia() {
         String fileName;
         String tittle;
         String description;
         String size;
        String imageQuality;
        String soundQuality;
        String videoQuality;
        int MediaType;


        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sound 2.Video  3.Image");
        MediaType = scanner.nextInt();
        System.out.println("Give the Media filename ");
        fileName = scanner.next();
        System.out.println("Give the Media tittle ");
        tittle = scanner.next();
        System.out.println("Give the Media description ");
        description = scanner.next();
        System.out.println("Give the Media size ");
        size = scanner.next();

        Media media;
        switch (MediaType) {
            case 1:
                System.out.println("Give Sound qualiy ");
                soundQuality = scanner.next();
                media = new Sound(fileName,tittle,size,description,soundQuality);
                break;
            case 2:
                System.out.println("Give Video quality");
                videoQuality = scanner.next();
                media = new Video(fileName,tittle ,size ,description ,videoQuality );
                break;
            case 3:
                System.out.println("Give image quality");
                imageQuality= scanner.next();
                media =new Image(fileName,tittle,size,description,imageQuality);
break;


            default:
                return null;

        }
        return media;
    }

    public void manage(ManageFiles manageFiles){
        Choice choice;
        do {
            choice =  menu();

            switch (choice) {
                case ADD:
                    Media media =  createMedia();
                    manageFiles.addMedia(media);
                    break;
                case REMOVE:
                    System.out.println("Give an index to remove");
                    Scanner scanner = new Scanner(System.in);
                    int index= scanner.nextInt();
                    manageFiles.remove(index);
                    break;
                case DISPLAY:
                    manageFiles.dispayMedia();
                    break;
               // case CLEAR:
                  //  basket.clearProducts();
                   // break;
               // case TOTALCOST:
                  //  System.out.println("TotalCost= " + basket.getTotalCost());
                   // break;
                case EXIT:
                    break;
                case SAVE:
                    manageFiles.save("file.txt");
                    break;
               // case LOAD:
                  //  basket.loadBasket("basket.txt");
                   // break;
                case ERROR:
                    System.out.println("You gave erroneous input");
                    break;

            }
        }
        while(choice!=Choice.EXIT);

    }







}
