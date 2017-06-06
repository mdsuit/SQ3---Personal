package DataManipulation;

/**
 * Created by MDS1728 on 5/24/2017.
 */
    public class DoubleArray {
        static final int ROWS = 1000;
        static final int COLS = 1000;

        public static void main(String[] args) {
            String[][] matrixNumbers = {{"00","01","02","03","04"},
                    {"10","11","12","13","14"},
                    {"20","21","22","AA","24"}};

            for (int row = 0; row <= 2; row++){
                for(int col = 0; col <= 4; col++){
                    if(matrixNumbers[row][col] == "AA"){
                        System.out.print("Row = "+row);
                        System.out.print(" Col = "+col);
                        //Short cut for println is sout+TAB
                        System.out.println("\nRow = "+row+" Col = "+col);
                    }
                }
            }
    }
}

