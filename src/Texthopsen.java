
public class Texthopsen {
    public static void main(String[] args) throws Exception {

        String dateipfad = "data\\hopsen1.txt";

        FileReaderx fileReaderx = new FileReaderx();
        char[] extractedLetters = fileReaderx.redarray(dateipfad, 0);

        Converter converter = new Converter();
        int[] extractedNumbers = converter.lettersToNumbers(extractedLetters);

        System.err.println("--------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < extractedLetters.length; i++){
            System.out.print(extractedLetters[i]);
        }
        System.err.println();

        System.err.println("--------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < extractedNumbers.length; i++){
            System.out.print(extractedNumbers[i]);
        }
        System.err.println();

        System.err.println("--------------------------------------------------------------------------------------------------------------------");

        


    }
}
