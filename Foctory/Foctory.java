package Foctory;

import Foctory.Product.Imp.HaiXiTv;
import Foctory.Product.Imp.HaierTv;
import Foctory.Product.Tv;

import java.util.List;

public class Foctory {
    /*
    * ��һ�ַ��� �����û�����ʵ�ּ򵥹���ģʽ
    * */
//    public static Tv getBean(String name){
//        Tv tv=null;
//        if (name=="HaiXi"){
//            tv = new HaiXiTv();
//        }else if(name=="Haier"){
//            tv=new HaierTv();
//        }
//        return tv;
//    }
    /*
    * �ڶ��ַ��� ͨ������ʵ�ּ򵥹���ģʽ
    * */
//    public static Tv getBean(String name){
//        Tv tv = null;
//        try {
//            Class aClass = Class.forName(name);
//            tv = (Tv) aClass.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return  tv;
//    }
    /*
    * �����ַ���   ͨ�������ļ�+����ʵ�ּ򵥹���ģʽ
    * */
//    public static Tv getBean(){
//        Tv tv=null;
//        String name = ReadXML.readName("ʵ��/config.xml","branName");
//        try {
//            Class aClass = Class.forName(name);
//            tv = (Tv) aClass.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return  tv;
//    }


    /*
    * �����ַ���  ͨ�����󹤳�+�����ļ�+����ʵ�ֹ���ģʽ
    * */
    public static AbstractFoctory getBean(String foctoryname){
        AbstractFoctory foctory=null;
        List<String> beans = ReadXML.readFactorise();
        try {
            for (String bean : beans) {
                Class beanClass = Class.forName(bean);
                String simpleName = beanClass.getSimpleName();
                if (simpleName.equals(foctoryname)){
                    foctory = (AbstractFoctory) beanClass.newInstance();
                    return foctory;
                }

            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return foctory;
    }
}
