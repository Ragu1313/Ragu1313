import java.util.*;

class TestSnakeGame{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row and col ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        SnakeGame s = new SnakeGame(row, col);
        s.start();
        // sc.close(); 
    }
}