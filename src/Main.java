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
        board.newGame();
        board.makeMove(1, 2);
        board.makeMove(1, 1);

        board.makeMove(2, 2);
        board.makeMove(2, 1);

        board.makeMove(3, 1);
        board.makeMove(3, 2);

        board.makeMove(2, 3);
        board.makeMove(1, 3);

        System.out.println(board.makeMove(3, 3));
        printField(board.getField());

        board.newGame();
        board.makeMove(3, 1);
        board.makeMove(1, 2);

        board.makeMove(3, 2);
        board.makeMove(2, 1);

        System.out.println(board.makeMove(3, 3));
        printField(board.getField());

    }

    static void printField(String[][] field) {
        for (int i = 0; i < 3; i++)
            System.out.printf("[%s, %s, %s]", field[i][0], field[i][1], field[i][2]);
    }
}
