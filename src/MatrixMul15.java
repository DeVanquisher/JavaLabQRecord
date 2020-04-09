import java.util.Scanner;

public class MatrixMul15 {
    public static int[][] product(int[][] matrix1, int[][] matrix2)
    {
        int columnsOfFirstMatrix = matrix1[0].length;
        int rowsOfSecondMatrix = matrix2.length;

        if(columnsOfFirstMatrix != rowsOfSecondMatrix)
        {
            throw new IllegalArgumentException(String.format("can't multiply matrices, columns of first matrix"+" %d is not equal to rows of second matrix %d",columnsOfFirstMatrix,rowsOfSecondMatrix));
        }
        int rowsOfFirstMatrix = matrix1.length;
        int columnsOfSecondMatrix = matrix2[0].length;
        int[][] product = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];

        for(int i =0 ; i < rowsOfFirstMatrix; i++)
        {
            for(int j= 0; j < columnsOfSecondMatrix; j++)
            {
                int sum = 0;
                for(int k = 0; k < rowsOfSecondMatrix; k++)
                {
                    sum = sum + matrix1[i][k]*matrix2[k][j];
                }
                product[i][j] = sum;
            }
        }
        return product;
    }
    public static void main(String[] args) {
        //first matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows and column for first matrix.");
        int rowsOfFirstMatrix = sc.nextInt();
        int columnsOfFirstMatrix = sc.nextInt();
        int[][] aMatrix = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];
        //second matrix
        System.out.println("Enter the size of rows and column for second matrix.");
        int rowsOfSecondMatrix = sc.nextInt();
        int columnsOfSecondMatrix = sc.nextInt();
        int[][] bMatrix = new int[rowsOfSecondMatrix][columnsOfSecondMatrix];
        //check the condition for multiplication of two matrices
        while (columnsOfFirstMatrix != rowsOfSecondMatrix)
        {
            System.out.printf("Matrices with entered orders can't be multiplied with each other, "+ "columnsOfFirstMatrix [%d] != rowsOfSecondMatrix [%d] %n", columnsOfFirstMatrix, rowsOfSecondMatrix);
            System.out.println("Enter the number of rows and columns of second matrix");
            rowsOfSecondMatrix = sc.nextInt();
            columnsOfSecondMatrix = sc.nextInt();
        }

        //Filling first matrix
        System.out.println("Enter the elements in first matrix.");
        for(int i = 0; i < rowsOfFirstMatrix; i++)
        {
            for(int j = 0; j < columnsOfFirstMatrix; j++)
            {
                aMatrix[i][j] = sc.nextInt();
            }
        }

        //Filling second matrix
        System.out.println("Enter the elements in second matrix.");
        for(int i = 0; i < rowsOfFirstMatrix; i++)
        {
            for(int j = 0; j < columnsOfFirstMatrix; j++)
            {
                bMatrix[i][j] = sc.nextInt();
            }
        }

        int[][] product = product(aMatrix,bMatrix);
        System.out.println("Product of matrices :");
        for(int i = 0; i < rowsOfFirstMatrix;i++){
            for(int j = 0; j < columnsOfSecondMatrix; j++)
            {
                System.out.printf("%d\t",product[i][j]);
            }
            System.out.printf("%n");
        }
        sc.close();
    }
}
