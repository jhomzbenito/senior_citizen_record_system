/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior.citizen.record.system.pojo;

/**
 *
 * @author Administrator
 */
public class SeniorCitizen {

    private String seniorID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String groupName;
    private String groupArea;
    private String barangay;
    private String address;
    private String birthdate;
    private String birthplace;
    private int age;
    private String gender;
    private String civilStatus;

    public SeniorCitizen(String seniorID) {
        this.seniorID = seniorID;
    }

    public String getSeniorID() {
        return seniorID;
    }

    public void setSeniorID(String seniorID) {
        this.seniorID = seniorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupArea() {
        return groupArea;
    }

    public void setGroupArea(String groupArea) {
        this.groupArea = groupArea;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    
}
