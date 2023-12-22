public class King extends AbstractFigure{
    private int[][] cantMove;
    public King(Color color, int[] position){
        super(color, position);
        this.figureSim = FigureSim.King;
    }

    public void scma() {
        if (color == Color.WhiteF) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((position[0] == i && Math.abs(j - position[1]) == 1) || (position[1] == j && Math.abs(i - position[0]) == 1) || (Math.abs(i - position[0]) == 1 && Math.abs(j - position[1]) == 1)) {
                        if (Desk.desk[i][j].equals(FigureSim.Void.getSim())) {
                            canMove[i][j] = 1;
                        }
                        if (Desk.desk[i][j].charAt(2) == '3') {
                            canMove[i][j] = 1;
                        }
                    }
                }
            }
        } else if (color == Color.BlackF) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((position[0] == i && Math.abs(j - position[1]) == 1) || (position[1] == j && Math.abs(i - position[0]) == 1) || (Math.abs(i - position[0]) == 1 && Math.abs(j - position[1]) == 1)) {
                        if (Desk.desk[i][j].equals(FigureSim.Void.getSim())) {
                            canMove[i][j] = 1;
                        } else if (Desk.desk[i][j].charAt(2) == ']') {
                            canMove[i][j] = 1;
                        }

                    }
                }
            }
        }
    };

    if (Desk.desk[i][j].charAt(2) == ']') {
        AbstractFigure figure;
        FigureSim k = Helper.bToF(Desk.desk[i][j]);
        switch (k){
            case King:
                figure = new King(Color.WhiteF, new int[]{i,j});
                break;
            case Queen:
                figure = new Queen(Color.WhiteF, new int[]{i,j});
                break;
            case Bishop:
                figure = new Bishop(Color.WhiteF, new int[]{i,j});
                break;
            case Pawn:
                figure = new Pawn(Color.WhiteF, new int[]{i,j});
                break;
            case Rook:
                figure = new Rook(Color.WhiteF, new int[]{i,j});
                break;
            default:
                figure = new Knight(Color.WhiteF, new int[]{i,j});
                break;

        }
        int [][]tabl = figure.getCanMove();
        for (int z = 0; z < 8; z++) {
            for (int t = 0; t < 8; t++) {
                if (tabl[z][t] == 1) {
                    cmb[z][t] = 1;
                }
            }
        }
    }

    public int[][] getCantMove() {
        return cantMove;
    }
}
