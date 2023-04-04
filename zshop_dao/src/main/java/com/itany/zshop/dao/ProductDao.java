package com.itany.zshop.dao;

import com.itany.zshop.params.ProductParam;
import com.itany.zshop.pojo.Product;

import java.util.List;

/**
 * Author：汤小洋
 * Date：2018-04-27 11:47
 * Description：<描述>
 */
public interface ProductDao {

    public void insert(Product product);

    Product selectByName(String name);

    List<Product> selectAll();

    Product selectById(int id);

    void update(Product product);

    void deleteById(int id);

    List<Product> selectByParams(ProductParam productParam);
}
