package ATM;

public interface Bill {
    void setNext(Bill bill);
    void process(int amount);
}
