
import java.io.*;

public class FileReaderx {

    public String readText(String file, int aZeile) {
        StringBuilder textBuilder = new StringBuilder();  
    
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
    
            for (int q = 0; q < aZeile; q++) {
                br.readLine();
            }
    
            String zinhalt;
            while ((zinhalt = br.readLine()) != null) {
                textBuilder.append(zinhalt); 
            }
    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Datei existiert nicht.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Lesen hat nicht geklappt.");
        }
    
        return textBuilder.toString();  
    }
    
}