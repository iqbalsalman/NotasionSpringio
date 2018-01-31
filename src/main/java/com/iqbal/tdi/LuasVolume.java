/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqbal.tdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author iqbal
 */
@Service
public class LuasVolume {
    @Autowired
    private Lingkaran lingkaran;
    
    public double volumeLingkaran(int jari, int tinggi){
        return lingkaran.luasLingkaran(jari)*tinggi;
    }
    
}
