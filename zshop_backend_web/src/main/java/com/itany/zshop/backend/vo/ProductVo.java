package com.itany.zshop.backend.vo;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Author：汤小洋
 * Date：2018-04-27 11:22
 * Description：<描述>
 */
public class ProductVo {

    private Integer id;
    private String name;
    private Double price;
    private CommonsMultipartFile file;
    private Integer productTypeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}
