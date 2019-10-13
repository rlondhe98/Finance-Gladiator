package com.lti.finance.entity;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "getAllUsers", query="from Users")
})

@Entity
@Table(name = "USERDETAILS")
public class Users
{
    @Id
    @Column(name = "USERID")
    private int userId;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "USERPASS")
    private String userPassword;
    @Column(name = "EMAIL")
    private String userEmail;
    @Column(name = "CONTACT")
    private long userContactNumber;
    @Column(name = "ADDRESS")
    private String userAddress;
    @Column(name = "SAVINGSACCNUMBER")
    private long userSavingsAccNumber;
    @Column(name = "IFSCCODE")
    private long bankIfscCode;

    public Users()
    {
        super();
    }

    public Users(int userId, String userName, String userPassword, String userEmail, long userContactNumber, String userAddress, long userSavingsAccNumber, long bankIfscCode) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userContactNumber = userContactNumber;
        this.userAddress = userAddress;
        this.userSavingsAccNumber = userSavingsAccNumber;
        this.bankIfscCode = bankIfscCode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public long getUserContactNumber() {
        return userContactNumber;
    }

    public void setUserContactNumber(long userContactNumber) {
        this.userContactNumber = userContactNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public long getUserSavingsAccNumber() {
        return userSavingsAccNumber;
    }

    public void setUserSavingsAccNumber(long userSavingsAccNumber) {
        this.userSavingsAccNumber = userSavingsAccNumber;
    }

    public long getBankIfscCode() {
        return bankIfscCode;
    }

    public void setBankIfscCode(long bankIfscCode) {
        this.bankIfscCode = bankIfscCode;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userContactNumber=" + userContactNumber +
                ", userAddress='" + userAddress + '\'' +
                ", userSavingsAccNumber=" + userSavingsAccNumber +
                ", bankIfscCode=" + bankIfscCode +
                '}';
    }
}
