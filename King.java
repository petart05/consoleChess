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

    public void setCantMove(){};

    public int[][] getCantMove() {
        return cantMove;
    }
}
