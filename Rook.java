public class Rook extends AbstractFigure{
    public Rook(Color color, int[] position){
        super(color, position);
        this.figureSim = FigureSim.Rook;
    }

    public void scma() {
        boolean flag = true;
        if (color == Color.WhiteF) {
            for (int i = position[0]; i >= 0 && flag; i--) {
                if (i != position[0] && !(Desk.desk[i][position[1]].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[i][position[1]].charAt(2) == '3') {
                        canMove[i][position[1]] = 1;
                    }
                    flag = false;
                } else {
                    canMove[i][position[1]] = 1;
                }
            }
            flag = true;
            for (int i = position[0]; i < 8 && flag; i++) {
                if (i != position[0] && !(Desk.desk[i][position[1]].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[i][position[1]].charAt(2) == '3') {
                        canMove[i][position[1]] = 1;
                    }
                    flag = false;
                } else {
                    canMove[i][position[1]] = 1;
                }
            }
            flag = true;
            for (int i = position[1]; i >= 0 && flag; i--) {
                if (i != position[1] && !(Desk.desk[position[0]][i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0]][i].charAt(2) == '3') {
                        canMove[position[0]][i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0]][i] = 1;
                }
            }
            flag = true;
            for (int i = position[1]; i < 8 && flag; i++) {
                if (i != position[1] && !(Desk.desk[position[0]][i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0]][i].charAt(2) == '3') {
                        canMove[position[0]][i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0]][i] = 1;
                }
            }
        } else if (color == Color.BlackF) {
            for (int i = position[0]; i >= 0 && flag; i--) {
                if (i != position[0] && !(Desk.desk[i][position[1]].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[i][position[1]].charAt(2) == ']') {
                        canMove[i][position[1]] = 1;
                    }
                    flag = false;
                } else {
                    canMove[i][position[1]] = 1;
                }
            }
            flag = true;
            for (int i = position[0]; i < 8 && flag; i++) {
                if (i != position[0] && !(Desk.desk[i][position[1]].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[i][position[1]].charAt(2) == ']') {
                        canMove[i][position[1]] = 1;
                    }
                    flag = false;
                } else {
                    canMove[i][position[1]] = 1;
                }
            }
            flag = true;
            for (int i = position[1]; i >= 0 && flag; i--) {
                if (i != position[1] && !(Desk.desk[position[0]][i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0]][i].charAt(2) == ']') {
                        canMove[position[0]][i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0]][i] = 1;
                }
            }
            flag = true;
            for (int i = position[1]; i < 8 && flag; i++) {
                if (i != position[1] && !(Desk.desk[position[0]][i].equals(FigureSim.Void.getSim()))) {
                    if (Desk.desk[position[0]][i].charAt(2) == ']') {
                        canMove[position[0]][i] = 1;
                    }
                    flag = false;
                } else {
                    canMove[position[0]][i] = 1;
                }
            }
        }
    }
}
