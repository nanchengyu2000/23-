package ChainOfBlame;

public class VicePresident extends Staff{
    @Override
    public void handle(PurchaseOrders purchaseOrders) {
        if (purchaseOrders.getPurchase_capital()<=10) {
            System.out.println(this.name+"���ܾ���������"+purchaseOrders.getName()+"�����"+purchaseOrders.getPurchase_capital()+"��Ԫ�Ĳɹ���");
        }else {
            this.next.handle(purchaseOrders);
        }
    }
}
