package com.deceiver.springbootjdbc.repository;

import com.deceiver.springbootjdbc.domain.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-19
 * Time: 11:24
 */
@Repository
public class JdbcIngredientRepository implements IngredientRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcIngredientRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Ingredient> findAll() {
        return jdbc.query("select id, name, type from Ingredient", this::mapRowToIngredient);
    }

    @Override
    public Ingredient findOne(String id) {
        return jdbc.queryForObject(
                "select id, name, type from Ingredient where id=?",
                new RowMapper<Ingredient>() {

                    public Ingredient mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        return new Ingredient(
                                rs.getString("id"),
                                rs.getString("name"),
                                Ingredient.Type.valueOf(rs.getString("type")));
                    }

                }, id);
    }

    @Override
    public Ingredient findById(String id) {
        return jdbc.queryForObject("select id, name, type form Ingredient where id=?", this::mapRowToIngredient, id);
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        jdbc.update(
                "insert into Ingredient (id, name, type) values(?,?,?)",
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getType()
        );
        return ingredient;
    }

    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException {
        return new Ingredient(
                rs.getString("id"),
                rs.getString("name"),
                Ingredient.Type.valueOf(rs.getString("type"))
        );
    }
}
