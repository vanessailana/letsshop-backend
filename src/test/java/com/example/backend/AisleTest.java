package com.example.backend;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.backend.TestUtils;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.example.backend.repository.AisleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend.entity.Aisle;


public class AisleTest extends BackendApplicationTest {
    
   private final String URL = "/api/editAisle";
;
   @Autowired
    AisleRepo aisleRepo;

   @Override
   @Before
   public void setUp() {
      super.setUp();
   }
  @Test
   public void getAisles() throws Exception {
      String uri = "/api/aisles";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
     int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      Aisle[] aisle = super.mapFromJson(content, Aisle[].class);
      assertTrue(aisle.length > 1);
   }  
   @Test
   public void updateAisles() throws Exception {
   Aisle aisle = new Aisle();
   aisleRepo.findOne(1L);
   aisle.setName("testing");
}
}