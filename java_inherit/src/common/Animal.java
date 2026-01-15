package common;

public abstract class Animal {

    protected String name;

    // 🔧 여기만 수정
    public Animal(String name) {
        this.name = name;
    }

    public final void sleep() {
        System.out.println(name + " 잠을 잔다.");
    }

    // 자식 클래스가 반드시 구현
    public abstract void sound(); // 추상메서드
}




