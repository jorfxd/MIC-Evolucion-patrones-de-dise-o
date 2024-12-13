/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


import Interfaces.List;



 //implementar tda

/**
 *
 * @author oweny
 */
public abstract class Contact {
    
    protected String name;
    protected String urlProfilePic;
    protected List<String> images;
    protected List<Phone> phones;
    protected List<Address> addresses;
    protected List<Email> emails;
    protected List<SpecialDate> specialDates;
    protected String Photo;

    public Contact(List<Phone> phones) {
        this.phones = phones;
    }

    public Contact(String name, List<Phone> phones) {
        this.name = name;
        this.phones = phones;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlProfilePic() {
        return urlProfilePic;
    }

    public void setUrlProfilePic(String urlProfilePic) {
        this.urlProfilePic = urlProfilePic;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<SpecialDate> getSpecialDates() {
        return specialDates;
    }

    public void setSpecialDates(List<SpecialDate> specialDates) {
        this.specialDates = specialDates;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    
    
    
}
