package ChainOfBlame;

public class LeadershipAssembly extends Staff{

    @Override
    public void handle(PurchaseOrders purchaseOrders) {
            System.out.println("�쵼���������"+purchaseOrders.getName()+"�����"+purchaseOrders.getPurchase_capital()+"��Ԫ�Ĳɹ���");
    }
}
