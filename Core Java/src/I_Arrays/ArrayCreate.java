package I_Arrays;

import java.util.Scanner;

public class ArrayCreate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = s.nextInt();
        int [] n = new int[size];
        System.out.println("Enter "+size+" values: ");
        for (int i = 0; i < n.length; i++){
            n[i] = s.nextInt();
        }
        System.out.println("Given Array Elements");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
        //Enhanced  for loop (foreach) - added in java 5  version
        System.out.println("Given Array Elements - foreach");
        for (int x: n) {
            System.out.print(x+" ");
        }
    }
}
