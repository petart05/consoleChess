public class Queen extends AbstractFigure {
    public Queen(Color color, int[] position) {
        super(color, position);
        this.figureSim = FigureSim.Queen;
    }

    public void scma() {
        AbstractFigure bishop = new Bishop(color, position);
        AbstractFigure rook = new Rook(color, position);
        int[][] bcm = bishop.getCanMove();
        int[][] rcm = rook.getCanMove();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (bcm[i][j] == 1 || rcm[i][j] == 1) {
                    canMove[i][j] = 1;
                }
            }
        }
    }
}