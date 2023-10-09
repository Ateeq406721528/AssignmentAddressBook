package Assignment_Week_06;

class Contact {
    private int id;
    private static int nextId = 1;
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.id = nextId++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public String getEmail() {

        return email;
    }

    public void displayContact() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
