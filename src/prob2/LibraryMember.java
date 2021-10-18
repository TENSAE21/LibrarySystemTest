package prob2;

import java.nio.file.StandardWatchEventKinds;

public class LibraryMember {

    private String memberId;
    private String firstName;
    private String lastName;
    private String phone;
    private CheckoutRecord checkoutRecord;

    public LibraryMember(String memberId, String firstName, String lastName, String phone) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        checkoutRecord = new CheckoutRecord(this);
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setCheckoutRecord(CheckoutRecord cr)
    {
         checkoutRecord = cr;
    }

    public CheckoutRecord getCheckoutRecord()
    {
        return checkoutRecord;
    }


}
