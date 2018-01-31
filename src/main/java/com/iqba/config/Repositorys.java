/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqba.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iqbal
 */
@Repository
public class Repositorys {
    
     @Autowired
     JdbcTemplate jdbcTemplate;
  
    
    public List<JdbcKecamatan> getJdbcKecamatan(){
    
        return jdbcTemplate.query("Select id_kecamatan,id_kota_kab,nm_kec from m_kecamatan", new Object[] {},
                (rs,rowNum) -> {
            JdbcKecamatan kel = new JdbcKecamatan();
            kel.setIdkecamatan(rs.getInt("id_kecamatan"));
            kel.setIdKota(rs.getInt("id_kota_kab"));
            kel.setNamakec(rs.getString("nm_kec"));
            
            return kel;
        });
        
        
       
    
    }
    
    
    
     
    
}
