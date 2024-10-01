
import java.util.*;

class SnakeGame {

    private char mat[][];
    private int n;
    private int m;

    public SnakeGame(int n, int m) {
        this.n = n;
        this.m = m;
        mat = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = '#';
            }
        }
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public char[][] getMat() {
        return mat;
    }
    
    public void start() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        mat[0][0] = '.';
        addFood();
        printFun();
        game(0, 0, q);
    }

    public void game(int i, int j, Queue<int[]> q) {
        // while(true){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Direction ");
        char ch = sc.next().charAt(0);
        int row;
        int col;
        switch (ch) {
            case 'L' -> {
                row = i;
                col = j - 1;
            }
            case 'R' -> {
                row = i;
                col = j + 1;
            }
            case 'U' -> {
                row = i - 1;
                col = j;
            }
            default -> {
                row = i + 1;
                col = j;
            }
        }
        if (row >= 0 && row < n && col >= 0 && col < m) {
            if (mat[row][col] == '.') {
                System.out.println("Game Over!!...");
                // System.exit(0);
                return;
            }
            if (mat[row][col] != 'X') {
                int arr[] = q.poll();
                mat[arr[0]][arr[1]] = '#';
                
            }
            mat[row][col] = '.';
            q.add(new int[]{row, col});
            
            printFun();
            game(row, col, q);
        } else {
            System.out.println("Game Over!!....");
            System.exit(0);
        }
        // }
    }

    public void printFun() {
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(mat[i][j]=='X')  cnt++;
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        if(cnt<2)
            addFood();
    }

    private void addFood() {
        Random r = new Random();
        while(true){
            int i = r.nextInt(n);
            int j = r.nextInt(m);
            if(check(i,j)){
                mat[i][j] = 'X';
                return;
            }
        }
    }

    private boolean check(int i, int j) {
        return mat[i][j]!='.';
        
    }

    
}
