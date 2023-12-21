public class Move {
    public static void makeMove(int[][] convertedMove) {
        Desk.desk[convertedMove[1][0]][convertedMove[1][1]] = Desk.desk[convertedMove[0][0]][convertedMove[0][1]];
        Desk.desk[convertedMove[0][0]][convertedMove[0][1]] = FigureSim.Void.getSim();
    }
}
