package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.model.vo.Member;

public class MapService {
	
	// Map : Key�� Value �� ���� �����Ͱ� �Ǿ� �̸� ��Ƶ� ��ü
	
	// - Key�� ��Ƶθ� Set�� Ư¡ (�ߺ�X)
	// - Value�� ��Ƶθ� List�� Ư¡ (�ߺ� O)
	
	public void ex1() {
		
		//HashMap<K, V> : Map�� �ڽ� Ŭ���� �� ���� ��ǥ�Ǵ� Map
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(Integer Key, String Value) : �߰�(put : ����)
		
		map.put(1, "ȫ�浿");
		map.put(2, "��浿");
		map.put(3, "��浿");
		map.put(4, "�ڱ浿");
		map.put(5, "�̱浿");
		map.put(6, "�ֱ浿");
		
		//Key �ߺ�
		map.put(1, "ȫȫȫ"); //�ߺ� ���X, value �����
		
		//Value �ߺ�
		map.put(7, "�ֱ浿");
		
		System.out.println(map);
		
	}
	
	
	public void ex2() {
		
		//Map ��� ����
		
		//VO(�� ����� ��ü)�� Ư�� ������ ������ ������ ���� ��� �ַ� ���
		//-> ������ ���� VO�� ������ �ڵ� �����̴�
		//-> Map�� �̿��ؼ� VO�� ����� �ڵ带 �ۼ��� �� �ִ�.
		
		//1) VO����
		Member mem = new Member();
		
		// �� ����
		mem.setId("user01");
		mem.setPw("pass01");
		mem.setAge(30);
		
		//�� ���
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println(mem.getAge());
		
		System.out.println("----------------------------------");
		
		
		//2) Map ����
		Map<String, Object> map = new HashMap<String, Object>();
		//value�� Object Ÿ�� == � ��ü�� Value�� ���� �� �ִ�
		
		//�� ����
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
					//int -> Integer(AutoBoxing) -����-> Object
		
		//�� ���
		System.out.println( map.get("id").toString() );
		//String java.lang.Object.toString() -> ���� ���ε�
		//���� �� Ȯ���غ��� String �ڽ� ��ü -> �ڽ� toString() ȣ��
		//									  -> ���� ���ε�
		
		System.out.println( map.get("pw") );
		System.out.println( map.get("age") );
		
		// *** Map�� ����� ������ ���������� �����ϱ� ***
		
		//Map���� Key�� ��Ƶθ� Set�� Ư¡�� ������
		//-> �̸� Ȱ�� �� �� �ֵ��� Map���� KeySet() �޼��� ����
		//--> Key�� ��Ƽ� Set���� ��ȯ
		
		Set<String> set = map.keySet();		//id, pw, age�� ����� Set ��ȯ
		
		System.out.println(set);
		
		//���� for��
		for(String key : set) {
			System.out.println(map.get(key));
							//key�� �ݺ��� �� ���� ����
							//-> ����� key�� �´� map�� value�� ���
		}
		
		//map�� ����� �����Ͱ� ���ų� � key�� �ִ��� �Һи� �� ��
		//�Ǵ� map�� ����� ��� �����Ϳ� �����ط� �� ��
		//keySet() + ���� for�� �ڵ带 ����Ѵ�.
		
	}
	
	
	public void ex3() {
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		for(int i=0; i<10; i++ ) {
			
			//Map ����
			Map<String, Object> map = new HashMap<String, Object>();
			
			//Map�� ������ �߰�
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			
			//Map�� List�� �߰�
			list.add(map);
			
		}
		
		//for�� ���� �� List���� 10���� Map ��ü�� �߰� �Ǿ��ִ�.
		
		//* List�� ����� Map���� key�� "id"�� ����� value�� ��� ���
		
		//���� for��
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("pw"));
		}
	}
	
	
	
	
}
