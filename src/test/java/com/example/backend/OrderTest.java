package com.example.backend;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import org.junit.Before;
import org.junit.Test;
import com.example.backend.repository.OrderRepo;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.backend.TestUtils;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend.entity.Order;


public class OrderTest extends BackendApplicationTest {
  
   @Autowired
   OrderRepo orderRepo;

   @Override
   @Before
   public void setUp() {
  Order order = new Order();
 order.setId(10L);
 order.setActive(true);
 order.setProductName("chicken1");
 order.setOrderNum(4);
  super.setUp();
   }
  @Test
   public void getOrders() throws Exception {
      String uri = "/api/orders";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);

   } 
    @Test
   public void updateOrder() throws Exception {
 Order analy = new Order();
   orderRepo.findOne(2L);
  analy.setOrderNum(5);
 
  

} 
  @Test
   public void deleteOrder() throws Exception {
        //test with product id
    //replace with id to test 
    /*
      String uri = "/api/orders/{id}";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
     */

} 
 }