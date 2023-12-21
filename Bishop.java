public class Bishop extends AbstractFigure{
    public Bishop(Color color, int[] position){
        super(color, position);
        this.figureSim = FigureSim.Bishop;
    }

    public void scma() {
        boolean flag = true;
        if (color == Color.WhiteF) {
            for (int i = 1; position[0] + i < 8 && position[1] + i < 8 && flag; i++) {
                if (!(Desk.desk[position[0] + i][position[1] + i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0] + i][position[1] + i].charAt(2) == '3') {
                        canMove[position[0] + i][position[1] + i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0] + i][position[1] + i] = 1;
                }
            }
            flag = true;
            for (int i = 1; position[0] - i >= 0 && position[1] + i < 8 && flag; i++) {
                if (!(Desk.desk[position[0] - i][position[1] + i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0] - i][position[1] + i].charAt(2) == '3') {
                        canMove[position[0] - i][position[1] + i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0] - i][position[1] + i] = 1;
                }
            }
            flag = true;
            for (int i = 1; position[0] + i < 8 && position[1] - i >= 0 && flag; i++) {
                if (!(Desk.desk[position[0] + i][position[1] - i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0] + i][position[1] - i].charAt(2) == '3') {
                        canMove[position[0] + i][position[1] - i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0] + i][position[1] - i] = 1;
                }
            }
            flag = true;
            for (int i = 1; position[0] - i >= 0 && position[1] - i >= 0 && flag; i++) {
                if (!(Desk.desk[position[0] - i][position[1] - i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0] - i][position[1] - i].charAt(2) == '3') {
                        canMove[position[0] - i][position[1] - i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0] - i][position[1] - i] = 1;
                }
            }
        }
    };
}
