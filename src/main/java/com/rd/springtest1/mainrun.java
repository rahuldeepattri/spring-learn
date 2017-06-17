/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rd.springtest1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author rahul
 */
public class mainrun {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        for (String arg : context.getBeanDefinitionNames()) {
            Library ob = (Library) context.getBean(arg);
            System.out.println(ob);

        }
        System.out.println("asdsad"+context.getApplicationName());
        context.close();
    }
}
