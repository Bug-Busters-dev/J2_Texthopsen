public class Hopser {
    int nededjumps1 = 0;
    int nededjumps2 = 0;
    int currendPos1 = 0;
    int currendPos2 = 0;

    public int hopsen(int start1, int start2, int[] extractedNumbers){
        int win = 0;
        
        currendPos1 = start1;
        currendPos2 = start2;
        while (true){

                currendPos1 += extractedNumbers[currendPos1];
                nededjumps1++;
                if (currendPos1 > extractedNumbers.length-1){
                    win = 1;
                    break;
                }

                currendPos2 += extractedNumbers[currendPos2];
                nededjumps2++;
                if (currendPos2 > extractedNumbers.length-1){
                    win = 2;
                    break;
                }

        }
        return win;
    }
}
