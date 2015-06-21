package sbu.spring.dao.mybatis.mapper;
import sbu.spring.domain.Product;
import java.util.List;

public interface ProductMapper {

     List<Product> getProductListByCategory(int productCateNum);

     Product getProduct(int productNum);
     
     Product getProductByEventNum(int producEventNum);
     
     void updateProductRemain(int productNum);

     //List<Product> searchProductList(String keywords);

}