/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqba.config;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author iqbal
 */
public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);

        Repositorys sd = (Repositorys) context.getBean(Repositorys.class);

        List<JdbcKecamatan> ls = sd.getJdbcKecamatan();
        for (JdbcKecamatan jdbcKecamatan : ls) {
            System.out.println(jdbcKecamatan.idKota + "|| " + jdbcKecamatan.getNamakec());
        }
    }

}
