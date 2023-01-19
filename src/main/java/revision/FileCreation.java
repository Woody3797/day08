package revision;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {
    
    public static void main(String[] args) throws IOException {
        
        String dirPath = "./data";
        String fileName = "example.txt";
        File dir = new File(dirPath);

        if (dir.exists()) {
            System.out.println("dir exists");
        } else {
            dir.mkdir();
            System.out.println("directory alreay exists at " + dir.getCanonicalPath());
        }

        File file = new File(dirPath + File.separator + fileName);

        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file already exists at " + file.getCanonicalPath());
        }

        FileOutputStream fos = new FileOutputStream(file, true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i = 0;
        while (i < 10) {
            bos.write(i);
            bos.flush();
            i++;
        }
        bos.close();




        // String dirPath = "data";
        // String fileName = "data.txt";

        // // create a directory
        // File newDir = new File(dirPath);
        // boolean isDirCreated = newDir.mkdir();

        // if (isDirCreated)
        //     System.out.println("New directory " + dirPath + " created");
        // else
        //     System.out.println("Directory " + dirPath + " already exists");

        // // create a file in the directory created above
        // File newFile = new File(dirPath + File.separator + fileName);
        // boolean isFileCreated = newFile.createNewFile();
        
        // if (isFileCreated)
        //     System.out.println("New file " + fileName + " created");
        // else    
        //     System.out.println("File " + fileName + " already exists");

        // // list files under a directory
        // File fileList[] = newDir.listFiles();
        // for(File f : fileList) {
        //     System.out.println("File " + f.getPath() + ":" +f.getCanonicalFile());
        // }

        // // Use FileOutputStream to write some integers to file 'data.txt'
        // FileOutputStream fos = new FileOutputStream(newFile, true);
        // for(int i = 0; i < 10; i++) {
        //     char str[] = Integer.toString(i).toCharArray();
        //     fos.write(str[0]);
        //     fos.write('\n');
        // }

        // String welcomeMessage = "Welcome to ISS TFIP programme";

        // // convert string to byte[] array using getBytes()
        // byte[] outputData = welcomeMessage.getBytes();

        // // writing the string in byte array
        // // one character at a time to the file
        // fos.write(outputData);

        // // clear the OutputStream
        // // force data to store to the file destination
        // fos.flush();
        // fos.close();

    }
}
