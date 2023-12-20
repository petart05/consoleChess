public abstract class AbstractFigure {
    protected Color color;
    protected FigureSim figureSim;
    protected int[] position;
    protected int[][] canMove;

    public AbstractFigure(Color color, int[] position) {
        this.color = color;
        this.position = position;
    }
    public void setCanMove(){
        this.scma();
        this.sncm();
    }
    public abstract void scma();
    public void sncm(){
        canMove[position[0]][position[1]] = 0;
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

    public int[][] getCanMove() {
        return canMove;
    }
}

