/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author oweny
 */
public class Email {
    public String emailAddress;
    public String label;

    public Email(String emailAddress, String label) {
        this.emailAddress = emailAddress;
        this.label = label;
    }

    public String getText() {
        return emailAddress;
    }

    public void setText(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
