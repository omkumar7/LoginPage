package com.omkumar.model;

import javax.validation.Validation;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User extends Validation {

  private String username;

  @Size(min = 8,max = 8,message = "Password Must Be 8 Character")
  private String password;

  private String firstname;

  private String lastname;

  @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "Please Enter a Valid Email")
  private String email;

  private String address;

  @Size(min = 10,max = 10,message = "Please Enter a Valid Phone Number")
  private String phone;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
