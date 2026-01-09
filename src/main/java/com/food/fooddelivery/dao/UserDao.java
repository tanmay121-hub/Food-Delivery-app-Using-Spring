package com.food.fooddelivery.dao;

import com.food.fooddelivery.model.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<User> userRowMapper = (rs, rowNum) -> {
        User u = new User();
        u.setId(rs.getLong("id"));
        u.setName(rs.getString("name"));
        u.setAddress(rs.getString("address"));
        u.setNo(rs.getString("no"));
        u.setEmail(rs.getString("email"));
        u.setType(rs.getString("type"));
        u.setPreference(rs.getString("preference"));
        return u;
    };

    public int saveUser(User user) {
        String sql = """
            INSERT INTO users (name, address, no, email, type, preference)
            VALUES (?, ?, ?, ?, ?, ?)
            """;
        return jdbcTemplate.update(
                sql,
                user.getName(),
                user.getAddress(),
                user.getNo(),
                user.getEmail(),
                user.getType(),
                user.getPreference()
        );
    }

    public int updateUser(User user) {
        String sql = """
            UPDATE users
            SET name = ?, address = ?, no = ?, email = ?, type = ?, preference = ?
            WHERE id = ?
            """;
        return jdbcTemplate.update(
                sql,
                user.getName(),
                user.getAddress(),
                user.getNo(),
                user.getEmail(),
                user.getType(),
                user.getPreference(),
                user.getId()
        );
    }

    public int deleteUserById(int id) {
        return jdbcTemplate.update("DELETE FROM users WHERE id = ?", id);
    }

    public User findUserById(int id) {
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT id, name, address, no, email, type, preference FROM users WHERE id = ?",
                    userRowMapper,
                    id
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public User findUserByEmail(String email) {
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT id, name, address, no, email, type, preference FROM users WHERE email = ?",
                    userRowMapper,
                    email
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public List<User> findUsersByType(String type) {
        return jdbcTemplate.query(
                "SELECT id, name, address, no, email, type, preference FROM users WHERE type = ? ORDER BY id",
                userRowMapper,
                type
        );
    }

    public List<User> findAllUsers() {
        return jdbcTemplate.query(
                "SELECT id, name, address, no, email, type, preference FROM users ORDER BY id",
                userRowMapper
        );
    }
}
