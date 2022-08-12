package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Tesla;

public class PolyService {
	
	public void ex1() {
		//������ Ȯ�� ����
		
		//Car ��ü ����
		Car car = new Car();
		//�θ�Ÿ�� �������� = �θ� ��ü
		
		//Tesla ��ü ����
		Tesla tesla = new Tesla();
		//�ڽ�Ÿ�� �������� = �ڽ� ��ü
		
		//***** ������(��ĳ����)*****
		Car car2 = new Tesla();		
		Car car3 = new Spark();
		//�θ�Ÿ�� �������� = �ڽ� ��ü
		
		//Tesla ��ü�� �����ϴ� ������ Ÿ���� Car�̱� ������
		//Tesla ��ü�� Car ��ü�� ��ȭ��.
		
		//***** ������(��ĳ����) �ۼ��� *****
		
		//1-1) car (�θ� = �θ�)
		car.setEngine("v6 6���� ����");
		car.setFuel("�ֹ���");
		car.setWheel(4);
		//car �޼ҵ� ��� ��� ����
		
		//1-2) tesla (�ڽ� = �ڽ�)
		tesla.setEngine("�������");
		tesla.setFuel("����");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		
		//1-3) car2 (�θ�=�ڽ�(Tesla))
		car2.setEngine("�������");
		car2.setFuel("����");
		car2.setWheel(4);
		//car2.setBatteryCapacity(1000000);
		//The method setBatteryCapacity(int) is undefined for the type Car
		
		//1-4) car3 (�θ� = �ڽ�(Spark))
		car3.setEngine("���� ����");
		car3.setFuel("�ֹ���");
		car3.setWheel(4);
		//car3.setDicountOffer(0.5);
		//The method setDicountOffer(double) is undefined for the type Car
		
		
		//--------------------------------------------------------
		
		
		//2) �������� �̿��� ��ü �迭
		
		//��ü �迭 : ���� ��ü ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
		
		//+ ������ ���� -> �θ� Ÿ�� ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
		
		Car[] arr = new Car[3]; //�θ� Ÿ�� ���� ���� �迭 ���� �� �Ҵ�
								//�� �迭 ��Ұ� CarŸ�� ���� ����
		
		arr[0] = car;	//Car �ּ� == Car ��ü	
		
		arr[1] = car2; //Tesla �ּ� == Tesla ��ü
		
		arr[2] = car3; //Spark �ּ� == Spark ��ü
		
		
		//��� + ������
		//��� Ư¡ : �Ϸ��� Ŭ�����鿡 ���� �������� �Ծ� ����
		//			 -> Car ��� Ŭ������ ��� getEngine()�� ������ �ִٸ� ����
		
		//������(��ĳ����) : �θ� Ÿ�� �������� arr[i]�� �ڽ� ��ü�� ������ �� �ִ�.
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° �ε����� ���� : " + arr[i].getEngine());
		}
		
		

	}
	
	public void ex2() {
		//3) ������(��ĳ����)�� �̿��� �Ű����� ����
		
		Tesla t = new Tesla("���� ����","����", 4, 1000000);
		Spark s = new Spark("���� ����", "�ֹ���", 4, 0.5);
		Car c = new Car("���� ����", "����", 12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		System.out.println("----------------------------------");
		
		//4)�������� �̿��� ��ȯ�� ����
		
//		Car[] arr = { new Car(), new Tesla(), new Spark()};

		Car[] arr = { createCar(1), createCar(2), createCar(3) };
		//				  Car		   Car			  Car
		//							 (Tesla)		(Spark)
		
		
		//arr[0] -> Car
		//arr[1] -> Tesla
		//arr[2] -> Spark
		
		//instance of ������ : ��ü�� �ڷ����� �˻��ϴ� ������
		//-> �����ϴ� ��ü�� Ư�� �ڷ����̰ų� �θ��� ��� ���������� Ȯ��
		
		
		//arr[1]�� �����ϴ� ��ü�� Tesla�̸� true, �ƴϸ� false
		System.out.println(arr[1] instanceof Tesla); //-> true
		
		//arr[1]�� �����ϴ� ��ü�� Spark�̸� true, �ƴϸ� false
		System.out.println(arr[1] instanceof Spark); //-> false
		
		//arr[1]�� �����ϴ� ��ü�� Car�̸� true, �ƴϸ� false
		System.out.println(arr[1] instanceof Car); //-> true
		
		System.out.println("-------------------------------");
		
		for(int i=0; i<arr.length; i++) {
			
			//�θ� Ÿ�� �˻�� ���� �������� ���� �ؾ��Ѵ�.
			if(arr[i] instanceof Tesla) {
				System.out.println("Tesla ��ü�Դϴ�");
				
			} else if(arr[i] instanceof Spark) {
				System.out.println("Spark ��ü�Դϴ�");
				
			} else {
				System.out.println("Car ��ü�Դϴ�.");
			}
		}
		
	}
	
	
	//���� ���� Car �Ǵ� �ڽ� ��ü�� ����, ����, ���� ������ ����ϴ� �޼���
	public void printCar(Car temp) {
		//�Ű������� �ۼ��� ������ �������� �ּҰ� ����ȴ�.(���� ����)
		//�޼��� ���� ���� + �Ű����� == ���� ����(Local Variable)
		System.out.println("���� : " + temp.getEngine());
		System.out.println("���� : " + temp.getFuel());
		System.out.println("���� ���� : " + temp.getWheel());
		System.out.println();
		
	}
	
	//���� ���� �Ű������� ���� Car �Ǵ� �ڽ� ��ü�� �����ϰ�
	//������ ��ü�� �ּҸ� ��ȯ
	public Car createCar(int num) {
		
		Car result = null;
		//null == �ƹ��͵� �����ϰ� ���� ����
		
		switch(num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break;
		}
		
		//��ȯ���� Car������ 
		//case�� 2,3�̸� Car�� �ڽ� ��ü�� �ּҰ� ��ȯ�ȴ�.
		return result;
	}
	
	
	public void ex3() {
		
		//***** ������ �� �ٿ� ĳ���� *****
		
		//- �ٿ� ĳ�����̶�?
		
		// �θ� Ÿ�� ���������� �ڽ� ��ü�� �����ϴ� 
		//�� ĳ���� ���¿����� ������ �� �ִ� �����
		//�θ� Ÿ���� �ڽ� Ÿ������ "���� ����ȯ"�ؼ� 
		//�ڽ� ��ü�� ���� �ʵ�, �޼ҵ带 ��� �����ϰ� �Ѵ�.
		
		Car c1 = new Tesla("�������", "����", 4, 50000);
		
		System.out.println( ((Tesla)c1).getBatteryCapacity() );
		
		//����@! "." �����ڰ� (Tesla) ����ȯ �����ں��� �켱������ ����.
		
		//<ȿ������ �ٿ� ĳ���� ���>
		//- ���� ���縦 �̿��Ѵ�.
		
		Tesla t1 = (Tesla)c1;
		
		System.out.println(t1.getBatteryCapacity());
		
	}
	
	public void ex4() {
		
		// *** �ٿ� ĳ���� ���ǻ��� ***
		
		Car c1 = new Tesla();
		//Car c1 = new Spark();
		
		// java.lang.ClassCastException (����ȯ ����)
		// -> c1�� �����ϴ� ��ü�� Tesla�ε� 
		//    Spark ���������� Tesla�� �����Ϸ��� �ؼ� ���� �߻�
		
		// @@@ �ذ� ��� : instanceof�� �Բ� ��� @@@
		
		if(c1 instanceof Spark) {
			
			Spark s1 = (Spark)c1; //�ٿ� ĳ����
			System.out.println("����");
			
		} else {
			
			System.out.println("����(Spark Ÿ���� �ƴ�)");
			
		}
	}
	
	
	public void ex5() {
		
		//���ε�(Binding)
		// - ���� ������ �޼ҵ� �ڵ�� ȣ���ϴ� �ڵ带 �����Ű�� ��
		
		Car c1 = new Car("���� ����", "����", 8);
		
		System.out.println(c1.getEngine());
		
		//Car ��ü�� �ִ� getEngine() �޼ҵ带 ȣ�� == ���ε�
		
		//String edu.kh.poly.ex1.model.vo.Car.getEngine()
		
		//���α׷� "���� ��"
		//- �����Ϸ��� getEngine() �޼ҵ尡 Car�� �ִ� �ɷ� �ν��ؼ�
		//	c1.getEngine() ȣ�� �ڵ��
		//	String edu.kh.poly.ex1.model.vo.Car.getEngine() �޼ҵ� �ڵ带 ����
		//--> [���� ���ε�]
		
		System.out.println(c1.toString());
		//String edu.kh.poly.ex1.model.vo.Car.toString()
		//Car �������� c1�� �̿��ؼ�
		//Car ��ü�� �ִ� �������̵� �� toString() �޼ҵ带 ȣ��
		
		
		// ** ������ ���� �� ���ε� **
		Car c2 = new Spark("���� ����", "�ֹ���", 4, 0.5);
		//��ĳ���� ���� -> �θ� �κи� ���� ������ ����
		
		System.out.println(c2.toString());
		//String edu.kh.poly.ex1.model.vo.Car.toString()
		//�������� c2�� Car Ÿ���̹Ƿ�
		//toString()�� Car�� toString()�� ȣ�� - ���� ���ε�
		
		//������ �����غ��� �ڽ�(Spark)�� toString()�� ȣ��Ǵ� ���� Ȯ�� ����
		//-> "���� ��"���� �ڽ�(Spark)�� �������̵��� �޼ҵ�� ���ε� == [���� ���ε�]
		
		
		// ** ���� ���ε� Ȱ�� ��� **
		Car[] arr = {
				new Car("���� ����", "����", 12),
				new Tesla("���� ����", "����", 4, 50000),
				new Spark("���� ����", "����", 4, 0.3)
		};
		
		//arr �迭 ��Ұ� �����ϴ� ��� ��ü�� �ʵ� ���� ���
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(i+ "��° ��� :" + arr[i].toString());
			//���� �� : String edu.kh.poly.ex1.model.vo.Car.toString() - ���� ���ε�
			//���� �� : �� ��ü�� �������̵��� toString()�� ȣ��� - ���� ���ε�
			
		}
		
		// ** ���� ���ε� ���� **
		//- ��ĳ���� ������ ���� ������ ������ �ٿ� ĳ���� ����
		//	�ڽ��� �������̵��� �޼ҵ带 ������ �� �ִ�.

	}
}
