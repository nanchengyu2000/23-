package Combination;

public class ImageFile extends AbstractFile{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("��֧�ִ˹���");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("ɾ���ɹ���");
    }

    @Override
    public AbstractFile getChile(int i) {
        System.out.println("��֧�ִ˹���");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("ͼƬ�ļ�����ɱ��");
    }
}
