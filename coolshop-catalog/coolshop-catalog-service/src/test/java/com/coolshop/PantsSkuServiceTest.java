package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.ProductModel;
import com.coolshop.catalog.model.SkuModel;
import com.coolshop.catalog.service.AttributeValueService;
import com.coolshop.catalog.service.ProductService;
import com.coolshop.catalog.service.SkuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringCatalogApplication.class})
public class PantsSkuServiceTest {
    @Autowired
    ProductService productService;

    @Autowired
    IdGenerator idGenerator;

    @Autowired
    SkuService skuService;

    @Autowired
    AttributeValueService attributeValueService;

    @Test
    public void savePant() {
        SkuModel sku = new SkuModel();
        ProductModel product = this.productService.find(120097919935185923L);
        sku.setProduct(product);
        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴Giordano男装经典五袋修身牛仔九分裤01128005 77中蓝色 27码");
        sku.setDescription("佐丹奴Giordano男装经典五袋修身牛仔九分裤01128005 77中蓝色 27码");
        sku.setBarCode("6931659892029");
        sku.setCode("1100811");
        sku.setCostPrice(65L);
        sku.setListPrice(265L);
        sku.setSalePrice(265L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        AttributeValueModel color = this.attributeValueService.find(118166813518350339L);
        Map<String,Object> args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        AttributeValueModel clothSize = this.attributeValueService.find(120103746058329091L);
        Map<String,Object> args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120097919935185923L);
        sku.setProduct(product);
        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴Giordano男装经典五袋修身牛仔九分裤01128005 77中蓝色 31码");
        sku.setBarCode("6931659892030");
        sku.setCode("1100812");
        sku.setCostPrice(65L);
        sku.setListPrice(265L);
        sku.setSalePrice(265L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518350339L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(120103746058333187L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);

        sku = new SkuModel();
        product = this.productService.find(120097919935185923L);
        sku.setProduct(product);
        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴Giordano男装经典五袋修身牛仔九分裤01128005 77中蓝色 32码");
        sku.setBarCode("6931659892031");
        sku.setCode("1100813");
        sku.setCostPrice(65L);
        sku.setListPrice(265L);
        sku.setSalePrice(265L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518355459L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(120103746058334211L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120097919935186947L);
        sku.setProduct(product);
        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴Giordano男装牛仔裤 男士纯棉猫须洗水窄脚牛仔长裤子 61117046 62深靛蓝色 29码");
        sku.setBarCode("6931659892032");
        sku.setCode("1100814");
        sku.setCostPrice(39L);
        sku.setListPrice(169L);
        sku.setSalePrice(169L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518350339L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(120103746058331139L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);

        sku = new SkuModel();
        product = this.productService.find(120097919935186947L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴Giordano男装牛仔裤 男士纯棉猫须洗水窄脚牛仔长裤子 61117046 62深靛蓝色 30码");
        sku.setBarCode("6931659892033");
        sku.setCode("1100815");
        sku.setCostPrice(39L);
        sku.setListPrice(169L);
        sku.setSalePrice(169L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518351363L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(120103746058332163L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120097919935184899L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴牛仔长裤 男装纯棉夏季薄款牛仔裤 男中腰窄脚裤子13118002 86中灰色 36码");
        sku.setBarCode("6931659892034");
        sku.setCode("1100816");
        sku.setCostPrice(49L);
        sku.setListPrice(169L);
        sku.setSalePrice(169L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518353411L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(120103746058332163L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120097919935184899L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("佐丹奴牛仔长裤 男装纯棉夏季薄款牛仔裤 男中腰窄脚裤子13118002 86中蓝色 36码");
        sku.setBarCode("6931659892035");
        sku.setCode("1100817");
        sku.setCostPrice(49L);
        sku.setListPrice(169L);
        sku.setSalePrice(169L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518350339L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(118166813518344195L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);
    }
}
