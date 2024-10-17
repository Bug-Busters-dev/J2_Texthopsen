
public class Texthopsen {
    public static void main(String[] args) throws Exception {

        String dateipfad = "data\\hopsen5.txt";

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

        Hopser hopser = new Hopser();

        int win = hopser.hopsen(0, 1, extractedNumbers);

        System.out.println("Der Text ist " + extractedNumbers.length + " Buchstaben lang.");

        if (win == 1){
            System.out.println("Bella hat mit " + hopser.nededjumps1 + " Schprüngen gewonnen.");
            System.out.println("Amira war auf Position " + (hopser.currendPos2+1) );
            System.out.println("Bella war auf Position " + (hopser.currendPos1+1) );
        } else if (win == 2){
            System.out.println("Amira hat mit " + hopser.nededjumps2 + " Schprüngen gewonnen.");
            System.out.println("Bella war auf Position " + (hopser.currendPos1+1) );
            System.out.println("Amira war auf Position " + (hopser.currendPos2+1) );
        }
    }
}
