package edu.kh.poly.ex1.model.vo;

public class Tesla extends Car { //������
	
	private int batteryCapacity; //���͸� �뷮
	
	//ctrl + space -> enter
	
	public Tesla() {
		super(); //�θ� ������(Car)
	}
	
	//�Ű����� ������
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	//getter / setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	//Car.toString() �������̵�
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
	
}
