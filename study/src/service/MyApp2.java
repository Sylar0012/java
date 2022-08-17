package service;

class 알바 {

	public 햄버거 햄버거생성() {
		return new 햄버거();
	}

	public 포테이토 포테이토생성() {
		return new 포테이토();
	}

	public 콜라 콜라생성() {
		return new 콜라();
	}

	public 햄버거세트 햄버거세트생성(햄버거 h, 포테이토 p, 콜라 k) {
		return new 햄버거세트(h, p, k);
	}
}

class 햄버거 {
}

class 포테이토 {
}

class 콜라 {
}

class 햄버거세트 {
	
	private 햄버거 h;
	private 포테이토 p;
	private 콜라 k;

	public 햄버거세트(햄버거 h, 포테이토 p, 콜라 k) {
		super();
		this.h = h;
		this.p = p;
		this.k = k;
	}

}

public class MyApp2 {

	public static void main(String[] args) {

	}

}
