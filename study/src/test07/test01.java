package test07;

class Rectangle {
	private int weight;
	private int height;
	private int area;
	private int preimeter;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea() {
		//area = w * h;
		this.area = getHeight()*getWeight();
		//area = this.area;
	}

	public int getPreimeter() {
		return preimeter;
	}

	public void setPreimeter() {
		this.preimeter = (getHeight()+getWeight())*2;
		//preimeter = this.preimeter;
	}

	@Override
	public String toString() {
		return "Rectangle [weight=" + weight + ", height=" + height + ", area=" + area + ", preimeter=" + preimeter
				+ "]";
	}

}

public class test01 {

	public static void main(String[] args) {
		Rectangle Rect = new Rectangle();

		Rect.setHeight(10);
		Rect.setWeight(5);
		Rect.setArea();
		Rect.setPreimeter();

		System.out.println(Rect.toString());

	}
}
