package com.mycompany.projeto.revisao.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conection {

    private BasicDataSource dataSource;

    public Conection() {
        this.dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("org.h2.Driver");
        dataSource​.setUrl("jdbc:h2:file:./meu_banco"); // Colocar caminho jdbc da Azure
        dataSource​.setUsername("sa");
        dataSource​.setPassword("");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

}
