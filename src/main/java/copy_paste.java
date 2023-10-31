import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class copy_paste {

    static void copyCode() {
        File source = new File("/media/prabeer-pc/New Volume2/Data/Dashcam/22_Oct_2023.zip");
        File dist = new File("/media/prabeer-pc/E20F-0251/Recordings/22_Oct_2023.zip");

        try {
            System.out.println("Coping Started, Please Wait...");
            // Copy File
            FileUtils.copyFile(source, dist);

            // Copy Dir
//            FileUtils.copyDirectory(source,dist);
            System.out.println("Coping Finished, Please Check...");

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyCode();
    }


}
