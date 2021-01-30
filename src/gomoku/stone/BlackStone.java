package gomoku.stone;

public class BlackStone implements Stone {
	private final StoneColor STONE_COLOR = StoneColor.Black;

	@Override
	public StoneColor isColor() {
		return STONE_COLOR;
	}




}
