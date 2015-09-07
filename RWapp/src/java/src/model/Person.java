/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

/**
 *
 * @author admin
 */
public class Person {
    private String name;
    private int yearsWorked;
    private String username;
    private String password;

    public Person(String name, int yearsWorked, String username, String password) {
        this.name = name;
        this.yearsWorked = yearsWorked;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    
}
