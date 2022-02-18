public class TicTacToe {
    String[][] field;
    String curPlayer;

    TicTacToe() {
        newGame();
    }

    public void newGame() {
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        curPlayer = "X";
    }

    public String[][] getField() {
        return field;
    }

    public String makeMove(int x, int y) {
        x--;
        y--;
        if (this.checkGame() == null) {//if game is going on
            if (!(field[x][y].equals("-"))) {
                return String.format("Cell %d, %d is already occupied", (x + 1), (y + 1));
            } else {
                field[x][y] = curPlayer;
                curPlayer = curPlayer.equals("X") ? "0" : "X";
                if (this.checkGame() == null) {
                    return "Move completed";
                } else if (this.checkGame().equals("D"))
                    return "Draw";
                else {
                    return String.format("Player %s won", this.checkGame());
                }
            }
        } else
            return "Game was ended";
    }

    public String checkGame() {
        if (this.checkDiagonals().equals("X") || this.checkLines().equals("X")) {
            return "X";
        } else if (this.checkDiagonals().equals("0") || this.checkLines().equals("0"))
            return "0";
        else
            return this.checkDraw();
    }

    String checkDiagonals() {
        byte CountX1, CountX2, CountY1, CountY2;
        CountX1 = CountX2 = CountY1 = CountY2 = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals("X"))
                CountX1++;
            else if (field[i][i].equals("0"))
                CountY1++;
            if (field[i][2 - i].equals("X"))
                CountX2++;
            else if (field[i][2 - i].equals("0"))
                CountY2++;
        }
        if (CountX1 == 3 || CountX2 == 3)
            return "X";
        else if (CountY1 == 3 || CountY2 == 3)
            return "0";
        else
            return "null";
    }

    String checkLines() {
        for (int i = 0; i < 3; i++) {
            if (this.checkStrings(i).equals("X") || this.checkColumns(i).equals("X"))
                return "X";
            else if (this.checkStrings(i).equals("0") || this.checkColumns(i).equals("0"))
                return "0";
        }
        return "null";
    }

    String checkStrings(int i) {
        byte countX, countY;
        countX = countY = 0;
        int j;
        for (j = 0; j < 3; j++) {
            if (field[i][j].equals("X"))
                countX++;
            else if (field[i][j].equals("0")) {
                countY++;
            }
        }
        if (countX == 3 || countY == 3)
            return field[i][0];
        else return "null";
    }

    String checkColumns(int i) {
        byte countX, countY;
        countX = countY = 0;
        for (int j = 0; j < 3; j++) {
            if (field[j][i].equals("X"))
                countX++;
            else if (field[j][i].equals("0")) {
                countY++;//else break
            }
        }
        if (countX == 3 || countY == 3)
            return field[0][i];
        else return "null";
    }

    String checkDraw() {
        boolean draw = true;
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((field[i][j].equals("-"))) {
                    draw = false;
                    break outerLoop;
                }
            }
        }
        if (draw)
            return "D";
        else
            return null;
    }
}
