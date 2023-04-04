package com.itany.zshop.service;

import com.itany.zshop.dto.ProductDto;
import com.itany.zshop.params.ProductParam;
import com.itany.zshop.pojo.Product;
import org.apache.commons.fileupload.FileUploadException;

import java.io.OutputStream;
import java.util.List;

/**
 * Author：汤小洋
 * Date：2018-04-27 11:26
 * Description：<描述>
 */
public interface ProductService {

    public void add(ProductDto productDto) throws FileUploadException;

    boolean checkName(String name);

    List<Product> findAll();

    Product findById(int id);

    void modify(ProductDto productDto) throws FileUploadException;

    void removeById(int id);

    void getImage(String path, OutputStream outputStream);

    List<Product> findByParams(ProductParam productParam);
}
