import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] first = new int[]{1, 2, 3};
        float[] two = {1.57f, 7.654f, 9.986f};
        int[] free = {2, 10, 15};
//Задача 2;
        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(first[i]);
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(two[i]);
        }
        System.out.println();
        for (int i = 0; i < free.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(free[i]);
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = first.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.print(first[i]);
            }
        }
        System.out.println();

        for (int i = two.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();

        for (int i = free.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(free[i] + ", ");
            } else {
                System.out.print(free[i]);
            }
        }
        System.out.println();
        System.out.println("Задача 4");


        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) { // Проверяем, является ли число нечетным
                first[i] += 1;
                int[] box = {1, 2, 3};
            }
        }

        for (int i = 0; i < two.length; i++) {
            if (two[i] % 2 != 0) {
                two[i] += 1;
            }
        }
        int[] box = {1, 2, 3};

        for (int i = 0; i < free.length; i++) {
            if (free[i] % 2 != 0) {
                free[i] += 1;
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.toString(free));
    }

}