public class Knight extends AbstractFigure{
    public Knight(Color color, int[] position){
        super(color, position);
        this.figureSim = FigureSim.Knight;
    }

    public void scma() {
        if (color == Color.BlackF) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (((Math.abs(position[1] - j) == 2) && (Math.abs(position[0] - i) == 1)) || ((Math.abs(position[1] - j) == 1) && (Math.abs(position[0] - i) == 2))) {
                        if (Desk.desk[i][j].charAt(2) == ']') {
                            canMove[i][j] = 1;
                        }
                    }
                }
            }
        } else if (color == Color.WhiteF) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (((Math.abs(position[1] - j) == 2) && (Math.abs(position[0] - i) == 1)) || ((Math.abs(position[1] - j) == 1) && (Math.abs(position[0] - i) == 2))) {
                        if (Desk.desk[i][j].charAt(2) == '3' || Desk.desk[i][j].equals(FigureSim.Void.getSim())) {
                            canMove[i][j] = 1;
                        }
                    }
                }
            }
        }
    };
}
