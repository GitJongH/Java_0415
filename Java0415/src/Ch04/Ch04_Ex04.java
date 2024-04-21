package Ch04;

import java.util.Scanner;

class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
}
public class Ch04_Ex04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int num, i;
		
		System.out.print("인원수>>");
		num = s.nextInt();
		
		Phone[] arr = new Phone[num];
		
		for (i = 0; i < num; i++) {
			System.out.print("이름과 전화번호 (번허는 연속적으로 입력)>>");
			arr[i] = new Phone(s.next(), s.next());
		}
		
		System.out.println("저장하였습니다...");
		
		while (true) {
			System.out.print("검색할 이름>>");
			String name = s.next();
			if (name.equals("exit")) break;
			else {
				for (i = 0; i < arr.length; i++) {
					if (name.equals(arr[i].getName())) {
						System.out.println(name + "의 번호는 " + arr[i].getTel());
						break;
					}
				}
				if (i == arr.length) System.out.println(name + " 이 없습니다.");
			}
		}
	}
}
