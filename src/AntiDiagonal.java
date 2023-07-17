import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = scanner.nextInt();
        System.out.println("enter column size");
        int column_size = scanner.nextInt();
        int array[][] = new int[row_size][column_size];
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < column_size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        findAntiDiagonal(array, row_size, column_size);
    }

    public static void findAntiDiagonal(int array[][], int row_size, int column_size) {
        for(int x = 0; x < row_size-1;x++)
        {
            int i = 0;
            int j = x;
            while (i < row_size) {
                if(j>=0)
                {
                    System.out.print(array[i][j]+" ");
                }
                else{
                    System.out.print("0 ");
                }
                i++;
                j--;
            }

            System.out.println();
        }
        for(int y = 0; y < column_size;y++)
        {
            int i = y;
            int j = column_size - 1;
            while (j>=0) {
                if(i<row_size)
                {
                    System.out.print(array[i][j]+" ");
                }
                else
                {
                    System.out.print("0 ");
                }
                i++;
                j--;
            }
            System.out.println();
        }
    }
}

