public enum Color {
     BlackF("\u001B[30m"), Space("\u001B[0m"), Reset("\u001B[0m"), WhiteF("");
    private final String ANSI;
    Color(String ANSI){
        this.ANSI = ANSI;
    }

    public String getANSI() {
        return ANSI;
    }
}
