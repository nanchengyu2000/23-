package Agency1;

public class RealPermission implements AbstractPermission{
    @Override
    public void modifyUserInfo() {
        System.out.println("�޸��û���Ϣ");
    }

    @Override
    public void viewNote() {
        System.out.println("������");
    }

    @Override
    public void publicNote() {
        System.out.println("������");
    }

    @Override
    public void modifyNote() {
        System.out.println("�޸�����");
    }

    @Override
    public void setLevel(int level) {

    }
}
