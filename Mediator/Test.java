package Mediator;

public class Test {
    public static void main(String[] args) {
        DevelopingCoun China = new DevelopingCoun("�й�");
        DevelopingCoun India = new DevelopingCoun("ӡ��");
        DevelopedCoun America = new DevelopedCoun("����");
        DevelopedCoun England = new DevelopedCoun("Ӣ��");
        WFC wfc = new WFC();
        wfc.register(China);
        wfc.register(America);
        China.sendNegotiate("����","���գ�������Ӯ��~��");
        China.sendNegotiate("Ӣ��","hello~");
    }
}
