package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.dao.ProductDao;
import com.coolshop.catalog.model.*;
import com.coolshop.catalog.service.*;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringCatalogApplication.class})
public class ClothesProductServiceTest {
    @Autowired
    ProductService productService;

    @Autowired
    IdGenerator idGenerator;

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    AttributeValueService attributeValueService;

    @Autowired
    AttributeNameService attributeNameService;

    @Test
    public void addTV() {
        ProductModel hiseneseCurve = new ProductModel();
        BrandModel brand = this.brandService.findByName("海信");
        hiseneseCurve.setBrand(brand);
        CategoryModel curve = this.categoryService.findByName("曲面电视");
        hiseneseCurve.setCategory(curve);

        hiseneseCurve.setId(idGenerator.generateId());
        hiseneseCurve.setName("海信(Hisense)LED55E7C 曲面电视");
        hiseneseCurve.setDescription("海信(Hisense)LED55E7C 曲面电视");
        hiseneseCurve.setRating(3.5F);
        hiseneseCurve.setReview(44000);
        hiseneseCurve.setCreateTime(LocalDateTime.now());
        this.productService.save(hiseneseCurve);


        ProductModel hiseneseUltra = new ProductModel();
        hiseneseUltra.setBrand(brand);
        CategoryModel ultra = this.categoryService.findByName("超薄电视");
        hiseneseUltra.setCategory(ultra);
        hiseneseUltra.setId(idGenerator.generateId());
        hiseneseUltra.setName("海信（Hisense）H65E75A 超薄 超高清4K");
        hiseneseUltra.setDescription("海信（Hisense）H65E75A 超薄 超高清4K");
        hiseneseUltra.setRating(3.0F);
        hiseneseUltra.setReview(2200);
        hiseneseUltra.setCreateTime(LocalDateTime.now());
        this.productService.save(hiseneseUltra);
    }


    @Test
    public void addClosthes() {
        ProductModel p1 = new ProductModel();
        BrandModel HLA = this.brandService.findByName("HLA");
        p1.setBrand(HLA);
        CategoryModel MenT = this.categoryService.findByName("男士T恤");
        p1.setCategory(MenT);

        p1.setId(idGenerator.generateId());
        p1.setName("HLA海澜之家短袖T恤男简约镶拼珠地网眼");
        p1.setDescription("HLA海澜之家短袖T恤男简约镶拼珠地网眼");
        p1.setRating(4.5F);
        p1.setReview(1720);
        p1.setCreateTime(LocalDateTime.now());
        this.productService.save(p1);


        ProductModel p2 = new ProductModel();
        p2.setBrand(HLA);
        p2.setCategory(MenT);

        p2.setId(idGenerator.generateId());
        p2.setName("HLA海澜之家短袖T恤男舒适休闲透气");
        p2.setDescription("HLA海澜之家短袖T恤男舒适休闲透气");
        p2.setRating(4.0F);
        p2.setReview(780);
        p2.setCreateTime(LocalDateTime.now());
        this.productService.save(p2);

        ProductModel p3 = new ProductModel();
        p3.setBrand(HLA);
        p3.setCategory(MenT);

        p3.setId(idGenerator.generateId());
        p3.setName("艾以纯森官方旗舰店男装2018新款欧洲站");
        p3.setDescription("艾以纯森官方旗舰店男装2018新款欧洲站");
        p3.setRating(0.0F);
        p3.setReview(0);
        p3.setCreateTime(LocalDateTime.now());
        this.productService.save(p3);


        ProductModel p4 = new ProductModel();
        BrandModel PLAYBOY = this.brandService.findByName("PLAYBOY");
        p4.setBrand(PLAYBOY);
        CategoryModel MenShirt = this.categoryService.findByName("男士衬衫");
        p4.setCategory(MenShirt);

        p4.setId(idGenerator.generateId());
        p4.setName("花花公子短袖衬衫2018新款休闲商务衬衫");
        p4.setDescription("花花公子短袖衬衫2018新款休闲商务衬衫");
        p4.setRating(0.0F);
        p4.setReview(2);
        p4.setCreateTime(LocalDateTime.now());
        this.productService.save(p4);


        ProductModel p5 = new ProductModel();
        p5.setBrand(PLAYBOY);
        p5.setCategory(MenShirt);

        p5.setId(idGenerator.generateId());
        p5.setName("花花公子 PLAYBOY2018夏季新款衬衫男");
        p5.setDescription("花花公子 PLAYBOY2018夏季新款衬衫男");
        p5.setRating(4.0F);
        p5.setReview(120);
        p5.setCreateTime(LocalDateTime.now());
        this.productService.save(p5);

        ProductModel p6 = new ProductModel();
        p6.setBrand(PLAYBOY);
        p6.setCategory(MenShirt);
        p6.setId(idGenerator.generateId());
        p6.setName("花花公子 PLAYBOY2018夏季新款衬衫男");
        p6.setDescription("花花公子 PLAYBOY2018夏季新款衬衫男");
        p6.setRating(3.5F);
        p6.setReview(100);
        p6.setCreateTime(LocalDateTime.now());
        this.productService.save(p6);
    }

    @Test
    public void addProductProperties() {
        ProductModel product = this.productService.find(120089182897968131L);

        AttributeValueModel clothesModelVal = attributeValueService.find(118166595548742659L);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("productId",product.getId());
        map1.put("attributeValueId",clothesModelVal.getId());
        map1.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map1);


        AttributeValueModel collarModelVal = attributeValueService.find(118166595548748803L);

        Map<String,Object> map2 = new HashMap<>();
        map2.put("productId",product.getId());
        map2.put("attributeValueId",collarModelVal.getId());
        map2.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map2);

        AttributeValueModel clothMaterial = attributeValueService.find(118166595548758019L);

        Map<String,Object> map3 = new HashMap<>();
        map3.put("productId",product.getId());
        map3.put("attributeValueId",clothMaterial.getId());
        map3.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map3);

        AttributeValueModel sleeveLength = attributeValueService.find(118166595548753923L);

        Map<String,Object> map4 = new HashMap<>();
        map4.put("productId",product.getId());
        map4.put("attributeValueId",sleeveLength.getId());
        map4.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map4);

        AttributeValueModel suitableSeason = attributeValueService.find(118166813518339075L);
        Map<String,Object> map5 = new HashMap<>();
        map5.put("productId",product.getId());
        map5.put("attributeValueId",suitableSeason.getId());
        map5.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map5);

        AttributeValueModel clothStyle = attributeValueService.find(118166595548762115L);
        Map<String,Object> map6 = new HashMap<>();
        map6.put("productId",product.getId());
        map6.put("attributeValueId",clothStyle.getId());
        map6.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map6);

        AttributeValueModel clothThickness = attributeValueService.find(118166595548770307L);
        Map<String,Object> map7 = new HashMap<>();
        map7.put("productId",product.getId());
        map7.put("attributeValueId",clothThickness.getId());
        map7.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map7);
    }

    @Test
    public void find() {
        ProductModel product = this.productService.find(117504719613593603L);
        CategoryModel category = product.getCategory();
        BrandModel brand = product.getBrand();
        System.out.println(category.getName());
        System.out.println(brand.getChineseName());
        List<AttributeNameModel> attributes = this.categoryService.getCategoryAndAncestorAttributes(category.getId());
        if (CollectionUtils.isNotEmpty(attributes)) {
            for (AttributeNameModel attr : attributes) {
                System.out.println(attr.getName()+"  -> "+attr.isSkuAttribute());
            }
        }

    }
}
