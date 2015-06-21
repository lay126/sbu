package sbu.spring.dao.mybatis.mapper;
import sbu.spring.domain.Product;
import java.util.List;

public interface EventMapper {

	  List<Product> getProductListByCategory(int productCateNum);

	  Product getProduct(int productNum);

	  //List<Product> searchProductList(String keywords);

}
