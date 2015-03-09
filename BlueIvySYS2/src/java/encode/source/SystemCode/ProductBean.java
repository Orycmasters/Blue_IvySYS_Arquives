/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode.source.SystemCode;

import encode.source.javaBean.Product;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author pc
 */
@ManagedBean
public class ProductBean {
    private List <Product> produtos = new ArrayList <Product>();
    private Product produto = new Product();

    public List<Product> getProduto() {
        return produtos;
    }

    public void setProduto(List<Product> produtos) {
        this.produtos = produtos;
    }
    
    public void addProduct(){
        this.produtos.add(this.produto);
        this.produto = new Product();
    
    }
    
}
