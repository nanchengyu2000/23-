package Builder.imp;

import Builder.ActorBuilder;

public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("��ħ");
    }

    @Override
    public void buildSex() {
        actor.setSex("��");
    }

    @Override
    public void buildFace() {
        actor.setFace("�׶�");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("���ϰ���");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("��ͷ");
    }

    @Override
    public boolean isBareHeader() {
        return true;
    }
}
