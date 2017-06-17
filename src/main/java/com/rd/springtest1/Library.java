/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rd.springtest1;

/**
 *
 * @author rahul
 */
public class Library {
    String name;
    String location;
    Long  bookcapacity;
    Long booksavailable;

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

    public Long getBookcapacity() {
        return bookcapacity;
    }

    public void setBookcapacity(Long bookcapacity) {
        this.bookcapacity = bookcapacity;
    }

    public Long getBooksavailable() {
        return booksavailable;
    }

    public void setBooksavailable(Long booksavailable) {
        this.booksavailable = booksavailable;
    }

    @Override
    public String toString() {
        return "Library{" + "name=" + name + ", location=" + location + ", bookcapacity=" + bookcapacity + ", booksavailable=" + booksavailable + '}';
    }
    
    
}
