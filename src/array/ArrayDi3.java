package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        }; //행2, 열3

        for (int row = 0; row <2; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
