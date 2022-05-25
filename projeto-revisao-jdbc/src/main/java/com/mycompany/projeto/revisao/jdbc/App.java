package com.mycompany.projeto.revisao.jdbc;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class App {

    public static void main(String[] args) {
        Conection config = new Conection();

        JdbcTemplate template = new JdbcTemplate(config.getDataSource());

        StringBuilder builder = new StringBuilder();

        //Apagando a table caso exista 
        template.execute("DROP TABLE IF EXISTS JOGO");

        builder.append("CREATE TABLE JOGO(");
        builder.append("ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,");
        builder.append("NOME VARCHAR (200),");
        builder.append("GENERO VARCHAR (200),");
        builder.append(");");

        template.execute(builder.toString());

        template.update("INSERT INTO JOGO VALUES (null,?,?)", "Fifa","futebol");
        template.update("INSERT INTO JOGO VALUES (null,?,?)", "Fifa1", "futebol");
        template.update("INSERT INTO JOGO VALUES (null,?,?)", "Fifa2", "futebol");

        List jogos = template.queryForList("SELECT * FROM JOGO");

        for (Object JOGO : jogos) {
            System.out.println(JOGO.toString());

        }
        
        
        List<Jogo> JOGO = template.query("select * from JOGO",
                new BeanPropertyRowMapper<>(Jogo.class));
    }

}
