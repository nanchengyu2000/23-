package Factory.test;

import Factory.Factory;
import Factory.Product.Phone;
import Factory.XiaomiFactory;

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
        XiaomiFactory foctory=(XiaomiFactory) Factory.getBean("XiaomiFactory");
        Phone phone = foctory.getPhone();
        phone.Call();

    }
}
