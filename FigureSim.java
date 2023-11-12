public enum FigureSim {
    Knight("[к]"), Pawn("[п]"), King("[K]"), Queen("[ф]"), Bishop("[с]"), Rook("[л]"), Void("[ ]");
    private final String Sim;
    FigureSim(String Sim){
        this.Sim = Sim;
    }

    public String getSim() {
        return Sim;
    }
}
