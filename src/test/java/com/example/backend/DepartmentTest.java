package com.example.backend;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import org.junit.Before;
import org.junit.Test;
import com.example.backend.repository.DepartmentRepo;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.backend.TestUtils;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.backend.entity.Department;


public class DepartmentTest extends BackendApplicationTest {
  
   @Autowired
    DepartmentRepo departmentRepo;

   @Override
   @Before
   public void setUp() {
      super.setUp();
   }
  @Test
   public void getDepartments() throws Exception {
      String uri = "/api/departments";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
     int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
    Department[] department = super.mapFromJson(content, Department[].class);
      assertTrue(department.length > 1);
   }  
   @Test
   public void updateDepartments() throws Exception {
   Department department= new Department();
   departmentRepo.findOne(1L);
   department.setTitle("testing");
   

}
}