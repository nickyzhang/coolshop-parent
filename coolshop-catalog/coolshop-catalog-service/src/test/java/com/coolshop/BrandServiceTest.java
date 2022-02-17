package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.BrandModel;
import com.coolshop.catalog.model.CategoryModel;
import com.coolshop.catalog.service.BrandService;
import com.coolshop.catalog.service.CategoryService;
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
public class BrandServiceTest {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    IdGenerator idGenerator;
    @Test
    public void save() {
        BrandModel dell = new BrandModel();
        dell.setId(this.idGenerator.generateId());
        dell.setChineseName("IBM");
        dell.setEnglishName("IBM");
        dell.setDescription("IBM");
        dell.setLogo("/brand/IBM.jpg");
        dell.setOrigin("美国");
        dell.setCreateTime(LocalDateTime.now());
        List<String> nicknames = new ArrayList<>();
        nicknames.add("1");nicknames.add("2");nicknames.add("3");
        dell.setNicknames(nicknames);
        this.brandService.save(dell);


        CategoryModel laptop = this.categoryService.findByName("笔记本");
        CategoryModel desktop = this.categoryService.findByName("台式机");
        CategoryModel workstation = this.categoryService.findByName("工作站");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("categoryId",laptop.getId());
        map1.put("brandId",dell.getId());
        map1.put("createTime",LocalDateTime.now());

        Map<String,Object> map2 = new HashMap<>();
        map2.put("categoryId",desktop.getId());
        map2.put("brandId",dell.getId());
        map2.put("createTime",LocalDateTime.now());

        Map<String,Object> map3 = new HashMap<>();
        map3.put("categoryId",workstation.getId());
        map3.put("brandId",dell.getId());
        map3.put("createTime",LocalDateTime.now());
        this.brandService.saveBrandAndCategory(map1);
        this.brandService.saveBrandAndCategory(map2);
        this.brandService.saveBrandAndCategory(map3);
    }

    @Test
    public void saveBatch() {
        BrandModel ASUS = new BrandModel();
        ASUS.setId(this.idGenerator.generateId());
        ASUS.setChineseName("华硕");
        ASUS.setEnglishName("ASUS");
        ASUS.setDescription("华硕");
        ASUS.setLogo("/brand/asus.jpg");
        ASUS.setOrigin("台湾");
        ASUS.setCreateTime(LocalDateTime.now());
        this.brandService.save(ASUS);

        CategoryModel laptop = this.categoryService.findByName("笔记本");
//        CategoryModel desktop = this.categoryService.findByName("台式机");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("categoryId",laptop.getId());
        map1.put("brandId",ASUS.getId());
        map1.put("createTime",LocalDateTime.now());
//
//        Map<String,Object> map2 = new HashMap<>();
//        map2.put("categoryId",desktop.getId());
//        map2.put("brandId",lenovo.getId());
//        map2.put("createTime",LocalDateTime.now());

        this.brandService.saveBrandAndCategory(map1);
//        this.brandService.saveBrandAndCategory(map2);
    }

