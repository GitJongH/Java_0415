package Ch04;

import java.util.Scanner;

class Rect {
	private int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}

public class Ch04_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);		
		Rect[] rectArr = new Rect[4];
		int sum = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print((i + 1) + "너비와 높이 >>");
			rectArr[i] = new Rect(s.nextInt(), s.nextInt());
			sum += rectArr[i].getArea(); // sum += rectArr[i].getWidth() * rectArr[i].Height;4()
		}
				
		System.out.println("저장하였습니다...");
		
		System.out.println("사각형의 전체 합은 " + sum);
	}

}
