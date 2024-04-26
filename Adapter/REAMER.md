### ��������ʹ�ó�����

���������ģʽͨ���������³�����

1. **�ӿ�ת��**������Ҫʹ��һ�����е��࣬�������Ľӿ���������Ĳ�ƥ��ʱ������ʹ��������ģʽ���������������Ľӿ�ת���ɷ���������Ľӿڣ�ʹ�����ܹ���֮������

2. **��ϵͳ����ϵͳ������**����ϵͳ���������ع�ʱ����ʱ����Ҫ����ϵͳ����ϵͳ�������ϣ��������ǵĽӿڲ����ݡ�������ģʽ��������ʹ�þ�ϵͳ����ϵͳ�ܹ�Эͬ������

3. **���ĸ���**������Ҫʹ��ĳ������е��࣬����������Ľӿ����㵱ǰ��ϵͳ������ʱ�����Ա�д��������ʹ����������Ա����á�

4. **���ⲿ����ļ���**������Ҫ���ⲿ������н������������ǵĽӿڲ�ƥ��ʱ�����Ա�д��������ʵ������Щ�ⲿ����ļ��ɡ�

5. **������ǿ**��������ģʽҲ��������Ϊһ�����е������Ӷ���Ĺ��ܣ�������Ҫ�޸�ԭʼ��Ĵ��룬���������ͨ������Ϊװ����ģʽ��һ��Ӧ�á�

�ܵ���˵��������ģʽ����Ҫ������ʹ�ò����ݵĽӿ��ܹ�Эͬ������ͬʱ����ϵͳ������ԺͿ���չ�ԡ�

> 1. **Ŀ��ӿڣ�Target��**��Ŀ��ӿ��ǿͻ������ڴ��Ľӿڡ��ͻ���ͨ��Ŀ��ӿ������������н�����������Ҫ�˽��������ڲ��ľ���ʵ��ϸ�ڡ�Ŀ��ӿڶ����˿ͻ�������Ĳ�����
>    1. **�������ߣ�Adaptee��**�������������Ѿ����ڵ����ӿڣ���ӿ���ͻ������ڴ��Ľӿڲ����ݡ��������߰����˿ͻ�������Ҫ�Ĺ��ܣ�������ӿ���ʽ�����Ͽͻ��˵�Ҫ��
> 2. **��������Adapter��**����������ʵ����Ŀ��ӿڵ��ࡣ��ͨ����װ�������ߣ����������ߵĽӿ�ת����Ŀ��ӿڣ��Ӷ�ʹ�ÿͻ����ܹ��뱻�����߽��н������������ڲ�����һ���������ߵ�ʵ��������ʵ����Ŀ��ӿڵ����з������ڷ����е��ñ������ߵ���Ӧ������������䡣
> 3. **�ͻ��ˣ�Client��**���ͻ�����ʹ�����������ࡣ�ͻ���ͨ��Ŀ��ӿ������������н�����������Ҫ֪���������ڲ������ʵ�ֵģ�Ҳ����Ҫֱ���뱻�����߽��н���

������������������ʽ������ʹ����ϵķ�ʽ������������������ϵ��������������ӿ���ʽ������ʹ��ʵ�ֵķ�ʽ������������������ϵ

### ��������

������ͨ���̳�Ŀ��ӿڵ���ʽ������������

```java
package Adapter;

public interface Robot {
    void cry();

    void move();
}
package Adapter;

public class Dog {
    public void wang() {
        System.out.println("����");
    }

    public void run() {
        System.out.println("����");
    }
}

package Adapter;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.print("��������ģ��");
        super.wang();
    }

    @Override
    public void move() {
        System.out.print("��������ģ��");
        super.wang();
    }
}

public class Main {
    public static void main(String[] args) {
        DogAdapter dogAdapter = new DogAdapter();
        dogAdapter.cry();    //��������ģ�¹���
        dogAdapter.move();   //��������ģ�¹���
    }
}
```



### ����������

ͨ����Ŀ��ӿ��Ծۺϻ���ϵķ�ʽ������������

```java
package Adapter;

public interface Robot {
    void cry();

    void move();
}

package Adapter;

public class Bird {
    public void call() {
        System.out.println("С���");
    }

    public void fly() {
        System.out.println("С���");
    }
}

package Adapter;

public class Dog {
    public void wang() {
        System.out.println("����");
    }

    public void run() {
        System.out.println("������");
    }
}

package Adapter;

public class MingleAdapter implements Robot {   //������ϵķ�ʽ

    private Bird bird = new Bird();
    private Dog dog = new Dog();

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

public class Main {
    public static void main(String[] args) {
        MingleAdapter mingleAdapter = new MingleAdapter();
        mingleAdapter.cry();
        mingleAdapter.move();
    }
}
```



### ˫��������





