package com.hsr.demo.application.model;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotNull(message = "User name is required")
    private String userName;

    @NotNull(message = "Password is required")
    //@Password
    private String password;


    @NotNull(message = "First name is required")
    private String firstName;

    private String midName;

    @NotNull(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Phone number is required")
    private String phone;

    @NotNull(message = "Email address is required")
    private String emailAddress;

    @NotNull(message = "Address is required")
    private String addressline;
    @NotNull(message = "City is required")
    private String city;

    @NotNull(message = "State is required")
    private String state;

    @NotNull(message = "Zipcode is required")
    private String zipcode;


    private String role;

    private LocalDate createDate;

    public String getAddressline() {
        return addressline;
    }

    public void setAddressline(String addressline) {
        this.addressline = addressline;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public User(String userName,String password,String firstName, String midName,String lastName,String phone,  String emailAddress, String addressline,  String city, String state,String zipcode, String role, LocalDate createDate) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.phone = phone;
        this.emailAddress = emailAddress;
        this.addressline = addressline;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.role = "User";
        this.createDate = LocalDate.now();
    }

//    public User(@NotNull(message = "User name is required") String userName, @NotNull(message = "Password is required") String password, @NotNull(message = "First name is required") String firstName, String midName, @NotNull(message = "Last name is required") String lastName, @NotNull(message = "Phone number is required") String phone, @NotNull(message = "Email address is required") @Email String emailAddress) {
//        this.userName = userName;
//        this.password = password;
//        this.firstName = firstName;
//        this.midName = midName;
//        this.lastName = lastName;
//        this.phone = phone;
//        this.emailAddress = emailAddress;
//        this.createDate = LocalDate.now();
//
//    }

    public User() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
