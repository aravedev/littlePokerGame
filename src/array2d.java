import java.util.Arrays;

public class array2d {
    public static void main(String[] args) {
        /*
        * array 2d:
        * int[][] arr = new int[#row][#col]
        * */

        int[][] arr = new int[3][4];

        arr[0][0]=72;
        arr[0][1]=72;
        arr[0][2]=76;
        arr[0][3]=84;

        arr[1][0]=65;
        arr[1][1]=64;
        arr[1][2]=61;
        arr[1][3]=67;

        arr[2][0]=95;
        arr[2][1]=98;
        arr[2][2]=99;
        arr[2][3]=100;

        int[][] arr2={
                {72,74,78,76},
                {65,64,61,67},
                {95,98,99,100}
        };

        System.out.println("\tHarry "+Arrays.toString(arr[0]));
        System.out.println("\tRon "+Arrays.toString(arr[1]));
        System.out.println("\tHermione "+Arrays.toString(arr[2]));

        // looping though 2d array

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
