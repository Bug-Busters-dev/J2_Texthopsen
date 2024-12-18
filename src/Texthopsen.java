
public class Texthopsen {
    public static void main(String[] args) throws Exception {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";

        String dateipfad = args[0];


        FileReaderx fileReaderx = new FileReaderx();
        String text = fileReaderx.readText(dateipfad, 0);

        Converter converter = new Converter();
        char[] extractedLetters = converter.textToLetters(text);

        Hopser hopser = new Hopser();

        int win = hopser.hopsen(0, 1, extractedLetters);

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        int posi1 = 0;
        int posi2 = 0;
        int irelewanteZeichen = 0;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i))){
                System.out.print(text.charAt(i));
                irelewanteZeichen++;
            } else{
                boolean pos1InRange = (posi1 < hopser.pos1.size());
                boolean pos2InRange = (posi2 < hopser.pos2.size());

                if (pos1InRange && pos2InRange && hopser.pos1.get(posi1) == i-irelewanteZeichen && hopser.pos2.get(posi2) == i-irelewanteZeichen) {
                    System.out.print(ANSI_PURPLE + text.charAt(i) + ANSI_RESET);
                    if (posi1 < hopser.pos1.size()) posi1++;
                    if (posi2 < hopser.pos2.size()) posi2++;
                } else if (pos1InRange && hopser.pos1.get(posi1) == i-irelewanteZeichen) {
                    System.out.print(ANSI_RED + text.charAt(i) + ANSI_RESET);
                    if (posi1 < hopser.pos1.size()) posi1++;
                } else if (pos2InRange && hopser.pos2.get(posi2) == i-irelewanteZeichen) {
                    System.out.print(ANSI_BLUE + text.charAt(i) + ANSI_RESET);
                    if (posi2 < hopser.pos2.size()) posi2++;
                } else {
                    System.out.print(text.charAt(i));
                }
            }
        }
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        System.out.println("Der Text ist " + extractedLetters.length + " Buchstaben lang.");

        if (win == 1){
            System.out.println("Bela(1) hat mit " + hopser.nededjumps1 + " Sprüngen gewonnen.");
            System.out.println("Amira(2) springt aus dem Text heraus auf Position " + (hopser.currendPos2+1) );
            System.out.println("Bela(1) springt aus dem Text heraus auf Position " + (hopser.currendPos1+1) );
        } else if (win == 2){
            System.out.println("Amira(2) hat mit " + hopser.nededjumps2 + " Sprüngen gewonnen.");
            System.out.println("Bela(1) springt aus dem Text heraus auf Position " + (hopser.currendPos1+1) );
            System.out.println("Amira(2) springt aus dem Text heraus auf Position " + (hopser.currendPos2+1) );
        }
    }
}
