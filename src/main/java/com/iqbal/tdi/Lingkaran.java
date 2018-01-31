/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqbal.tdi;

import org.springframework.stereotype.Component;

/**
 *
 * @author iqbal
 */
@Component
public class Lingkaran {
    public double luasLingkaran(int jari){
        return jari*jari*Math.PI;
    }
}
