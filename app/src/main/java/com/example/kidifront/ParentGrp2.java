package com.example.kidifront;

import android.util.Patterns;

public class ParentGrp2 {
    private String fullName;
    private String email;
    private String password;
    private String reTypePassword;
    private String phoneNum;
    private boolean flag=true;
    //private List<kid> myKids;

    /**
     * Default constructor
     */
    public ParentGrp2() {

    }

    /**
     * full constructor (with empty kids set).
     * @param fullName - the parent full name
     * @param email - the parent email
     * @param password - the parent password
     * @param reTypePassword - the password reTyped
     * @param phoneNum - the parent phone number (without the area code).
     */
    public ParentGrp2(String fullName, String email, String password, String reTypePassword, String phoneNum) {
        setFullName(fullName);
        setEmail(email);
        setPassword(password, reTypePassword);
        setPhoneNum(phoneNum);
        //this.myKids=new ArrayList<>();

    }

    public String getFullName() {
        return fullName;
    }

    /**
     * default set, with a regex of full name that checks, the name is only letters and white spaces.
     * @param fullName
     */
    public void setFullName(String fullName) {
        if (fullName.matches("(?=^.{6,40}$)^[a-zA-Z-]+\\s[a-zA-Z-]+$"))
            this.fullName = fullName;
        else
            flag = false;
    }


    public String getEmail() {
        return email;
    }

    /**
     * default set, uses patterns to check the given email is a valid email (with @domain.com etc)
     * @param email
     */
    public void setEmail(String email) {
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches())
            this.email = email;
        else
            flag = false;
    }

    public String getPassword() {
        return password;
    }

    /**
     * sets password, with checking that the password and the reType are the same.
     * @param password
     * @param reTypePassword
     */
    public void setPassword(String password, String reTypePassword) {
        setReTypePassword(reTypePassword);
        if (password.equals(this.reTypePassword))
            this.password = password;
        else
            flag = false;
    }

    public String getReTypePassword() {
        return reTypePassword;
    }

    public void setReTypePassword(String reTypePassword) {
        this.reTypePassword = reTypePassword;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * default set, checks that the phone number is valid.
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        if (Patterns.PHONE.matcher(phoneNum).matches())
            this.phoneNum = phoneNum;
        else
            flag = false;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", reTypePassword='" + reTypePassword + '\'' +
                ", phoneNum='" + phoneNum + '\''+
                '}';
    }
}
