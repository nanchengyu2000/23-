package ChainOfBlame;

public class Test {
    public static void main(String[] args) {
        PurchaseOrders order = new PurchaseOrders(27.5, "����");
        Director director = new Director();
        director.setName("����");
        DepartManager departManager = new DepartManager();
        departManager.setName("����");
        VicePresident vicePresident = new VicePresident();
        vicePresident.setName("����");
        President president = new President();
        president.setName("����");
        LeadershipAssembly leadershipAssembly = new LeadershipAssembly();
        director.setNext(departManager);
        departManager.setNext(vicePresident);
        vicePresident.setNext(president);
        president.setNext(leadershipAssembly);
        director.handle(order);
    }
}
