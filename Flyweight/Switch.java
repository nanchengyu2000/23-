package Flyweight;

public class Switch extends NetworkDevice{
    private String type;

    public Switch(String type) {
        this.type=type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void Use(Port port) {
        System.out.println("ʹ��"+this.type+",����"+port.getPort()+"�˿�");
    }
}
