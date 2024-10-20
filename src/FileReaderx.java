
import java.io.*;

public class FileReaderx {

    public String readText(String file, int aZeile) {
        StringBuilder textBuilder = new StringBuilder();  // StringBuilder für zusammenhängenden String
    
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
    
            // Überspringe die ersten Zeilen bis zur gewünschten Startzeile
            for (int q = 0; q < aZeile; q++) {
                br.readLine();
            }
    
            // Lies die Datei Zeile für Zeile
            String zinhalt;
            while ((zinhalt = br.readLine()) != null) {
                textBuilder.append(zinhalt);  // Füge jede Zeile direkt an den StringBuilder an
            }
    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Datei existiert nicht.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Lesen hat nicht geklappt.");
        }
    
        return textBuilder.toString();  // Rückgabe des gesamten zusammenhängenden Strings
    }
    
}