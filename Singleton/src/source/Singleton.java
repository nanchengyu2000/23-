package source;

/*
* ����ģʽ
* */
//public class Singleton {
//    private static Singleton instance;
//    private Singleton(){};
//    ������ƶ����̲߳���ȫ
//    public static Singleton getInstance(){
//        if(instance==null){
//            instance=new Singleton();
//        }
//        return instance;
//    }
    //�������Ч�ʽϵͣ���Ϊ�����������߳���Ҫ�ȴ�ǰ���߳̽������ȴ��׶β�����뺯��
//    public static synchronized Singleton getInstance(){
//        if(instance==null){
//            instance=new Singleton();
//        }
//        return instance;
//    }
//}
/*
* �Ƚ���ȷ�ĵ���ģʽ������ʽ��
*   �ŵ㣺д����
*   ȱ�㣺������Ƚϴ������ڴ�ռ�
* */
//public class Singleton {
//    private static Singleton instance=new Singleton();  //
//    private Singleton(){};
//    public static Singleton getInstance(){
//        return instance;
//    }
//}
/*
* �Ƚϸ�Ч�ĵ���ģʽ ��˫�ؼ������
* */
//public class Singleton {
//    private volatile static Singleton instance;
//    private Singleton(){};
//    public static Singleton getInstance(){
//        if (instance==null){
//            synchronized (Singleton.class){  //�����̵߳���ʱһ���̼߳���
//                if (instance==null)
//                    instance=new Singleton();
//            }
//        }
//        return instance;
//    }
//}
/*
* ��һ�ֽϺõĵ���ģʽʵ�� ���ڲ��ࡿ
*
* */
public class Singleton {
    private Singleton(){};
    private static class  SingletonHolder {         //��̬��ֻ���ڵ��õ�ʱ��Żᱻ����
        private static final Singleton instance=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
