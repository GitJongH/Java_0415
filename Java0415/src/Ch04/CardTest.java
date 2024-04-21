package Ch04;

import java.util.Scanner;

class Card {
	private String kind;
	private int num;
	public static int width = 100, height = 250;
	
	public Card() {
		kind = "Spade";
		num = 1;
	}
	
	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public void showInfo() {
		System.out.println(kind + " 숫자 : " + num);
	}
	
	public void showSize() {
		System.out.println("카드Size : " + width + "X" + height);
	}
	
	public static void setSize(int w, int h) {
		width = w;
		height = h;
	}
}

public class CardTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		
		System.out.println("카드의 폭은 " + Card.width + ", 높이는 " + Card.height);
		Card[] arr = new Card[2];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + ")무늬와 숫자>>");
			arr[i] = new Card(s.next(), s.nextInt());
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("C" + (i + 1) + "의 무늬는 : ");
			arr[i].showInfo();
			arr[i].showSize();
		}
		
		Card.setSize(50, 80);
		System.out.println("카드 사이즈 변경!!");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("C" + (i + 1) + "의 무늬는 : ");
			arr[i].showInfo();
			arr[i].showSize();
		}
	}
}
