import java.sql.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Task №1
        System.out.println();
        System.out.println("          Задача №1");
        int[] arraysInt = new int[]{1, 2, 3};
        float[] arraysFractional = {1.57f, 7.654f, 9.986f};
        boolean[] arraysBoolean = new boolean[5];
        arraysBoolean[0] = true;
        arraysBoolean[3] = true;

//        Task №2
        System.out.println();
        System.out.println("          Задача №2");
        for (int i = 0; i < arraysInt.length; i++) {
            if (i == arraysInt.length - 1) {
                System.out.println(arraysInt[i]);
                break;
            }
            System.out.print(arraysInt[i] + ", ");
        }
        for (int i = 0; i < arraysFractional.length; i++) {
            if (i == arraysFractional.length - 1) {
                System.out.println(arraysFractional[i]);
                break;
            }
            System.out.print(arraysFractional[i] + ", ");
        }
        for (int i = 0; i < arraysBoolean.length; i++) {
            if (i == arraysBoolean.length - 1) {
                System.out.println(arraysBoolean[i]);
                break;
            }
            System.out.print(arraysBoolean[i] + ", ");
        }

        //        Task №3
        System.out.println();
        System.out.println("          Задача №3");
        for (int i = arraysInt.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(arraysInt[i - 1]);
                break;
            }
            System.out.print(arraysInt[i - 1] + ", ");
        }
        for (int i = arraysFractional.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(arraysFractional[i - 1]);
                break;
            }
            System.out.print(arraysFractional[i - 1] + ", ");
        }
        for (int i = arraysBoolean.length; i > 0; i--) {
            if (i == 1) {
                System.out.println(arraysBoolean[i - 1]);
                break;
            }
            System.out.print(arraysBoolean[i - 1] + ", ");
        }

        //        Task №4
        System.out.println();
        System.out.println("          Задача №4");
        for (int i = 0; i < arraysInt.length; i++) {
            if ((arraysInt[i] % 2) != 0) {
                arraysInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arraysInt));
    }
}