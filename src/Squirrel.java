import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Squirrel {
    int[] nuts;
    Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
        return nuts[index];
    }

    public int maxNuts() {
        int maxNutsInt = 0;
        for (int i = 0; i < nuts.length; i++) {
            if ((i + 1) < nuts.length) {
                if ((i + 2) < nuts.length && nuts[i] < 0 && nuts[i + 1] < 0 && nuts[i + 2] < 0) {
                    if ((nuts[i] > nuts[i + 1] || (nuts[i] >= 0)) && (nuts[i] + nuts[i + 2]) > nuts[i + 1]) {
                        maxNutsInt += nuts[i];
                        maxNutsInt = Math.max(maxNutsInt, 0);
                    } else {
                        maxNutsInt += nuts[i + 1];
                        i++;
                        maxNutsInt = Math.max(maxNutsInt, 0);
                    }
                } else if (nuts[i] > nuts[i + 1] || (nuts[i] >= 0)) {
                    maxNutsInt += nuts[i];
                    maxNutsInt = Math.max(maxNutsInt, 0);
                } else {
                    maxNutsInt += nuts[i + 1];
                    i++;
                    maxNutsInt = Math.max(maxNutsInt, 0);
                }
            } else if (nuts[i] >= 0) {
                maxNutsInt += nuts[i];
                maxNutsInt = Math.max(maxNutsInt, 0);
            }
        }
            return maxNutsInt;
    }
    @Test
    public static void main(String[] args) {
        inputAndPrintSquirrelMaxNuts(3, new int[]{1, -1, 2, -2, -7, -7, 2, 1});
        inputAndPrintSquirrelMaxNuts(6, new int[]{2, 5, -3, -1});
        inputAndPrintSquirrelMaxNuts(9, new int[]{1, -2, -4, 7, 3, -2, -2, 1, -1});
        inputAndPrintSquirrelMaxNuts(4, new int[]{-2, 2, 4, -6, -2, -1, -2, 1});
        inputAndPrintSquirrelMaxNuts(1, new int[]{1});
        inputAndPrintSquirrelMaxNuts(0, new int[]{-1});
        inputAndPrintSquirrelMaxNuts(1, new int[]{1, -2});
        inputAndPrintSquirrelMaxNuts(11, new int[]{1, -2, 4, 6, 3, -2, -2, -3, -1});
        inputAndPrintSquirrelMaxNuts(5, new int[]{1, 1, 1, 1, 1});
        inputAndPrintSquirrelMaxNuts(4, new int[]{1, 1, 1, 1, -1});
        System.out.println("");
        inputAndPrintSquirrelMaxNuts(6, new int[]{2, 5, -3, -1});
        inputAndPrintSquirrelMaxNuts(9, new int[]{1, -2, 3, 1, -1, -4, 2, 3});
        inputAndPrintSquirrelMaxNuts(23, new int[]{10, -2, 3, 1, -1, -4, 2, 3, 2, 2, -2, -3, -100, -10, -1, 2, 10, -2, 3, -1, -2});
        inputAndPrintSquirrelMaxNuts(4, new int[]{-2, 2, 4, -6, -2, -1, -2, 1});
        inputAndPrintSquirrelMaxNuts(8, new int[]{10, -1, 2, -2, -7, -7, 2, 1});
    }

    private static void inputAndPrintSquirrelMaxNuts(int answer, int[] array) {
        Squirrel s = new Squirrel(array);
        System.out.println("we should have had = " + answer + ", we have: " + s.maxNuts());
    }
}
/*
* .[1, -1, 2, -2, -7, -7, 2, 1]
E.[2, 5, -3, -1]
E.[1, -2, -4, 7, 3, -2, -2, 1, -1]
E.[-2, 2, 4, -6, -2, -1, -2, 1]
.[1]
.[-1]
.[1, -2]
.[1, -2, 4, 6, 3, -2, -2, -3, -1]
.[1, 1, 1, 1, 1]
.[1, 1, 1, 1, -1]
* */