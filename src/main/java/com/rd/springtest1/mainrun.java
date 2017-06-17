/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rd.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author rahul
 */
public class mainrun {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
        Library ob=context.getBean(Library.class);
        System.out.println(ob);
    }
}
