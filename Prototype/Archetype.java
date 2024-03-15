package Prototype;

import Prototype.TestModel.Student;
import Prototype.TestModel.Teacher;

import java.io.IOException;

/*
* ԭ�����ģʽ��һ�ִ��������ģʽ������Ҫ˼����ͨ���������ж����������¶��󣬶�����ͨ��ʵ�����¶���ķ�ʽ�����ַ�ʽ�����ڲ���¶���󴴽��߼�������������¶���ͬʱҲ�����ڶ��󴴽������б��ⲻ��Ҫ�ĸ����ԡ�������һЩԭ�����ģʽ��ʹ�ó�����

1. ���ٶ����ʼ�������� ������Ĵ�������ʼ�������ù��̷ǳ������Һ�ʱʱ��ʹ��ԭ��ģʽ���Ա����ظ�ִ����Щ������ͨ���������ж��󣬿��Կ��ٴ����¶��󣬴Ӷ����ٳ�ʼ��������

2. ��̬���ö��� ԭ��ģʽ����������ʱ��̬�����ö���ͨ������һ��ԭ�Ͷ���Ȼ�������Ҫ���Ʋ�������Ҫ�޸��丱�����������ɵش���������в�ͬ���õĶ���

3. ��������Ĵ������̣� ��ʱ�򣬶���Ĵ������̿����漰������Ϣ���ӵĳ�ʼ���߼���ʹ��ԭ��ģʽ���Խ�����Ĵ������̷�װ��ԭ�Ͷ����У������ؽ���Щϸ�ڱ�¶���ͻ��ˡ�

4. ʵ�ֶ���Ŀ��ٿ�¡�� ����Ҫ������ʱ��������ĸ�����������Щ����������ԭʼ����������ͬʱ��ԭ��ģʽ��һ���ܺõ�ѡ��ͨ������ԭ�Ͷ��󣬿��Կ��ٴ����¶��󲢸�����Ҫ�޸���״̬��

5. ��̬�����ࣺ ��ĳЩ����£�������ĳЩ��ܻ���У�������Ҫ�������û�������̬�����ࡣԭ��ģʽ������Ϊʵ�ִ��ද̬���ص�һ�ַ�ʽ����Ϊ������������ʱ�����¶��󣬶�����Ӳ����������͡�

�ܵ���˵��ԭ�����ģʽ����Ҫ��̬�������󡢼��ٶ����ʼ���������������󴴽����̻�ʵ�ֶ���Ŀ��ٿ�¡������¶��Ǻ����õġ�
*
* */
public class Archetype {
    public static void main(String[] args) {
        /*
            ԭ��ģʽ��һ��ʵ��,����ȱ�����ڸ������������Ƕ�׽���ܸ���
        */
//        Student student = new Student("����", 20, "man",new Teacher("����", 50, "man"));
//        System.out.println(student.toString());
//        Student student1 = student.deepClone();
//        student1.setName("����");
//        student1.getTeacher().setName("����");
//        System.out.println(student1.toString());
        /*
            ԭ��ģʽ�ڶ���ʵ��,ʹ�����л��ͷ����л�
         */
        Student student = new Student("����", 20, "man",new Teacher("����", 50, "man"));
        System.out.println(student.toString());
        Student student1 = null;
        try {
            student1 = student.deepClone1();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        student1.setName("����");
        student1.getTeacher().setName("����");
        System.out.println(student1.toString());
    }
}
