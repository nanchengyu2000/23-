package Combination;

public class TextFile extends AbstractFile{
    private String TextFileName;

    public void setTextFileName(String textFileName) {
        TextFileName = textFileName;
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
        System.out.println("�ı��ļ�����ɱ��");
    }
}
