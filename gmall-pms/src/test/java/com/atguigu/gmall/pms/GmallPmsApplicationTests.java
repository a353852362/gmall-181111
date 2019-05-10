package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        Product product = productService.getById(1);
//        System.out.println(product.getName());
//        Brand brand = new Brand();
//        brand.setName("hahaha");
//        brandService.save(brand);
        Brand brand1 = brandService.getById(53);
        System.out.println(brand1.getName());
    }

}
