import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyInfo;

    public AddressBook() {
        this.buddyInfo = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBuddyInfo) {
        buddyInfo.add(newBuddyInfo);
    }

    public void removeBuddy(BuddyInfo removeBuddyInfo) {
        buddyInfo.remove(removeBuddyInfo);
    }

    public static void main(String[] args)
    {
        BuddyInfo buddyInfo1 = new BuddyInfo("Jacob","666 Riverflow", 555);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo1);
        addressBook.removeBuddy(buddyInfo1);
    }

}