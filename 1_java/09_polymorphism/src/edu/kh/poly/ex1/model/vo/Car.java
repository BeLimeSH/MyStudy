package edu.kh.poly.ex1.model.vo;

public class Car {
	
	private String engine; //����
	private String fuel; //����
	private int wheel; //���� ����
	
	public Car() { //�⺻ ������
		super(); //�θ� ������
		
	}

	//�Ű����� ������ �ڵ� �ϼ�
	//alt + shift + s -> o -> enter
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	
	//gettr / setter �ڵ� �ϼ�
	//alt + shift +s -> r -> tab -> space -> shift + tab -> enter
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	//Object.toString() �������̵�
	@Override
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
}
