package exam12;

public class SimpleLinkedList {

    public static void main(String[] args) {

        // 친구 노드 생성
        Friend f1 = new Friend("철수");
        Friend f2 = new Friend("영희");
        Friend f3 = new Friend("민수");

        // 처음 연결
        f1.next = f2;
        f2.next = f3;

        // 첫 번째 출력
        System.out.println("처음 연결 상태");
        printList(f1);

        System.out.println("---------------------");

        // 중간에 노드 추가 (철수 다음에 짱구 삽입)
        Friend newNode = new Friend("짱구");
        newNode.next = f1.next;
        f1.next = newNode;

        // 두 번째 출력
        System.out.println("짱구 추가 후");
        printList(f1);
    }

    // 연결 리스트 출력 메소드
    public static void printList(Friend head) {

        Friend current = head;

        while (current != null) {
            if (current.next == null) {
                System.out.print(current.name + " -> 끝");
            } else {
                System.out.print(current.name + " -> ");
            }
            current = current.next;
        }
        System.out.println();
    }


		
		
		
		
		
		
		
		
		
		
		
	}

