package Builder.Util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReadXml {
    private static File file=null;
    private static final String CLASSTAG="bean";  //���ǩ
    private static final String CLASSNAME="id";   //��������
    private static final String METHODNTAG="method";  //������ǩ
    private static final String PARAMETERNAME="name";  //����������
    private static final String PARAMETERTAG="parameter"; //����������ǩ
    private static final String TYPENAME="type"; //��������

    public static void setXMLPath(File resource){
        file=resource;
    }
    public static void setXMLPath(String path){
        file=new File(path);
    }
    public static <T> T getBean(Class<T> clazz){
        T object=null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document parse = documentBuilder.parse(file);
            NodeList nodeList = parse.getElementsByTagName(CLASSTAG);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element beanElement = (Element) nodeList.item(i);
                NamedNodeMap attributes = beanElement.getAttributes();
                String ClassName = attributes.getNamedItem(CLASSNAME).getNodeValue();  //��ȡ������
                if (ClassName.equals(clazz.getName())) {   //����ǩ�е������봫ֵ������һ��
                    Constructor<T> constructor = clazz.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    object =object!=null?object:constructor.newInstance();  //��Ҫ�Թ��캯�����д���
                    NodeList  methodNodes = beanElement.getElementsByTagName(METHODNTAG);  //��ȡ������ǩ
                    for (int i1 = 0; i1 < methodNodes.getLength(); i1++) {    //ÿһ��������ִ��
                        Element  methodElement = (Element)methodNodes.item(i1);
                        NamedNodeMap methodAttributes = methodElement.getAttributes();
                        String methodName = methodAttributes.getNamedItem(PARAMETERNAME).getNodeValue();
                        NodeList parameter = methodElement.getElementsByTagName(PARAMETERTAG);
                        if (parameter.getLength()<1){   //һ�������ķ���ִ��
                            Object parameterValue = getParameterValue(parameter);
                            Method method = getMethod(clazz, methodName, parameterValue);
                            method.invoke(object,parameterValue);
                        }else {              //��������ķ���ִ��
                            Object[] objects = getParameterValues(parameter);
                            Method method = getMethod(clazz, methodName, objects);
                            method.invoke(object,objects);
                        }
                    }
                }
            }
        } catch (SAXException | ParserConfigurationException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | IOException e) {
            e.printStackTrace();
        }
        return object;
    }
    private static Object[] getParameterValues(NodeList parameter) {
        List<Object> parameterValues = new ArrayList<>();
        Object[] objects =null;
        for (int i = 0; i < parameter.getLength(); i++) {
            String type = parameter.item(i).getAttributes().getNamedItem(TYPENAME).getNodeValue();
            Element parameterElement = (Element) parameter.item(i);
            String parameterValue = parameterElement.getTextContent();
            switch (type) {      //����ȥ�ж�ΪObject����
                case "Integer":
                case "int":
                    parameterValues.add(Integer.parseInt(parameterValue));
                    break;
                case "Double":
                case "double":
                    parameterValues.add(Double.parseDouble(parameterValue));
                    break;
                case "Character":
                case "char":
                    parameterValues.add(parameterValue.toCharArray()[0]);
                    break;
                case "String":
                    parameterValues.add(parameterValue);
                    break;
            }
        }
        objects = parameterValues.toArray();
        return objects;
    }
    private static Object getParameterValue(NodeList parameter){
        Element parameterElement = (Element) parameter.item(0);
        String parameterValue = parameterElement.getTextContent();
        String type = parameterElement.getAttribute(TYPENAME);
        switch (type) {      //����ȥ�ж�ΪObject����
            case "Integer":
                return Integer.parseInt(parameterValue);
            case "Double":
                return Double.parseDouble(parameterValue);
            case "Character":
                return parameterValue.toCharArray()[0];
            case "String":
                return parameterValue;
        }
        return null;
    }
    //ͨ�������ļ��в��������Լ�����������ѡ����Ӧ�ķ�����������������  �������
    private static <T> Method getMethod(Class<T> clazz,String methodName,Object[] objects){
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (methodName.equals(method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length==objects.length) {
                    for (int i = 0; i < parameterTypes.length; i++) {
                        if (!parameterTypes[i].equals(objects[i]))
                            continue;
                    }
                    return method;
                }
            }
        }
        return null;
    }
    //������������
    private static <T> Method getMethod(Class<T> clazz,String methodName,Object objects){
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (methodName.equals(method.getName())) {
                Class<?> aClass = objects.getClass();
                if (aClass.getTypeName().equals(method.getParameterTypes())) {
                    return method;
                }
            }
        }
        return null;
    }

}
