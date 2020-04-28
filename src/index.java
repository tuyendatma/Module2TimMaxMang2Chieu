import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu rong ma tran");
        int width = scanner.nextInt();
        System.out.println("moi ban nhap chieu dai ma tran");
        int height = scanner.nextInt();
        int[][] matrix = new int[width][height];
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                System.out.print("nhap gia tri tai x= "+i+" y= "+j+"\t");
                matrix[i][j]=scanner.nextInt();
            }
        }
        int max=timMax(matrix);
        System.out.println(max);

    }
    public static int timMax(int[][] arr){
        int max =arr[0][0];
        //wow for each duyet mang 2 chieu ne :)))
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
