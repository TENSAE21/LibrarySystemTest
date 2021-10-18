package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutEntryList;


    CheckoutRecord()
    {
        checkoutEntryList = new ArrayList();
    }
	CheckoutRecord(LibraryMember libraryMember)
    {
        checkoutEntryList = new ArrayList();
    }
    void addCheckoutEntry(CheckoutRecordEntry entry)
    {
          checkoutEntryList.add(entry);
    }

    List<CheckoutRecordEntry> getCheckoutEntryList()
    {
        return checkoutEntryList;
    }

	
}
