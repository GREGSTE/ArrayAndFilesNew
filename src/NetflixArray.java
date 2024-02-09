import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class NetflixArray {

    private final int ARRAY_MAX = 20000;

    private NetflixShow[] showArray = new NetflixShow[ARRAY_MAX];

    private int noOfItems = 0;

    public NetflixArray (String fileName){
        loadFile (fileName);
    }// end of netflixArray constructor

    public void loadFile (String fileName){
        try{
            File netflixFile = new File(fileName);
            Scanner fileReader = new Scanner(netflixFile);

            while (fileReader.hasNextLine ()){
                String curLine = fileReader.nextLine();
                Scanner parser = new Scanner(curLine);
                parser.useDelimiter(";");
                String show = parser.next ();
                int count = Integer.parseInt(parser.next());
                showArray[noOfItems] = new NetflixShow(show,count);
                noOfItems++;
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null, " Error reading file");
        }
    }// end of loadFile class

    public void saveFile (String fileName){
        try{

            File netflixFile = new File(fileName);
            FileWriter newFile = new FileWriter(netflixFile);

            for (int index = 0; index < noOfItems; index ++ ){
                newFile.write(showArray[index].forFile());
            }//end of for loop
            newFile.flush();
            newFile.close();
        }//end of try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, " Error writing to  file");

        }// end of catch

    }// end of saveFile class





}// end of Netflix Array class
