package Foctory.test;

import Foctory.Foctory;
import Foctory.Product.Phone;
import Foctory.Product.Tv;
import Foctory.XiaomiFoctory;

public class Test {
    public static  void main(String[] args) {
        //�򵥹���ģʽ
//        Tv tv = Foctory.getBean();
//        tv.shut();

        //����ģʽ
        /*
        * �ⲿ�ֲ�����ֻ�ǶԹ���ʹ����xml,����������Ĵ�����Ʒ��ʹ�õ���new
        *
        * */
        XiaomiFoctory foctory=(XiaomiFoctory)Foctory.getBean("XiaomiFoctory");
        Phone phone = foctory.getPhone();
        phone.Call();

    }
}
