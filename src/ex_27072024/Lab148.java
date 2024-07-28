package ex_27072024;

public class Lab148 {
    public static void main(String[] args) {

        // Single-dimensional arrays
        //  have only one dimension, representing a list of elements.
        int [] ages = {90,91,93};
        int [] ages2 = new int[10];

        // Multi-dimensional arrays
        //  have two or more dimensions, representing a table or grid of elements.
        // As an Automation Tester 90% we will be using single dimension array
        // 2D, 3D will come in coding questions
        //There is 4d as well

        //1d
        int[] array_1d = new int[3];


        //  2D
        int[][] array_2d = new int[3][3];
        //By default elements will be zero
        // |0|0|0|
        // |0|0|0|
        // |0|0|0|
        array_2d[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|

        array_2d[1][2] = 65;

        System.out.println(array_2d.length);

    }
}
