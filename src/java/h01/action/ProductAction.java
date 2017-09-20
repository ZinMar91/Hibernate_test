/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h01.action;

import com.opensymphony.xwork2.ActionSupport;
import h01.dao.ProductDaoImpl;
import h01.entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductAction extends ActionSupport {
    private Product product;
    private List<Product> productList = new ArrayList<>();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    public ProductAction() {
    }
    
    public String execute() throws Exception {
        System.out.println("Product >>>>>> " + product.toString());
        return ProductDaoImpl.add(product);
    }
    
    public String viewAll() {
        productList = ProductDaoImpl.viewAll();
        return "success";
    }
}
