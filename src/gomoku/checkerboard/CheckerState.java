package gomoku.checkerboard;

import gomoku.stone.Stone;

public class CheckerState implements CheckerBoard {
	private EngChecker X;
	private Integer Y;
	private boolean isSet = false;
	private Stone stone;
	public CheckerState(EngChecker ec, Integer nc) {
		this.X= ec;
		this.Y= nc;
	}
	public CheckerState(EngChecker ec, Integer nc, Stone stone) {
		this.X= ec;
		this.Y= nc;
		this.stone = stone;
		this.isSet = true;
	}
	public EngChecker getX() {
		return X;
	}
	public void setX(EngChecker x) {
		X = x;
	}
	public Integer getY() {
		return Y;
	}
	public void setY(Integer y) {
		Y = y;
	}
	public boolean isSet() {
		return isSet;
	}
	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}
	public Stone getStone() {
		return stone;
	}
	public void setStone(Stone stone) {
		this.stone = stone;
	}
	
		
	
}