    @Test
    public void saveRelativeOnly() {
//        // 家电-电视
//        // 电视-曲面电视
//        BrandModel mi = this.brandService.findByName("小米");
//        BrandModel hisense = this.brandService.findByName("海信");
//        CategoryModel qumian = this.categoryService.findByName("曲面电视");
//        this
//        this.brandService.saveRelativeOnly(mi,qumian);
//        this.brandService.saveRelativeOnly(hisense,qumian);
//
//        // 电视-超薄电视
//        BrandModel changhong = this.brandService.findByName("长虹");
//        CategoryModel chaobo = this.categoryService.findByName("超薄电视");
//        this.brandService.saveRelativeOnly(changhong,chaobo);
//        this.brandService.saveRelativeOnly(hisense,chaobo);
//
//        // 电视-HDR电视
//        BrandModel philips = this.brandService.findByName("飞利浦");
//        CategoryModel hdr = this.categoryService.findByName("HDR电视");
//        this.brandService.saveRelativeOnly(philips,hdr);
//        this.brandService.saveRelativeOnly(changhong,hdr);
//
//        // 家电-空调
//        // 空调-中央空调
//        BrandModel gree = this.brandService.findByName("格力");
//        CategoryModel central = this.categoryService.findByName("中央空调");
//        this.brandService.saveRelativeOnly(gree,central);
//
//        // 空调-挂壁式空调
//        BrandModel haier = this.brandService.findByName("海尔");
//        CategoryModel wall = this.categoryService.findByName("挂壁式空调");
//        this.brandService.saveRelativeOnly(haier,wall);
//
//        // 空调-柜式空调
//        BrandModel panasonic = this.brandService.findByName("松下");
//        CategoryModel packaged = this.categoryService.findByName("柜式空调");
//        this.brandService.saveRelativeOnly(panasonic,packaged);
//
//        // 家电-洗衣机
//        // 洗衣机-滚筒洗衣机
//        BrandModel siemens = this.brandService.findByName("西门子");
//        CategoryModel roller = this.categoryService.findByName("滚筒洗衣机");
//        this.brandService.saveRelativeOnly(siemens,roller);
//
//        // 洗衣机-Mini洗衣机
//        CategoryModel mini = this.categoryService.findByName("Mini洗衣机");
//        this.brandService.saveRelativeOnly(haier,mini);
//
//        // 洗衣机-波轮洗衣机
//        BrandModel midea = this.brandService.findByName("美的");
//        CategoryModel pulsator = this.categoryService.findByName("波轮洗衣机");
//        this.brandService.saveRelativeOnly(midea,pulsator);
//
//
//        // 家电-冰箱
//        // 冰箱-多门冰箱
//
//        CategoryModel multiDoor = this.categoryService.findByName("多门冰箱");
//        this.brandService.saveRelativeOnly(haier,multiDoor);
//
//        // 冰箱-双门冰箱
//        CategoryModel doubleDoor = this.categoryService.findByName("双门冰箱");
//        this.brandService.saveRelativeOnly(siemens,doubleDoor);
//
//        // 冰箱-智能冰箱
//        CategoryModel zhineng = this.categoryService.findByName("智能冰箱");
//        this.brandService.saveRelativeOnly(midea,zhineng);
//
//        // 手机-普通手机
//        BrandModel huawei = this.brandService.findByName("华为");
//        CategoryModel normal = this.categoryService.findByName("普通手机");
//        this.brandService.saveRelativeOnly(huawei,normal);
//
//        // 手机-游戏手机
//        BrandModel apple = this.brandService.findByName("苹果");
//        CategoryModel game = this.categoryService.findByName("游戏手机");
//        this.brandService.saveRelativeOnly(apple,game);
//
//        // 手机-老人手机
//        BrandModel samsung = this.brandService.findByName("三星");
//        CategoryModel oldman = this.categoryService.findByName("老年手机");
//        this.brandService.saveRelativeOnly(samsung,oldman);
//
//        // 男装-男士T恤
//        BrandModel hla = this.brandService.findByName("HLA");
//        CategoryModel TShirt = this.categoryService.findByName("男士T恤");
//        this.brandService.saveRelativeOnly(hla,TShirt);
//
//        // 男装-男士衬衫
//        BrandModel playboy = this.brandService.findByName("花花公子");
//        CategoryModel shirt = this.categoryService.findByName("男士衬衫");
//        this.brandService.saveRelativeOnly(playboy,shirt);
//
//        // 男装-男士牛仔裤
//        BrandModel giordano = this.brandService.findByName("佐丹奴");
//        CategoryModel jeans = this.categoryService.findByName("男士牛仔裤");
//        this.brandService.saveRelativeOnly(giordano,jeans);

    }


    @Test
    public void find(){
        BrandModel hisense = this.brandService.findByName("海信");
        List<CategoryModel> cats = hisense.getCategoryList();
        System.out.println(hisense.getChineseName()+"---->");
        for (CategoryModel cat : cats) {
            System.out.println(cat.getName());
        }
    }
}
