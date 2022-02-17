package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.BrandModel;
import com.coolshop.catalog.model.CategoryModel;
import com.coolshop.catalog.model.ProductModel;
import com.coolshop.catalog.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringCatalogApplication.class})
public class CategoryServiceTest {

    @Autowired
    CategoryService categoryService;

    @Autowired
    IdGenerator idGenerator;
    @Test
    public void save() {
        CategoryModel model = new CategoryModel();
        Long catId = idGenerator.generateId();
        model.setId(catId);
        model.setName("裤子");
        model.setDisplayOrder(5);
        model.setDescription("裤子");
        model.setImagePath("/cat/hero/ trousers.jpg");
        LocalDateTime now = LocalDateTime.now();
        model.setCreateTime(now);
        this.categoryService.save(model);
    }

    @Test
    public void add() {
        CategoryModel model = new CategoryModel();
        Long catId = idGenerator.generateId();
        model.setId(catId);
        model.setName("笔记本");
        model.setDisplayOrder(41);
        model.setDescription("笔记本");
        model.setImagePath("/cat/hero/laptop.jpg");
        LocalDateTime now = LocalDateTime.now();
        model.setCreateTime(now);

        CategoryModel model1 = new CategoryModel();
        Long catId1 = idGenerator.generateId();
        model1.setId(catId1);
        model1.setName("台式机");
        model1.setDisplayOrder(42);
        model1.setDescription("台式机");
        model1.setImagePath("/cat/hero/desktop.jpg");
        LocalDateTime now1 = LocalDateTime.now();
        model1.setCreateTime(now1);


        CategoryModel model2 = new CategoryModel();
        Long catId2 = idGenerator.generateId();
        model2.setId(catId2);
        model2.setName("工作站");
        model2.setDisplayOrder(43);
        model2.setDescription("工作站");
        model2.setImagePath("/cat/hero/workstation.jpg");
        LocalDateTime now2 = LocalDateTime.now();
        model2.setCreateTime(now2);

        CategoryModel parent = this.categoryService.findByName("电脑");
        model.setParent(parent);
        model1.setParent(parent);
        model2.setParent(parent);

        List<CategoryModel> models = new ArrayList<>();
        models.add(model);
        models.add(model1);
        models.add(model2);
        this.categoryService.saveList(models);
    }


    @Test
    public void find() {
        long id = 117421406911727619L;
        CategoryModel model = this.categoryService.findByName("");
        System.out.println("类型=> "+model.getName() +" : "+ model.getParent().getName());
        System.out.println("品牌=> ");
        for (BrandModel brand: model.getBrandList()) {
            System.out.println(brand.getChineseName()+" : "+brand.getEnglishName()+" : "+ brand.getOrigin());
        }
        for (ProductModel product : model.getProductList()) {
            System.out.println(product.getName());
        }
    }

    @Test
    public void update() {
        CategoryModel model = this.categoryService.find(117504719613593603L);
        model.setDisplayOrder(51);
        this.categoryService.update(model);
    }

    @Test
    public void delete() {
        Long id = 118096722873288707L;
        this.categoryService.delete(id);
    }


}
