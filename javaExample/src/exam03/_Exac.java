package exam03;

import java.util.ArrayList;

public class _Exac {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		System.out.println("list : " + list);
		
		list.add(1);
		System.out.println("list : " + list);
		
		list.add(2);
		System.out.println("list : " + list);
		
		list.add(3);
		System.out.println("list : " + list);
		
		System.out.println("리스트의 길이" + list.size());
		
        for (int i=0; i<list.size(); i++) {
        	System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
        	
        	System.out.println("-------------");
        	
        	list.remove(2); 
        	
        	for (int i1=0; i1<list.size(); i1++) {
            	System.out.println("리스트의 " + i1 + "번째 인덱스의 값 : " + list.get(i1));
        	
        }
        	System.out.println("-------------");
        	
        	list.set(0, 100);
        	
        	for (int i1=0; i<list.size(); i++) {
            	System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
        	}
        	
        	System.out.println("-------------");
        	
        	int i1 = 0;
        	for (int a : list) {
        		System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
        		i++;
        	}
        }
	}
}


