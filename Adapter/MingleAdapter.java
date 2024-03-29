package Adapter;

public class MingleAdapter implements Robot{

    private Bird bird=new Bird();
    private Dog dog=new Dog();
    @Override
    public void cry() {
        System.out.print("��������ģ��");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.print("��������ģ��");
        bird.fly();
    }
}
