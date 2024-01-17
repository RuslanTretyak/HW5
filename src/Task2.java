public class Task2 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        String white = "W";
        String black = "B";
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (j == 0) {
                    if (i % 2 == 0) {
                        chessBoard[i][j] = white;
                    } else {
                        chessBoard[i][j] = black;
                    }
                } else if (chessBoard[i][j - 1].equals(white)) {
                    chessBoard[i][j] = black;
                } else {
                    chessBoard[i][j] = white;
                }
            }
        }
        for (String[] lineOfBord : chessBoard) {
            System.out.print("\n");
            for (String squareOfBoard : lineOfBord) {
                System.out.print(squareOfBoard + " ");
            }
        }
    }
}
