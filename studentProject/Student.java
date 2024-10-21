package studentProject;


public class Student {
    private int sId;
    private String sName;
    private String sAddress;

    // Constructor
    public Student(int sId, String sName, String sAddress) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;
    }

    // Getters
    public int getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    // toString method to display the student details
    @Override
    public String toString() {
        return "ID: " + sId + ", Name: " + sName + ", Address: " + sAddress;
    }
}