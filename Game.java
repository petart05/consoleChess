public class Game{
	private String[][] desk = Desk.create();
	public void process(){
		Desk.output();
		boolean moveAfterCheck = false;
		Color moverColor = Color.WhiteF;
		Color enemysKingColor = Color.BlackF;
		while(true){//пока так
			//проинимает ход и обрабатывает(получить фигуру, цвет, откуда и куда идет)
			if (this.isMovePossible(figure, color, moveTo)){
				if(!moveAfterCheck){
					Move.makeMove(new int[][] {figure.getPosition(), moveTo});
					if (this.findEnemyKing().isCheck()){
						System.out.println("Check");
						moveAfterCheck = true;
					}
				}
			}
		}
		
	}
	private boolean isMovePossible(AbstractFigure figure, Color color, int[] moveTo){
		int[][] cm = figure.getCanMove();
		return cm[moveTo[0]][moveTo[1]] >0;
	}
	private King findEnemyKing(Color color){
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				if (color == Color.BlackF){
					if (desk[i][j].charAt(1) == 'K'){
						return new King(color, new int[] {i, j});
					}
				}else if (color == Color.WhiteF){
					if (desk[i][j].charAt(5) == 'K'){
						return new King(color, new int[] {i, j});
					}
				}
			}
		}
		return null;
	}
}