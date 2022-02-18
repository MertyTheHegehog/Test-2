public class Main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        printField(board.getField());
        System.out.println(board.makeMove(1, 1));
        printField(board.getField());
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
        printField(board.getField());
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(2, 2));
        printField(board.getField());
    }
    //now first test-branch is removed
    //comment
    static void printField(String[][] field) {
        for (int i = 0; i < 3; i++)
            System.out.printf("[%s, %s, %s]", field[i][0], field[i][1], field[i][2]);
    }
}
