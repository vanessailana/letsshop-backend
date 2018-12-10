package com.example.backend;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import org.junit.Before;
import org.junit.Test;
import com.example.backend.repository.ProductRepo;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.backend.TestUtils;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend.entity.Product;


public class ProductTest extends BackendApplicationTest {
  
   @Autowired
   ProductRepo prodRepo;

   @Override
   @Before
   public void setUp() {
    Product product= new Product();
    product.setId(100L);
    product.setTitle("milanese");
    product.setPrice(100.00);
    product.setActive(true);
    product.setAisleId(1);
    product.setDepartmentId(1);
      super.setUp();
   }
  @Test
   public void getProducts() throws Exception {
      String uri = "/api/products";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);

   } 
    @Test
   public void updateProduct() throws Exception {
   Product product = new Product();
   prodRepo.findOne(1L);
   product.setTitle("testing");
  

} 
  @Test
   public void deleteProduct() throws Exception {
        //test with product id
      /*String uri = "/api/products/{id}";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);*/
     

} 
 }
