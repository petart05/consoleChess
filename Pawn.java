public class Pawn extends AbstractFigure{
    public Pawn(Color color, int[] position){
        super(color, position);
        this.figureSim = FigureSim.Pawn;
    }

    public void scma() {
        if (color == Color.BlackF) {
            if (position[0] != 0 && Desk.desk[position[0] - 1][position[1]].equals(FigureSim.Void.getSim())) {
                canMove[position[0] - 1][position[1]] = 2;
                if (Desk.desk[position[0] - 2][position[1]].equals(FigureSim.Void.getSim()) && position[0] == 6) {
                    canMove[position[0] - 2][position[1]] = 2;
                }
            }
            if (position[1] != 7 && position[0] != 0) {
                if (!(Desk.desk[position[0] - 1][position[1] + 1].equals(FigureSim.Void.getSim())) && Desk.desk[position[0] - 1][position[1] + 1].charAt(2) == ']') {
                    canMove[position[0] - 1][position[1] + 1] = 2;
                } else {
                    canMove[position[0] - 1][position[1] + 1] = 1;
                }
            }
            if (position[1] != 0 && position[0] != 0) {
                if (!(Desk.desk[position[0] - 1][position[1] - 1].equals(FigureSim.Void.getSim())) && Desk.desk[position[0] - 1][position[1] - 1].charAt(2) == ']') {
                    canMove[position[0] - 1][position[1] - 1] = 2;
                } else {
                    canMove[position[0] - 1][position[1] - 1] = 1;
                }
            }
        } else if (color == Color.WhiteF) {
            if (position[0] != 7 && Desk.desk[position[0] + 1][position[1]].equals(FigureSim.Void.getSim())) {
                canMove[position[0] + 1][position[1]] = 2;
                if (Desk.desk[position[0] + 2][position[1]].equals(FigureSim.Void.getSim()) && position[0] == 1) {
                    canMove[position[0] + 2][position[1]] = 2;
                }
            }
            if (position[1] != 7 && position[0] != 7) {
                if (!(Desk.desk[position[0] + 1][position[1] + 1].equals(FigureSim.Void.getSim())) && Desk.desk[position[0] + 1][position[1] + 1].charAt(2) == '3') {
                    canMove[position[0] + 1][position[1] + 1] = 2;
                } else {
                    canMove[position[0] + 1][position[1] + 1] = 1;
                }
            }
            if (position[1] != 0 && position[0] != 7) {
                if (!(Desk.desk[position[0] + 1][position[1] - 1].equals(FigureSim.Void.getSim())) && Desk.desk[position[0] + 1][position[1] - 1].charAt(2) == '3') {
                    canMove[position[0] + 1][position[1] - 1] = 2;
                } else {
                    canMove[position[0] + 1][position[1] - 1] = 1;
                }
            }
        }
    };
}
