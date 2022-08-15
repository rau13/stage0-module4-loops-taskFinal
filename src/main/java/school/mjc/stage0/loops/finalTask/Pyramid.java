package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {              // loop row

            for (int j = 1; j <= cathetusLength - i; j++)        // loop column (Triangle one)
                System.out.print("  ");

            for (int k = i; k >= 1; k--)            // loop column (Triangle two)
                System.out.print(  " " + k);

            for (int k = 2; k <=i; k++)             // loop column (Triangle three)
                System.out.print( " " + k);

            System.out.println();                   // used to go on new line (new row)
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
