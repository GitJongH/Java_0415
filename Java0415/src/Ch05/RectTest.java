package Ch05;

class Rect {
	private int width;
	private int height;
	
	public Rect() {
		this.width = 1;
		this.height = 1;
	}
	
	public Rect(int w, int h) {
		width = w;
		height = h;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int setWidth(int width) {
		return this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int setHeight(int height) {
		return this.height = height;
	}
	
	public int area() {
		return this.width * this.height;
	}
	
	public int around() {
        return 2 * (this.width + this.height);
    }
}

class Vol extends Rect {
	private int depth;
	
	public Vol() {
		super();
		this.depth = 1;
	}
	
	public Vol(int width, int height, int depth) {
		super(width, height);
		this.depth = depth;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public void setDepth(int depth) {
        this.depth = depth;
    }
	
	public int setVol(int width) {
		return this.depth = depth;
	}
	
	public int volume() {
		return super.area() * this.depth;
	}
}

public class RectTest { // 이름적기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect();
		Vol v = new Vol(2, 2, 2);
		
		System.out.println("가로:" + r.getWidth() + ",높이:" + r.getHeight());
		System.out.println("깊이:" + v.getDepth() + ",부피:" + v.volume());
	}

}
