package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.*;
import com.coolshop.catalog.service.*;
import org.apache.commons.collections.CollectionUtils;
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
public class PantsProductServiceTest {
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
    public void addPants() {
        ProductModel p1 = new ProductModel();
        BrandModel Giordano = this.brandService.findByName("佐丹奴");
        p1.setBrand(Giordano);
        CategoryModel MenPants = this.categoryService.findByName("男士牛仔裤");
        p1.setCategory(MenPants);

        p1.setId(idGenerator.generateId());
        p1.setName("佐丹奴轻薄牛仔裤男 夏季新款精工猫须长");
        p1.setDescription("佐丹奴轻薄牛仔裤男 夏季新款精工猫须长");
        p1.setRating(3.5F);
        p1.setReview(720);
        p1.setCreateTime(LocalDateTime.now());
        this.productService.save(p1);


        ProductModel p2 = new ProductModel();
        p2.setBrand(Giordano);
        p2.setCategory(MenPants);

        p2.setId(idGenerator.generateId());
        p2.setName("佐丹奴Giordano男装 短裤经典五袋修身");
        p2.setDescription("佐丹奴Giordano男装 短裤经典五袋修身");
        p2.setRating(4.0F);
        p2.setReview(780);
        p2.setCreateTime(LocalDateTime.now());
        this.productService.save(p2);

        ProductModel p3 = new ProductModel();
        p3.setBrand(Giordano);
        p3.setCategory(MenPants);

        p3.setId(idGenerator.generateId());
        p3.setName("佐丹奴Giordano男装牛仔裤 男士纯棉猫");
        p3.setDescription("佐丹奴Giordano男装牛仔裤 男士纯棉猫");
        p3.setRating(3.0F);
        p3.setReview(450);
        p3.setCreateTime(LocalDateTime.now());
        this.productService.save(p3);

    }

    @Test
    public void addPantProperties() {
        ProductModel product = this.productService.find(120097919935186947L);

        AttributeValueModel pantsModel = attributeValueService.find(118166852173038595L);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("productId",product.getId());
        map1.put("attributeValueId",pantsModel.getId());
        map1.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map1);


        AttributeValueModel pantsLength = attributeValueService.find(118166853246779395L);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("productId",product.getId());
        map2.put("attributeValueId",pantsLength.getId());
        map2.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map2);

        AttributeValueModel jeanShellFabric = attributeValueService.find(118166853246788611L);
        Map<String,Object> map3 = new HashMap<>();
        map3.put("productId",product.getId());
        map3.put("attributeValueId",jeanShellFabric.getId());
        map3.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map3);

        AttributeValueModel waistModel = attributeValueService.find(118166853246782467L);
        Map<String,Object> map4 = new HashMap<>();
        map4.put("productId",product.getId());
        map4.put("attributeValueId",waistModel.getId());
        map4.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map4);

        AttributeValueModel clothMateria = attributeValueService.find(118166595548758019L);
        Map<String,Object> map5 = new HashMap<>();
        map5.put("productId",product.getId());
        map5.put("attributeValueId",clothMateria.getId());
        map5.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map5);

        AttributeValueModel clothStyle = attributeValueService.find(118166595548767235L);
        Map<String,Object> map6 = new HashMap<>();
        map6.put("productId",product.getId());
        map6.put("attributeValueId",clothStyle.getId());
        map6.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map6);

        AttributeValueModel clothThickness = attributeValueService.find(118166595548769283L);
        Map<String,Object> map7 = new HashMap<>();
        map7.put("productId",product.getId());
        map7.put("attributeValueId",clothThickness.getId());
        map7.put("createTime",LocalDateTime.now());
        this.productService.saveProductAndAttributeValue(map7);
    }

    @Test
    public void find() {
        ProductModel product = this.productService.find(120097919935184899L);
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
