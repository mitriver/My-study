package exam30;

import java.sql.Timestamp;

public class Student {
    int hakbun;
    String studentName;
    String ssn;
    String phone;
    String address;
    Timestamp createdDate;

    public Student(int hakbun, String studentName, String ssn, String phone, String address, Timestamp createdDate) {
        this.hakbun = hakbun;
        this.studentName = studentName;
        this.ssn = ssn;
        this.phone = phone;
        this.address = address;
        this.createdDate = createdDate;
    }
}
