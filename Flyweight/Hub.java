package Flyweight;

import Flyweight.NetworkDevice;
import Flyweight.Port;

public class Hub extends NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
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
