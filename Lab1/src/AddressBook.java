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
        System.out.println("Address Book");
    }

}