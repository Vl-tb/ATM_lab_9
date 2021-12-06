package ATM;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class BillDef implements Bill {
    private Bill nextBill;
    private final int size;

    public BillDef(int size) {
        this.size = size;
    }

    @Override
    public void setNext(Bill bill) {
        nextBill = bill;
    }

    @Override
    public void process(int amount) throws IllegalArgumentException {
        if (nextBill != null) {
            nextBill.process(amount % size);
        }
        else{
            if (amount % size != 0){
                throw new IllegalArgumentException();
            }
        }
        int num = amount/size;
        System.out.printf("'%d' - %d\n", size, num);

    }
}
