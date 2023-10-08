package com.example.employee.model;
import javax.persistence.*;
import java.sql.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String name;
    private String location;
    @Column(nullable = false)
    private String numberPhone;
    @Column(nullable = false)
    private String accountName;
    private String image;
    private Date startWorkingDate;
    @Column(nullable = false)
    private Date dateOfBirth;
    @Column(nullable = false)
    private String identificationCard;
    private String email;
    @Column(columnDefinition = "bit(1) default true")
    private boolean gender;
    @Column(columnDefinition = "bit(1) default true")
    private boolean flag = true;
    @ManyToOne
    @JoinColumn(name = "employee_type_id",referencedColumnName = "id",nullable = false)
    private EmployeeType employeeType;
    @OneToOne
    @JoinColumn(name = "account_id",referencedColumnName = "id",nullable = false)
    private Account account;

    public Employee() {
    }

    public Employee(int id, String code, String name, String location, String numberPhone, String accountName, String image, Date startWorkingDate, Date dateOfBirth, String identificationCard, String email, boolean gender, boolean flag, EmployeeType employeeType, Account account) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.location = location;
        this.numberPhone = numberPhone;
        this.accountName = accountName;
        this.image = image;
        this.startWorkingDate = startWorkingDate;
        this.dateOfBirth = dateOfBirth;
        this.identificationCard = identificationCard;
        this.email = email;
        this.gender = gender;
        this.flag = flag;
        this.employeeType = employeeType;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getStartWorkingDate() {
        return startWorkingDate;
    }

    public void setStartWorkingDate(Date startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
