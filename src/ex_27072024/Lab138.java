package ex_27072024;

import java.util.Arrays;

public class Lab138 {
    public static void main(String[] args) {

//      Array with inbuilt functions available
        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        // elements are fixed.
        // len -> 6
        // who index - 3 ->
        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
//        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(marks_10_board[10]);
        System.out.println(Arrays.stream(marks_10_board).average());


    }
}
