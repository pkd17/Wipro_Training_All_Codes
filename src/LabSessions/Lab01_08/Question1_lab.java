package Lab01_08;

import java.io.File;

public class Question1_lab {
    public static void main(String[] args) {
        File folder = new File("D:/"); 

        String[] list = folder.list();  

        if (list != null) {
            System.out.println("Files and directories in " + folder.getPath() + ":");
            for (String name : list) {
                System.out.println(name);
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
