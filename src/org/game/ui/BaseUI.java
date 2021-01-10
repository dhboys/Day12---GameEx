package org.game.ui;

import java.util.Scanner;

public abstract class BaseUI {

	private Scanner scanner;

	public BaseUI(Scanner scanner) {
		super();
		this.scanner = scanner;
	}
	
	protected void print(String msg) {
		System.out.println(msg);
	}
	
	protected String inputStr(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	protected int inputInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(scanner.nextLine());
	}
	
	protected double inputDouble(String msg) {
		System.out.println(msg);
		return Double.parseDouble(scanner.nextLine());
	}
	// 추상메서드 : 반드시 오버라이드
	public abstract void playGame();
		
	
}















