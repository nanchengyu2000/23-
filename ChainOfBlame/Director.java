package ChainOfBlame;

public class Director extends Staff{

    @Override
    public void handle(PurchaseOrders purchaseOrders) {
        if (purchaseOrders.getPurchase_capital()<=1) {
            System.out.println(this.name+"����������"+purchaseOrders.getName()+"�����"+purchaseOrders.getPurchase_capital()+"��Ԫ�Ĳɹ���");
        }else {
            this.next.handle(purchaseOrders);
        }
    }
}
