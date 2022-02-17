package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.BundleModel;
import com.coolshop.catalog.service.AttributeValueService;
import com.coolshop.catalog.service.ProductService;
import com.coolshop.catalog.service.SkuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringCatalogApplication.class})
public class BundleServiceTest {

    @Autowired
    IdGenerator idGenerator;

    @Autowired
    SkuService skuService;

    @Autowired
    AttributeValueService attributeValueService;

    @Test
    public void addTvController() {

    }
}
