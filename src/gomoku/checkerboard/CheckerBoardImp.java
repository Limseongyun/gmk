package gomoku.checkerboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckerBoardImp implements CheckerBoard {	
	List<EngChecker> ecList = Arrays.asList(EngChecker.A,EngChecker.B,EngChecker.C,EngChecker.D,EngChecker.E,
											EngChecker.F,EngChecker.G,EngChecker.H,EngChecker.I,EngChecker.I,
											EngChecker.K,EngChecker.L,EngChecker.M,EngChecker.N,EngChecker.O);
	List<CheckerState> checkerBoard = new ArrayList<CheckerState>();
	public CheckerBoardImp() {
		for(EngChecker e : ecList) {
			for(EngChecker f : ecList) {
				checkerBoard.add(new CheckerState(e, f.getNumChecker()));
			}
		}
		

	}
	public static void main(String[] args) {
		//○ ●
		CheckerBoardImp cbi = new CheckerBoardImp();
		cbi.display();
		
		
		
		
	}
	public void display() {
		for(CheckerState e : checkerBoard) {
			if(e.getY() == 15) {
				System.out.print(" [○]");
				System.out.println();
				System.out.println();
			}else {
				System.out.print(" [ ]");
			}
		}
	}
}
