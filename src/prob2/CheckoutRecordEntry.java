package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {

    LocalDate checkoutDate;
    LocalDate dueDate;
    LendingItem item;
    ItemType type;

    public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.item = item;
        this.type = type;
    }

    //    CheckoutRecordEntry( )
//    {
//        item = new LendingItem();
//    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LendingItem getLendingItem()
    {
        return item;
    }

    public ItemType getLendingItemType()
    {
        return type;
    }




}
