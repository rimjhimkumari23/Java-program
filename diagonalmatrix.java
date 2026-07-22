import java.util.Scanner;
public class diagonalmatrix{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), c = s.nextInt();
        int[][] a = new int[r][c];
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j= 0; j < c; j++) {
                if(i==j){
                    System.out.print(a[i][j]+" ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();

    }}}