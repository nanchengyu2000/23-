package Builder;

public abstract class ActorBuilder {
    protected Actor actor=new Actor();
    public abstract void buildType();
    public abstract void  buildSex();
    public abstract void  buildFace();
    public abstract void  buildCostume();
    public abstract void  buildHairstyle();
    //���ӷ���
    public boolean isBareHeader(){  //���Ӿ�ϸ�����
        return false;
    }
    public Actor createActor(){
        return actor;
    }
}
