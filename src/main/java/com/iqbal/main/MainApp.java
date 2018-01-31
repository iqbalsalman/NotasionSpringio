/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqbal.main;

import com.iqbal.tdi.LuasVolume;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author iqbal
 */
public class MainApp {
    public static void main(String[] args){
     AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        LuasVolume cust = (LuasVolume) context.getBean("luasVolume");
        System.out.println("Luas Volusnya " +cust.volumeLingkaran(100, 30));
     
     }
    }

    

