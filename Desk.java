public class Desk {
    public static String[][] desk = new String[8][8];

    public static void crete() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 1) {
                    desk[i][j] = FigureSim.Pawn.getSim();
                } else if (i == 6) {
                    desk[i][j] = Color.BlackF.getANSI() + FigureSim.Pawn.getSim() + Color.Reset.getANSI();
                } else if (i == 0) {
                    if (j == 0 || j == 7) {
                        desk[i][j] = FigureSim.Rook.getSim();
                    } else if (j == 1 || j == 6) {
                        desk[i][j] = FigureSim.Knight.getSim();
                    } else if (j == 2 || j == 5) {
                        desk[i][j] = FigureSim.Bishop.getSim();
                    } else if (j == 3) {
                        desk[i][j] = FigureSim.King.getSim();
                    } else {
                        desk[i][j] = FigureSim.Queen.getSim();
                    }
                } else if (i == 7) {
                    if (j == 0 || j == 7) {
                        desk[i][j] = Color.BlackF.getANSI() + FigureSim.Rook.getSim() + Color.Reset.getANSI();
                    } else if (j == 1 || j == 6) {
                        desk[i][j] = Color.BlackF.getANSI() + FigureSim.Knight.getSim() + Color.Reset.getANSI();
                    } else if (j == 2 || j == 5) {
                        desk[i][j] = Color.BlackF.getANSI() + FigureSim.Bishop.getSim() + Color.Reset.getANSI();
                    } else if (j == 3) {
                        desk[i][j] = Color.BlackF.getANSI() + FigureSim.King.getSim() + Color.Reset.getANSI();
                    } else {
                        desk[i][j] = Color.BlackF.getANSI() + FigureSim.Queen.getSim() + Color.Reset.getANSI();
                    }
                } else {
                    desk[i][j] = FigureSim.Void.getSim();
                }
            }
        }
        desk[5][5] = Color.BlackF.getANSI() + FigureSim.Rook.getSim() + Color.Reset.getANSI();
        desk[4][4] = FigureSim.Rook.getSim();
    }

    public static void output(String[][] desk) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("   ");
                } else if (i == 0) {
                    switch (j) {
                        case 1:
                            System.out.print(" A ");
                            break;
                        case 2:
                            System.out.print(" B ");
                            break;
                        case 3:
                            System.out.print(" C ");
                            break;
                        case 4:
                            System.out.print(" D ");
                            break;
                        case 5:
                            System.out.print(" E ");
                            break;
                        case 6:
                            System.out.print(" F ");
                            break;
                        case 7:
                            System.out.print(" G ");
                            break;
                        case 8:
                            System.out.print(" H ");
                            break;
                    }
                } else if (j == 0) {
                    System.out.print(" " + i + " ");
                } else {
                    System.out.print(desk[i-1][j-1]);
                }
            }
            System.out.println();
        }
    }
}

