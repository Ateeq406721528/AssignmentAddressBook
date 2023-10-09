package Assignment_Week_06;

class ContactBook {
    private static final int MAX_CONTACTS = 100;
    private Contact[] contacts;
    private int count;

    public ContactBook() {
        contacts = new Contact[MAX_CONTACTS];
        count = 0;
    }

    public void addContact(String name, String phoneNumber, String email) {
        if (count < MAX_CONTACTS) {
            contacts[count] = new Contact(name, phoneNumber, email);
            count++;
            System.out.println("Contact added ");
        } else {
            System.out.println("Contact book is full.");
        }
    }

    public void displayContacts() {
        if (count == 0) {
            System.out.println("Contact book is empty.");
        } else {
            System.out.println("Contacts in the Contacts Book:");
            for (int i = 0; i < count; i++) {
                System.out.println("ID: " + contacts[i].getId());
                contacts[i].displayContact();

                System.out.println("");
            }
            System.out.println("Total number of contacts: " + count);

            System.out.println("");
        }
    }

    public int getTotalContacts() {

        return count;
    }
    public void deleteContact(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                contacts[i] = contacts[count - 1];
                contacts[count - 1] = null;
                count--;
                System.out.println("Contact deleted successfully.");
                return;
            }
            else {

            }
            System.out.println("Contact not found.");
        }
    }

}

