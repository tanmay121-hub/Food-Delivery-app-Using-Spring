package com.food.fooddelivery.dao;

import com.food.fooddelivery.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class InventoryDao {
    private JdbcTemplate jdbcTemplate;

    public InventoryDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public int save(Inventory inventory) {
        String sql = "INSERT INTO inventory (item_name, stock, `desc`, image) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(
                sql,
                inventory.getItemName(),
                inventory.getStock(),
                inventory.getDesc(),
                inventory.getImage()
        );
    }

    public int update(Inventory inventory) {
        String sql = "UPDATE inventory SET item_name = ?, stock = ?, `desc` = ?, image = ? WHERE item_id = ?";
        return jdbcTemplate.update(
                sql,
                inventory.getItemName(),
                inventory.getStock(),
                inventory.getDesc(),
                inventory.getImage(),
                inventory.getItemId()
        );
    }

    RowMapper<Inventory> inventoryRowMapper = ((rs, rowNum) -> {
        Inventory i = new Inventory();
        i.setItemId(rs.getInt("item_id"));
        i.setItemName(rs.getString("item_name"));
        return i;
    });
    public List<Inventory> findAll(){
        return jdbcTemplate.query("SELECT * from inventory",inventoryRowMapper);
    }

    public List<Inventory> findPage(int page, int pageSize) {
        if (page < 1) page = 1;
        if (pageSize < 1) pageSize = 10;

        int offset = (page - 1) * pageSize;

        String sql = """
        SELECT item_id, item_name, stock, `desc`, image FROM inventory ORDER BY item_id
        LIMIT ? OFFSET ?
        """;

        return jdbcTemplate.query(sql, inventoryRowMapper, pageSize, offset);
    }
    void deleteByid(int id){
        jdbcTemplate.update("DELETE FROM inventory WHERE item_id =?",id);
    }
}
