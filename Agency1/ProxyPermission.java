package Agency1;

public class ProxyPermission implements AbstractPermission{
    private RealPermission realPermission=new RealPermission();
    private int level=0;
    @Override
    public void modifyUserInfo() {
        if (level==0){
            System.out.println("���¼");
        }else if (level==1){
            realPermission.modifyUserInfo();
        }else {
            System.out.println("��������");
        }
    }

    @Override
    public void viewNote() {
        realPermission.viewNote();
    }

    @Override
    public void publicNote() {
        if (level==0){
            System.out.println("���¼");
        }else if (level==1){
            realPermission.publicNote();
        }else {
            System.out.println("��������");
        }
    }

    @Override
    public void modifyNote() {
        if (level==0){
            System.out.println("���¼");
        }else if (level==1){
            realPermission.modifyNote();
        }else {
            System.out.println("��������");
        }
    }

    @Override
    public void setLevel(int level) {
         this.level=level;
    }
}
