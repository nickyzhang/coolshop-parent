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
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringCatalogApplication.class})
public class ClothesSkuServiceTest {
    @Autowired
    ProductService productService;

    @Autowired
    IdGenerator idGenerator;

    @Autowired
    SkuService skuService;

    @Autowired
    AttributeValueService attributeValueService;

    @Test
    public void saveClothes() {
        SkuModel sku = new SkuModel();
        ProductModel product = this.productService.find(120089182897966083L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("花花公子短袖衬衫2018新款休闲商务衬衫时尚潮流翻领男装修身短袖衬衣男 黑色 165/M");
        sku.setBarCode("6931659892023");
        sku.setCode("1100804");
        sku.setCostPrice(70L);
        sku.setListPrice(148L);
        sku.setSalePrice(148L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        AttributeValueModel color = this.attributeValueService.find(118166813518347267L);
        Map<String,Object> args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        AttributeValueModel clothSize = this.attributeValueService.find(118166813518343171L);
        Map<String,Object> args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120089182897966083L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("花花公子短袖衬衫2018新款休闲商务衬衫时尚潮流翻领男装修身短袖衬衣男 绿色 170 L");
        sku.setBarCode("6931659892024");
        sku.setCode("1100805");
        sku.setCostPrice(50L);
        sku.setListPrice(128L);
        sku.setSalePrice(128L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518351363L);
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

        sku = new SkuModel();
        product = this.productService.find(120089182897966083L);
        sku.setProduct(product);
        sku.setId(idGenerator.generateId());
        sku.setName("花花公子短袖衬衫2018新款休闲商务衬衫时尚潮流翻领男装修身短袖衬衣男 紫色 180 2XL");
        sku.setBarCode("6931659892025");
        sku.setCode("1100806");
        sku.setCostPrice(50L);
        sku.setListPrice(128L);
        sku.setSalePrice(128L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518355459L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(118166813518346243L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120089182897967107L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("花花公子 PLAYBOY2018夏季新款衬衫男装时尚休闲桑蚕丝中年男士日常百搭翻领衬衫男装正品 蓝色 XL");
        sku.setBarCode("6931659892026");
        sku.setCode("1100807");
        sku.setCostPrice(99L);
        sku.setListPrice(399L);
        sku.setSalePrice(339L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518350339L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(118166813518345219L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);

        sku = new SkuModel();
        product = this.productService.find(120089182897967107L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("花花公子 PLAYBOY2018夏季新款衬衫男装时尚休闲桑蚕丝中年男士日常百搭翻领衬衫男装正品 蓝色 L");
        sku.setBarCode("6931659892027");
        sku.setCode("1100808");
        sku.setCostPrice(70L);
        sku.setListPrice(238L);
        sku.setSalePrice(238L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518351363L);
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


        sku = new SkuModel();
        product = this.productService.find(120089182897968131L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("花花公子 PLAYBOY2018夏季新款衬衫男装桑蚕丝中年男士商务正装休闲百搭夏季薄款短袖免烫衬衫 白色 XL");
        sku.setBarCode("6931659892028");
        sku.setCode("1100809");
        sku.setCostPrice(70L);
        sku.setListPrice(238L);
        sku.setSalePrice(238L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518348291L);
        args1 = new HashMap<>();
        args1.put("skuId",sku.getId());
        args1.put("attributeValueId",color.getId());
        args1.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args1);

        clothSize = this.attributeValueService.find(118166813518345219L);
        args2 = new HashMap<>();
        args2.put("skuId",sku.getId());
        args2.put("attributeValueId",clothSize.getId());
        args2.put("createTime",LocalDateTime.now());
        this.skuService.saveSkuAndAttributeValue(args2);


        sku = new SkuModel();
        product = this.productService.find(120089182897968131L);
        sku.setProduct(product);

        sku.setId(idGenerator.generateId());
        sku.setName("花花公子 PLAYBOY2018夏季新款衬衫男装桑蚕丝中年男士商务正装休闲百搭夏季薄款短袖免烫衬衫 红色 L");
        sku.setBarCode("6931659892029");
        sku.setCode("1100810");
        sku.setCostPrice(70L);
        sku.setListPrice(238L);
        sku.setSalePrice(238L);
        sku.setCreateTime(LocalDateTime.now());
        sku.setStatus(Boolean.TRUE);
        this.skuService.save(sku);
        color = this.attributeValueService.find(118166813518349315L);
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

    public void addSkuProperties() {

    }
}
