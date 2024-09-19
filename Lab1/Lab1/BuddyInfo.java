public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo friend = new BuddyInfo("Jason Keith","888 Forester Av", 888-999-1234);
        System.out.println("Hello " + friend.getName());
    }
}
