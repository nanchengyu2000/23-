package Builder.imp;

import Builder.ActorBuilder;

public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("Ӣ��");
    }

    @Override
    public void buildSex() {
        actor.setSex("��");
    }

    @Override
    public void buildFace() {
        actor.setFace("˧");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("����");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("����");
    }
}
