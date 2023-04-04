package com.itany.zshop.service.impl;

import com.itany.zshop.common.util.FtpUtils;
import com.itany.zshop.common.util.StringUtils;
import com.itany.zshop.dao.ProductDao;
import com.itany.zshop.dto.ProductDto;
import com.itany.zshop.params.ProductParam;
import com.itany.zshop.pojo.Product;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductService;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StreamUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Author：汤小洋
 * Date：2018-04-27 11:40
 * Description：<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Value("${ftp.host}")
    private String host;

    @Value("21")
    private Integer port;

    @Value("${ftp.username}")
    private String username;

    @Value("${ftp.password}")
    private String password;

    @Value("/")
    private String basePath;

    @Value("")
    private String baseUrl;

    @Override
    public void add(ProductDto productDto) throws FileUploadException {
        // 1.文件上传
        //String fileName = StringUtils.renameFileName(productDto.getFileName());
        //String filePath=productDto.getUploadPath()+"/"+fileName;
        //
        //try {
        //    StreamUtils.copy(productDto.getInputStream(),new FileOutputStream(filePath));
        //} catch (IOException e) {
        //    throw new FileUploadException("文件上传失败"+e.getMessage());
        //}

        //将文件上传到FTP服务器
        String filePath = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String fileName = StringUtils.renameFileName(productDto.getFileName());
        boolean flag = FtpUtils.uploadFile(host, port, username, password, basePath, filePath, fileName, productDto.getInputStream());
        System.out.println(baseUrl);
        System.out.println(filePath);
        System.out.println(fileName);
        if (!flag){
            throw new FileUploadException("文件上传失败");
        }

        // 2.保存到数据库，将DTO转换为PO
        Product product = new Product();
        try {
            PropertyUtils.copyProperties(product,productDto);
            //product.setImage(filePath);

            product.setImage(baseUrl+"/"+filePath+"/"+fileName);  //http://192.168.1.68/images/20180509/aasd234234234.JPG

            ProductType productType = new ProductType();
            productType.setId(productDto.getProductTypeId());

            product.setProductType(productType);

            productDao.insert(product);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean checkName(String name) {
        Product product=productDao.selectByName(name);
        if(product!=null){
            return false;
        }
        return true;
    }

    @Override
    public List<Product> findAll() {
        return productDao.selectAll();
    }

    @Override
    public Product findById(int id) {
        return productDao.selectById(id);
    }

    @Override
    public void modify(ProductDto productDto) throws FileUploadException {
        // 1.文件上传
        String fileName = StringUtils.renameFileName(productDto.getFileName());
        String filePath=productDto.getUploadPath()+"/"+fileName;

        try {
            StreamUtils.copy(productDto.getInputStream(),new FileOutputStream(filePath));
        } catch (IOException e) {
            throw new FileUploadException("文件上传失败"+e.getMessage());
        }


        // 2.保存到数据库，将DTO转换为PO
        Product product = new Product();
        try {
            PropertyUtils.copyProperties(product,productDto);
            product.setImage(filePath);

            ProductType productType = new ProductType();
            productType.setId(productDto.getProductTypeId());

            product.setProductType(productType);

            productDao.update(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeById(int id) {
        productDao.deleteById(id);
    }

    /**
     * 获取图片，写到输出流中
     * @param path
     * @param outputStream
     */
    @Override
    public void getImage(String path, OutputStream outputStream) {
        try {
            StreamUtils.copy(new FileInputStream(path),outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findByParams(ProductParam productParam) {
        return productDao.selectByParams(productParam);
    }


}
