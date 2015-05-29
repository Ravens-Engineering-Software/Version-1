
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author @author Kieran Bingham, Cameron Sokalski, Jacob Larose
 */
public class FileReader {

    //Create variables for file reading
    String fileSeperator = System.getProperty("file.separator"); 
    String relativePath = "src" + fileSeperator + "resorces" + fileSeperator + "sizesListVIR.txt"; 
    File bitSizes = new File(relativePath);
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    DataInputStream dis = null;
    double[] bitDecimals = new double[57];
    String[] bitFraction = new String[57];

    void initialFileReader() {
        try {
            fis = new FileInputStream(bitSizes);

            // Here BufferedInputStream is added for fast reading.
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            // dis.available() returns 0 if the file does not have more lines.
            int i = 0;
            while (dis.available() != 0) {
                String line = dis.readLine();
                int j = 0;
                for (String s : line.split("\\s+")) {
                    if (j == 0) {
                        bitFraction[i] = s;
                        System.out.println(bitFraction[i]);
                    } else if (j == 1) {
                        bitDecimals[i] = Double.parseDouble(s);
                        System.out.println(bitDecimals[i]);
                    } else {
                        System.out.println("file error");
                    }
                    j++;
                }
                i++;
                System.out.println();
            }

            // dispose all the resources after using them.
            fis.close();
            bis.close();
            dis.close();

            System.out.println("file read succesfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("errorrororor.");
        }
    }
    
}
