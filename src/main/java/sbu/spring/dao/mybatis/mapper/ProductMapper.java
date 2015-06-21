package sbu.spring.dao.mybatis.mapper;
import sbu.spring.domain.Product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

     List<Product> getProductListByCategory(int productCateNum);

     Product getProduct(int productNum);
     
     Product getLastProduct();
     
     List<Product> getProductListByEventNum(int productEventNum);
     
     void updateProductRemain(@Param("productNum") int productNum,@Param("productRemain") int productRemain);

	Product getProductAll();

     //List<Product> searchProductList(String keywords);

}