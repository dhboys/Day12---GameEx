package org.game.ui;

import java.util.Scanner;

public class BBBUI extends BaseUI{

	public BBBUI(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void playGame() {
		print("복불복 게임을 시작");
	}
}
