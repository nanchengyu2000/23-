package Adapter;

public class BirdAdapter implements Robot {

    private Bird bird=new Bird();
    @Override
    public void cry() {
        System.out.print("��������ģ��");
        bird.call();
    }

    @Override
    public void move() {
        System.out.print("��������ģ��");
        bird.fly();
    }
}
