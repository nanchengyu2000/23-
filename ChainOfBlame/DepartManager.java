package ChainOfBlame;

public class DepartManager extends Staff{
    @Override
    public void handle(PurchaseOrders purchaseOrders) {
        if (purchaseOrders.getPurchase_capital()<=5) {
            System.out.println(this.name+"���ž���������"+purchaseOrders.getName()+"�����"+purchaseOrders.getPurchase_capital()+"��Ԫ�Ĳɹ���");
        }else {
            this.next.handle(purchaseOrders);
        }
    }
}
