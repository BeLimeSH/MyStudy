package edu.kh.inheritance.model.vo;

public class Student extends Person  {
	//Student Ŭ������ Person Ŭ���� ������ �����Ѵ�
	// == Student Ŭ������ Person Ŭ���� ������ �߰��Ͽ� Ȯ���Ѵ�.
	
	// *** ��� ***
	//extends : Ȯ���ϴ�, �����ϴ�
	

	//�ʵ�
	private int grade;
	private int classRoom;
	
	//������
	public Student() {
		
		//Student() ��ü ���� ��
		//���ο� ��ӹ��� Person ��ü�� ����ϱ� ����
		//Person ������ ȣ�� �ڵ尡 �ʿ��ϴ�!
		
		super(); //super() ������
		// �θ��� �����ڸ� ȣ���ϴ� �ڵ�
		// ** �ݵ�� �ڽ� ������ �ֻ�ܿ� �ۼ��Ǿ�� �Ѵ� **
		
		//* super() ������ ������ �ڽ� ��ü ���ο� �θ� ��ü�� �����ȴ�.
		// -> ���ۼ� �� �����Ϸ��� ������ �ܰ迡�� �ڵ����� �߰�����
		
	}
			
	//�Ű����� ������
	public Student(String name, int age, String nationality,
			int grade, int classRoom) {
		
		//���� ���� ��(name, age, nationality) �θ� �ʵ忡 �� �����ϱ�
		
		//this.name = name; (X)
		//��� ���� �θ��� �ʵ�(name)�� 
		//�ڽ��� �ʵ�ó�� ����Ϸ� ������ ���� �߻�
		
		//��? �θ��� �ʵ忡 private ���� �����ڰ� �־
		//�ڽ��̶� �ٸ� ��ü�̱� ������ ���� ������ �Ұ�
		
		//�θ��� setter�� �̿��ϴ� ��� -> ��ȿ�����̶�� ����
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		*/
		
		//super()�����ڸ� �̿��ϴ� ���
		super(name, age, nationality);	//�θ� �Ű����� ������ ȣ��
		
		this.grade = grade;     
		this.classRoom = classRoom;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	//toString() �������̵�
	
	@Override
	public String toString() {
		
		//super ���� ����                    
		return    super.toString() +" / " + grade + " / " + classRoom;
	}
	
}
