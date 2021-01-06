/**
 * Created by laurashi on 4/4/18.
 */
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;

    /**
     * The number of values to shuffle.
     */
    private static final int VALUE_COUNT = 4;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];

        for (int i = 0; i < values1.length; i++)
        {
            values1[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void perfectShuffle(int[] values) {
        int k = 0;
        int[] shuffled = new int[VALUE_COUNT];
        for(int j = 0; j <= VALUE_COUNT / 2 - 1; j++){
            shuffled[k] = values[j];
            k += 2;
        }

        k = 1;
        for(int j = VALUE_COUNT / 2; j <= VALUE_COUNT - 1; j++){
            shuffled[k] = values[j];
            k += 2;
        }
        for(int i = 0; i < shuffled.length; i++){
            values[i] = shuffled[i];
        }
    }


    public static void selectionShuffle(int[] values) {
        for(int k = VALUE_COUNT - 1; k >= 1; k--){
            int r = (int) (Math.random() * k);
            int n = values[k];
            values[k] = values[r];
            values[r] = n;
        }
    }

}
