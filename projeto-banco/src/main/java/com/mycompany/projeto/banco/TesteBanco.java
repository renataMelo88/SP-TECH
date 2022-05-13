package com.mycompany.projeto.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {

    public static void main(String[] args) {
        Connection config = new Connection();

        JdbcTemplate template = new JdbcTemplate(config.getDataSource());

        //Apagando a table caso exista 
        template.execute("DROP TABLE IF EXISTS pokemon");

        String criacaoTabelaPokemom = "CREATE TABLE pokemon ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255),"
                + "tipo VARCHAR(255)"
                + ")";

        //Criando tabela
        template.execute(criacaoTabelaPokemom);

        //Inserindo dados nat tabela pokemon
        String inserirPokemon = "INSERT INTO pokemon VALUES(null,?,?)";
        template.update(inserirPokemon, "Pokemon 01", "Água");

        template.update(inserirPokemon, "Pokemon 02", "Fogo");

        List<Pokemon> listaPokemon01 = template.query("select * from pokemon",
                new BeanPropertyRowMapper<>(Pokemon.class));
        
        for (Pokemon itempokemonDaVez : listaPokemon01) {
             
                System.out.println(itempokemonDaVez);
                
            }
            
        
        
        
        //PERCORRE A LISTA 
        for (int i = 0; i < listaPokemon01.size(); i++) {
            if(listaPokemon01.get(i).getNome().equals("Pokemon 01")) {
                 System.out.println("Existe no banco");
            }
            System.out.println(listaPokemon01.get(i));
        }

    }
}
