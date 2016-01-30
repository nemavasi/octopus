package com.ds.my.octopus.www.common;

/**
 * Created by nemavasi on 30.01.16.
 */
public interface IUser {

    String getLogin();

    void setPassword();

    String getEmail();

    void setEmail(String email);

    IPositionsCatalog getPositionsCatalog();

}
