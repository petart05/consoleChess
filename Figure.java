public class Figure {
    protected Color color;
    protected FigureSim figureSim;
    protected int[] position;
    protected int[][] canmove;

    public Figure(Color color, FigureSim figureSim, int[] position) {
        this.color = color;
        this.position = position;
        this.figureSim = figureSim;
        //this.canmove = метод, определяющий куда может пойти фигура(двумерный массив, 1 - фигура может туда пойти; 0 - не может);
    }

    public Color getColor() {
        return color;
    }

    public FigureSim getFigureSim() {
        return figureSim;
    }

    public int[] getPosition() {
        return position;
    }

    public int[][] getCanmove() {
        return canmove;
    }
}
