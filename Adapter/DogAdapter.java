package Adapter;

//public class DogAdapter extends Dog implements Robot{  //��������
public class DogAdapter implements Robot{
    private Dog dog=new Dog();
    @Override
    public void cry() {
        System.out.print("��������ģ��");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.print("��������ģ��");
        dog.run();
    }
}
