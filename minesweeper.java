import java.util.Scanner;

/**
 * minesweeper
 */
public class minesweeper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size of matrix: ");
        int n = input.nextInt();
        int m = input.nextInt();
        String[][] mines = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mines[i][j] = input.next();
            }
        }
        printMines(mines);
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mines[i][j].charAt(0) == '*')
                {
                    mines[i][j]="*";
                    continue;
                }
                    
                mines[i][j] = solveMines(mines, i, j);
                
            }
        }
        printMines(mines);

    }

    public static String solveMines(String[][] mines, int row, int col) {
        int count=0;
        if(row - 1 >= 0 && mines[row-1][col].charAt(0) == '*') {
                count++;
        }
        if(row + 1 < mines[0].length && mines[row + 1][col].charAt(0) == '*' )
        {
            count++;  
        }
        if(col - 1 >= 0 && mines[row][col - 1].charAt(0) == '*')
        {
           count++;
        }
        if(col + 1 < mines.length && mines[row][col + 1].charAt(0) == '*') {
            count++;
        }

        if ((row - 1 >= 0 && col - 1 >= 0) && mines[row - 1][col - 1].charAt(0) == '*') {
            count++;
        }
        if ((col + 1 < mines.length && row - 1 >= 0 ) && mines[row - 1][col + 1].charAt(0) == '*') {
           count++;
        }

        if ((col - 1 >=0 && row + 1 < mines[0].length) && mines[row + 1][col - 1].charAt(0) == '*' ){
            count++;
        }
        if ((col + 1 < mines.length && row + 1 < mines[0].length) && mines[row + 1][col + 1].charAt(0) == '*' ) {
            count++;
        }
        return String.valueOf(count);

    }

    public static void printMines(String[][] mines) {

        for (int i = 0; i < mines[0].length; i++) {
            for (int j = 0; j < mines.length; j++) {
                System.out.print(mines[i][j] + " ");
            }
            System.out.println();
        }
    }
}