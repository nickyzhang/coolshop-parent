package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.CategoryModel;
import com.coolshop.catalog.service.AttributeNameService;
import com.coolshop.catalog.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
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
public class AttributeNameServiceTest {

    @Autowired
    AttributeNameService attributeNameService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    IdGenerator idGenerator;

    /**
     * 属性的类型,是关键属性(0)，销售属性(1)，商品属性(2)还是非关键属性(3)
     * 输入类型(单选(1)，多选(2)还是文本输入(0)
     * 可读写(0),只读(1),只写(2)
     */
    @Test
    public void save(){
        AttributeNameModel launchDate = new AttributeNameModel();
        launchDate.setId(this.idGenerator.generateId());
        launchDate.setName("上市时间");
        launchDate.setType(3);
        launchDate.setFieldName("launch_date");
        launchDate.setFieldType("java.time.LocalDate");
        launchDate.setInputType(0);
        launchDate.setRequired(Boolean.FALSE);
        launchDate.setGroup("基本属性");
        launchDate.setSkuAttribute(Boolean.FALSE);
        launchDate.setCreateTime(LocalDateTime.now());

        AttributeNameModel resolution = new AttributeNameModel();
        resolution.setId(this.idGenerator.generateId());
        resolution.setName("分辨率");
        resolution.setType(3);
        resolution.setFieldName("resolution");
        resolution.setFieldType("java.lang.String");
        resolution.setInputType(1);
        resolution.setRequired(Boolean.TRUE);
        resolution.setGroup("基本属性");
        resolution.setSkuAttribute(Boolean.FALSE);
        resolution.setCreateTime(LocalDateTime.now());

        AttributeNameModel weight = new AttributeNameModel();
        weight.setId(this.idGenerator.generateId());
        weight.setName("重量");
        weight.setType(3);
        weight.setFieldName("weight");
        weight.setFieldType("java.lang.Float");
        weight.setInputType(0);
        weight.setRequired(Boolean.FALSE);
        weight.setGroup("基本属性");
        weight.setSkuAttribute(Boolean.FALSE);
        weight.setCreateTime(LocalDateTime.now());

        AttributeNameModel screenSize = new AttributeNameModel();
        screenSize.setId(this.idGenerator.generateId());
        screenSize.setName("屏幕尺寸");
        screenSize.setType(1);
        screenSize.setFieldName("screen_size");
        screenSize.setFieldType("java.lang.Integer");
        screenSize.setInputType(0);
        screenSize.setRequired(Boolean.TRUE);
        screenSize.setGroup("销售属性");
        screenSize.setSkuAttribute(Boolean.TRUE);
        screenSize.setCreateTime(LocalDateTime.now());

        AttributeNameModel packageLength = new AttributeNameModel();
        packageLength.setId(this.idGenerator.generateId());
        packageLength.setName("包装尺寸(长)");
        packageLength.setType(3);
        packageLength.setFieldName("package_size");
        packageLength.setFieldType("java.lang.Integer");
        packageLength.setInputType(0);
        packageLength.setRequired(Boolean.FALSE);
        packageLength.setGroup("基本属性");
        packageLength.setSkuAttribute(Boolean.FALSE);
        packageLength.setCreateTime(LocalDateTime.now());
        AttributeNameModel packageWidth= new AttributeNameModel();
        packageWidth.setId(this.idGenerator.generateId());
        packageWidth.setName("包装尺寸(宽)");
        packageWidth.setType(3);
        packageWidth.setFieldName("package_width");
        packageWidth.setFieldType("java.lang.Integer");
        packageWidth.setInputType(0);
        packageWidth.setRequired(Boolean.FALSE);
        packageWidth.setGroup("基本属性");
        packageWidth.setSkuAttribute(Boolean.FALSE);
        packageWidth.setCreateTime(LocalDateTime.now());
        AttributeNameModel packageHeight = new AttributeNameModel();
        packageHeight.setId(this.idGenerator.generateId());
        packageHeight.setName("包装尺寸(高)");
        packageHeight.setType(3);
        packageHeight.setFieldName("package_height");
        packageHeight.setFieldType("java.lang.Integer");
        packageHeight.setInputType(0);
        packageHeight.setRequired(Boolean.FALSE);
        packageHeight.setGroup("基本属性");
        packageHeight.setSkuAttribute(Boolean.FALSE);
        packageHeight.setCreateTime(LocalDateTime.now());

        this.attributeNameService.save(launchDate);
        this.attributeNameService.save(resolution);
        this.attributeNameService.save(weight);
        this.attributeNameService.save(screenSize);
        this.attributeNameService.save(packageLength);
        this.attributeNameService.save(packageWidth);
        this.attributeNameService.save(packageHeight);

        CategoryModel appliance = this.categoryService.findByName("家用电器");
        List<AttributeNameModel> oneLevelproperties = new ArrayList<>();
        oneLevelproperties.add(launchDate);
        oneLevelproperties.add(weight);
        oneLevelproperties.add(packageLength);
        oneLevelproperties.add(packageWidth);
        oneLevelproperties.add(packageHeight);
        for (AttributeNameModel property:oneLevelproperties) {
            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",appliance.getId());
            map.put("attributeNameId",property.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }

        CategoryModel tv = this.categoryService.findByName("家用电器");
        List<AttributeNameModel> twoLevelproperties = new ArrayList<>();
        twoLevelproperties.add(resolution);
        twoLevelproperties.add(screenSize);

        for (AttributeNameModel property:twoLevelproperties) {
            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",tv.getId());
            map.put("attributeNameId",property.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }
//        CategoryModel curved = this.categoryService.findByName("曲面电视");
//        CategoryModel curved = this.categoryService.findByName("曲面电视");
//        CategoryModel ultrathin = this.categoryService.findByName("超薄电视");
//        CategoryModel hdr = this.categoryService.findByName("HDR电视");

//        List<AttributeNameModel> oneLevelproperties = new ArrayList<>();
//        oneLevelproperties.add(launchDate);
//        oneLevelproperties.add(resolution);
//        oneLevelproperties.add(weight);
//        oneLevelproperties.add(screenSize);
//        List<CategoryModel> categories = new ArrayList<>();
//        categories.add(curved);
//        categories.add(ultrathin);
//        categories.add(hdr);



    }

    @Test
    public void addAirCondition() {
        AttributeNameModel roomNoise = new AttributeNameModel();
        roomNoise.setId(this.idGenerator.generateId());
        roomNoise.setName("室内噪音");
        roomNoise.setType(3);
        roomNoise.setFieldName("room_noise");
        roomNoise.setFieldType("java.lang.Integer");
        roomNoise.setInputType(0);
        roomNoise.setRequired(Boolean.FALSE);
        roomNoise.setGroup("基本属性");
        roomNoise.setSkuAttribute(Boolean.TRUE);
        roomNoise.setCreateTime(LocalDateTime.now());

        AttributeNameModel outdoorNoise = new AttributeNameModel();
        outdoorNoise.setId(this.idGenerator.generateId());
        outdoorNoise.setName("室外噪音");
        outdoorNoise.setType(3);
        outdoorNoise.setFieldName("outdoor_noise");
        outdoorNoise.setFieldType("java.lang.Integer");
        outdoorNoise.setInputType(0);
        outdoorNoise.setRequired(Boolean.FALSE);
        outdoorNoise.setGroup("基本属性");
        outdoorNoise.setSkuAttribute(Boolean.FALSE);
        outdoorNoise.setCreateTime(LocalDateTime.now());

        AttributeNameModel coolHeatType = new AttributeNameModel();
        coolHeatType.setId(this.idGenerator.generateId());
        coolHeatType.setName("冷暖类型");
        coolHeatType.setType(3);
        coolHeatType.setFieldName("coolling_heating_type");
        coolHeatType.setFieldType("java.lang.String");
        coolHeatType.setInputType(1);
        coolHeatType.setRequired(Boolean.FALSE);
        coolHeatType.setGroup("基本属性");
        coolHeatType.setSkuAttribute(Boolean.FALSE);
        coolHeatType.setCreateTime(LocalDateTime.now());

        AttributeNameModel workModel = new AttributeNameModel();
        workModel.setId(this.idGenerator.generateId());
        workModel.setName("工作模式");
        workModel.setType(3);
        workModel.setFieldName("work_model");
        workModel.setFieldType("java.lang.String");
        workModel.setInputType(1);
        workModel.setRequired(Boolean.FALSE);
        workModel.setGroup("基本属性");
        workModel.setSkuAttribute(Boolean.FALSE);
        workModel.setCreateTime(LocalDateTime.now());

        AttributeNameModel power = new AttributeNameModel();
        power.setId(this.idGenerator.generateId());
        power.setName("空调功率");
        power.setType(1);
        power.setFieldName("power");
        power.setFieldType("java.lang.String");
        power.setInputType(1);
        power.setRequired(Boolean.TRUE);
        power.setGroup("销售属性");
        power.setSkuAttribute(Boolean.TRUE);
        power.setCreateTime(LocalDateTime.now());

        this.attributeNameService.save(roomNoise);
        this.attributeNameService.save(outdoorNoise);
        this.attributeNameService.save(coolHeatType);
        this.attributeNameService.save(workModel);
        this.attributeNameService.save(power);

        CategoryModel airCondition = this.categoryService.findByName("空调");
        List<AttributeNameModel> properties = new ArrayList<>();
        properties.add(roomNoise);
        properties.add(outdoorNoise);
        properties.add(coolHeatType);
        properties.add(workModel);
        properties.add(power);
        for (AttributeNameModel property : properties) {
            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",airCondition.getId());
            map.put("attributeNameId",property.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }
    }


    @Test
    public void saveRefrigerator() {
        AttributeNameModel volume = new AttributeNameModel();
        volume.setId(this.idGenerator.generateId());
        volume.setName("冰箱容量");
        volume.setType(3);
        volume.setFieldName("refrigerator_volume");
        volume.setFieldType("java.lang.Integer");
        volume.setInputType(0);
        volume.setRequired(Boolean.FALSE);
        volume.setGroup("基本属性");
        volume.setSkuAttribute(Boolean.FALSE);
        volume.setCreateTime(LocalDateTime.now());

        AttributeNameModel volumeRange = new AttributeNameModel();
        volumeRange.setId(this.idGenerator.generateId());
        volumeRange.setName("冰箱容量范围");
        volumeRange.setType(3);
        volumeRange.setFieldName("refrigerator_volume_range");
        volumeRange.setFieldType("java.lang.Integer");
        volumeRange.setInputType(1);
        volumeRange.setRequired(Boolean.FALSE);
        volumeRange.setGroup("基本属性");
        volumeRange.setSkuAttribute(Boolean.FALSE);
        volumeRange.setCreateTime(LocalDateTime.now());

        AttributeNameModel coolingModel = new AttributeNameModel();
        coolingModel.setId(this.idGenerator.generateId());
        coolingModel.setName("制冷方式");
        coolingModel.setType(3);
        coolingModel.setFieldName("cooling_mode");
        coolingModel.setFieldType("java.lang.String");
        coolingModel.setInputType(1);
        coolingModel.setRequired(Boolean.FALSE);
        coolingModel.setGroup("基本属性");
        coolingModel.setSkuAttribute(Boolean.FALSE);
        coolingModel.setCreateTime(LocalDateTime.now());

        AttributeNameModel temperatureControlMode = new AttributeNameModel();
        temperatureControlMode.setId(this.idGenerator.generateId());
        temperatureControlMode.setName("控温方式");
        temperatureControlMode.setType(3);
        temperatureControlMode.setFieldName("temperature_control_mode");
        temperatureControlMode.setFieldType("java.lang.String");
        temperatureControlMode.setInputType(1);
        temperatureControlMode.setRequired(Boolean.FALSE);
        temperatureControlMode.setGroup("基本属性");
        temperatureControlMode.setSkuAttribute(Boolean.FALSE);
        temperatureControlMode.setCreateTime(LocalDateTime.now());

        AttributeNameModel doorStyle = new AttributeNameModel();
        doorStyle.setId(this.idGenerator.generateId());
        doorStyle.setName("箱门结构");
        doorStyle.setType(3);
        doorStyle.setFieldName("door_style");
        doorStyle.setFieldType("java.lang.String");
        doorStyle.setInputType(1);
        doorStyle.setRequired(Boolean.FALSE);
        doorStyle.setGroup("基本属性");
        doorStyle.setSkuAttribute(Boolean.FALSE);
        doorStyle.setCreateTime(LocalDateTime.now());

        AttributeNameModel panelType  = new AttributeNameModel();
        panelType.setId(this.idGenerator.generateId());
        panelType.setName("面板类型");
        panelType.setType(3);
        panelType.setFieldName("panel_type");
        panelType.setFieldType("java.lang.String");
        panelType.setInputType(1);
        panelType.setRequired(Boolean.FALSE);
        panelType.setGroup("基本属性");
        panelType.setSkuAttribute(Boolean.FALSE);
        panelType.setCreateTime(LocalDateTime.now());

        AttributeNameModel energyEfficiencyLevel  = new AttributeNameModel();
        energyEfficiencyLevel.setId(this.idGenerator.generateId());
        energyEfficiencyLevel.setName("能效等级");
        energyEfficiencyLevel.setType(3);
        energyEfficiencyLevel.setFieldName("energy_efficiency_level");
        energyEfficiencyLevel.setFieldType("java.lang.String");
        energyEfficiencyLevel.setInputType(1);
        energyEfficiencyLevel.setRequired(Boolean.FALSE);
        energyEfficiencyLevel.setGroup("基本属性");
        energyEfficiencyLevel.setSkuAttribute(Boolean.FALSE);
        energyEfficiencyLevel.setCreateTime(LocalDateTime.now());

        AttributeNameModel coolingSystem  = new AttributeNameModel();
        coolingSystem.setId(this.idGenerator.generateId());
        coolingSystem.setName("制冷控制系统");
        coolingSystem.setType(3);
        coolingSystem.setFieldName("cooling_control_system");
        coolingSystem.setFieldType("java.lang.String");
        coolingSystem.setInputType(1);
        coolingSystem.setRequired(Boolean.FALSE);
        coolingSystem.setGroup("基本属性");
        coolingSystem.setSkuAttribute(Boolean.FALSE);
        coolingSystem.setCreateTime(LocalDateTime.now());


        AttributeNameModel color  = new AttributeNameModel();
        color.setId(this.idGenerator.generateId());
        color.setName("颜色");
        color.setType(1);
        color.setFieldName("color");
        color.setFieldType("java.lang.String");
        color.setInputType(1);
        color.setRequired(Boolean.TRUE);
        color.setGroup("销售属性");
        color.setSkuAttribute(Boolean.FALSE);
        color.setCreateTime(LocalDateTime.now());

        List<AttributeNameModel> properties = new ArrayList<>();
        properties.add(color);


        CategoryModel refrigerator = this.categoryService.findByName("冰箱");
        for (AttributeNameModel p : properties) {
            this.attributeNameService.save(p);
            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",refrigerator.getId());
            map.put("attributeNameId",p.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }
    }


    @Test
    public void saveWasher() {
        CategoryModel washer = this.categoryService.findByName("洗衣机");
        AttributeNameModel color = this.attributeNameService.find(118160249734569987L);
        Map<String,Object> map = new HashMap<>();
        map.put("categoryId",washer.getId());
        map.put("attributeNameId",color.getId());
        map.put("createTime",LocalDateTime.now());
        this.attributeNameService.saveAttributeNameAndCategory(map);
    }

    @Test
    public void saveMobile() {
        AttributeNameModel  cpuType = new AttributeNameModel();
        cpuType.setId(this.idGenerator.generateId());
        cpuType.setName("CPU 类型");
        cpuType.setType(3);
        cpuType.setFieldName("cpu_type");
        cpuType.setFieldType("java.lang.String");
        cpuType.setInputType(1);
        cpuType.setRequired(Boolean.FALSE);
        cpuType.setGroup("基本属性");
        cpuType.setSkuAttribute(Boolean.FALSE);
        cpuType.setCreateTime(LocalDateTime.now());

        AttributeNameModel mobileScreenSize = new AttributeNameModel();
        mobileScreenSize.setId(this.idGenerator.generateId());
        mobileScreenSize.setName("手机屏幕尺寸");
        mobileScreenSize.setType(3);
        mobileScreenSize.setFieldName("mobile_screen_size");
        mobileScreenSize.setFieldType("java.lang.String");
        mobileScreenSize.setInputType(1);
        mobileScreenSize.setRequired(Boolean.FALSE);
        mobileScreenSize.setGroup("基本属性");
        mobileScreenSize.setSkuAttribute(Boolean.FALSE);
        mobileScreenSize.setCreateTime(LocalDateTime.now());

        AttributeNameModel  mobileThickness = new AttributeNameModel();
        mobileThickness.setId(this.idGenerator.generateId());
        mobileThickness.setName("机身厚度");
        mobileThickness.setType(3);
        mobileThickness.setFieldName("mobile_thickness");
        mobileThickness.setFieldType("java.lang.String");
        mobileThickness.setInputType(0);
        mobileThickness.setRequired(Boolean.FALSE);
        mobileThickness.setGroup("基本属性");
        mobileThickness.setSkuAttribute(Boolean.FALSE);
        mobileThickness.setCreateTime(LocalDateTime.now());

        AttributeNameModel mobile_style = new AttributeNameModel();
        mobile_style.setId(this.idGenerator.generateId());
        mobile_style.setName("手机款式");
        mobile_style.setType(3);
        mobile_style.setFieldName("mobile_style");
        mobile_style.setFieldType("java.lang.String");
        mobile_style.setInputType(1);
        mobile_style.setRequired(Boolean.FALSE);
        mobile_style.setGroup("基本属性");
        mobile_style.setSkuAttribute(Boolean.FALSE);
        mobile_style.setCreateTime(LocalDateTime.now());


        AttributeNameModel  rearcamera = new AttributeNameModel();
        rearcamera.setId(this.idGenerator.generateId());
        rearcamera.setName("后置摄像头像素");
        rearcamera.setType(3);
        rearcamera.setFieldName("rear_camera");
        rearcamera.setFieldType("java.lang.String");
        rearcamera.setInputType(1);
        rearcamera.setRequired(Boolean.FALSE);
        rearcamera.setGroup("基本属性");
        rearcamera.setSkuAttribute(Boolean.FALSE);
        rearcamera.setCreateTime(LocalDateTime.now());

        AttributeNameModel  afterService = new AttributeNameModel();
        afterService.setId(this.idGenerator.generateId());
        afterService.setName("售后服务");
        afterService.setType(3);
        afterService.setFieldName("after_service");
        afterService.setFieldType("java.lang.String");
        afterService.setInputType(1);
        afterService.setRequired(Boolean.FALSE);
        afterService.setGroup("基本属性");
        afterService.setSkuAttribute(Boolean.FALSE);
        afterService.setCreateTime(LocalDateTime.now());

        AttributeNameModel storeVolume = new AttributeNameModel();
        storeVolume.setId(this.idGenerator.generateId());
        storeVolume.setName("存储容量");
        storeVolume.setType(1);
        storeVolume.setFieldName("store_volume");
        storeVolume.setFieldType("java.lang.String");
        storeVolume.setInputType(1);
        storeVolume.setRequired(Boolean.TRUE);
        storeVolume.setGroup("销售属性");
        storeVolume.setSkuAttribute(Boolean.TRUE);
        storeVolume.setCreateTime(LocalDateTime.now());

        AttributeNameModel versionType = new AttributeNameModel();
        versionType.setId(this.idGenerator.generateId());
        versionType.setName("版本类型");
        versionType.setType(1);
        versionType.setFieldName("version_type");
        versionType.setFieldType("java.lang.String");
        versionType.setInputType(1);
        versionType.setRequired(Boolean.TRUE);
        versionType.setGroup("销售属性");
        versionType.setSkuAttribute(Boolean.TRUE);
        versionType.setCreateTime(LocalDateTime.now());

        AttributeNameModel  resolution = this.attributeNameService.find(118138914484519939L);
        AttributeNameModel color = this.attributeNameService.find(118160249734569987L);

        List<AttributeNameModel> properties = new ArrayList<>();
        properties.add(cpuType);
        properties.add(afterService);
        properties.add(mobile_style);
        properties.add(resolution);
        properties.add(mobileScreenSize);
        properties.add(mobileThickness);
        properties.add(rearcamera);
        properties.add(storeVolume);
        properties.add(versionType);
        properties.add(color);

        CategoryModel mobile = this.categoryService.findByName("手机");
        for (AttributeNameModel p : properties) {
            if (this.attributeNameService.find(p.getId()) == null) {
                this.attributeNameService.save(p);
            }

            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",mobile.getId());
            map.put("attributeNameId",p.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }
    }

    @Test
    public void addClothes() {
        AttributeNameModel clothesModel  = new AttributeNameModel();
        clothesModel.setId(this.idGenerator.generateId());
        clothesModel.setName("衣服版型");
        clothesModel.setType(3);
        clothesModel.setFieldName("clothes_model");
        clothesModel.setFieldType("java.lang.String");
        clothesModel.setInputType(1);
        clothesModel.setRequired(Boolean.TRUE);
        clothesModel.setGroup("基本属性");
        clothesModel.setSkuAttribute(Boolean.FALSE);
        clothesModel.setCreateTime(LocalDateTime.now());

        AttributeNameModel collarModel = new AttributeNameModel();
        collarModel.setId(this.idGenerator.generateId());
        collarModel.setName("领型");
        collarModel.setType(3);
        collarModel.setFieldName("collar_model");
        collarModel.setFieldType("java.lang.String");
        collarModel.setInputType(1);
        collarModel.setRequired(Boolean.TRUE);
        collarModel.setGroup("基本属性");
        collarModel.setSkuAttribute(Boolean.FALSE);
        collarModel.setCreateTime(LocalDateTime.now());


        AttributeNameModel sleeveLength = new AttributeNameModel();
        sleeveLength.setId(this.idGenerator.generateId());
        sleeveLength.setName("袖长");
        sleeveLength.setType(3);
        sleeveLength.setFieldName("sleeve_length");
        sleeveLength.setFieldType("java.lang.String");
        sleeveLength.setInputType(1);
        sleeveLength.setRequired(Boolean.TRUE);
        sleeveLength.setGroup("基本属性");
        sleeveLength.setSkuAttribute(Boolean.FALSE);
        sleeveLength.setCreateTime(LocalDateTime.now());

        AttributeNameModel materials = new AttributeNameModel();
        materials.setId(this.idGenerator.generateId());
        materials.setName("服装材质");
        materials.setType(3);
        materials.setFieldName("cloth_material");
        materials.setFieldType("java.lang.String");
        materials.setInputType(1);
        materials.setRequired(Boolean.TRUE);
        materials.setGroup("基本属性");
        materials.setSkuAttribute(Boolean.FALSE);
        materials.setCreateTime(LocalDateTime.now());

        AttributeNameModel style = new AttributeNameModel();
        style.setId(this.idGenerator.generateId());
        style.setName("服装风格");
        style.setType(3);
        style.setFieldName("cloth_style");
        style.setFieldType("java.lang.String");
        style.setInputType(1);
        style.setRequired(Boolean.TRUE);
        style.setGroup("基本属性");
        style.setSkuAttribute(Boolean.FALSE);
        style.setCreateTime(LocalDateTime.now());

        AttributeNameModel thickness  = new AttributeNameModel();
        thickness.setId(this.idGenerator.generateId());
        thickness.setName("服装厚度");
        thickness.setType(3);
        thickness.setFieldName("cloth_thickness");
        thickness.setFieldType("java.lang.String");
        thickness.setInputType(1);
        thickness.setRequired(Boolean.TRUE);
        thickness.setGroup("基本属性");
        thickness.setSkuAttribute(Boolean.FALSE);
        thickness.setCreateTime(LocalDateTime.now());

        AttributeNameModel shellFabric  = new AttributeNameModel();
        shellFabric.setId(this.idGenerator.generateId());
        shellFabric.setName("面料");
        shellFabric.setType(3);
        shellFabric.setFieldName("shell_fabric");
        shellFabric.setFieldType("java.lang.String");
        shellFabric.setInputType(1);
        shellFabric.setRequired(Boolean.TRUE);
        shellFabric.setGroup("基本属性");
        shellFabric.setSkuAttribute(Boolean.FALSE);
        shellFabric.setCreateTime(LocalDateTime.now());

        AttributeNameModel suitableSeason  = new AttributeNameModel();
        suitableSeason.setId(this.idGenerator.generateId());
        suitableSeason.setName("适合季节");
        suitableSeason.setType(3);
        suitableSeason.setFieldName("suitable_season");
        suitableSeason.setFieldType("java.lang.String");
        suitableSeason.setInputType(1);
        suitableSeason.setRequired(Boolean.FALSE);
        suitableSeason.setGroup("基本属性");
        suitableSeason.setSkuAttribute(Boolean.FALSE);
        suitableSeason.setCreateTime(LocalDateTime.now());

        AttributeNameModel size  = new AttributeNameModel();
        size.setId(this.idGenerator.generateId());
        size.setName("尺寸");
        size.setType(1);
        size.setFieldName("cloth_size");
        size.setFieldType("java.lang.String");
        size.setInputType(1);
        size.setRequired(Boolean.TRUE);
        size.setGroup("销售属性");
        size.setSkuAttribute(Boolean.TRUE);
        size.setCreateTime(LocalDateTime.now());

        AttributeNameModel color = this.attributeNameService.find(118160249734569987L);

        List<AttributeNameModel> properties = new ArrayList<>();
        properties.add(clothesModel);
        properties.add(collarModel);
        properties.add(color);
        properties.add(materials);
        properties.add(shellFabric);
        properties.add(size);
        properties.add(sleeveLength);
        properties.add(suitableSeason);
        properties.add(style);
        properties.add(thickness);

        CategoryModel clothes = this.categoryService.findByName("衣服");
        for (AttributeNameModel p : properties) {
            if (this.attributeNameService.find(p.getId()) == null) {
                this.attributeNameService.save(p);
            }

            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",clothes.getId());
            map.put("attributeNameId",p.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }
    }

    @Test
    public void addPants() {
//        AttributeNameModel pantsModel  = new AttributeNameModel();
//        pantsModel.setId(this.idGenerator.generateId());
//        pantsModel.setName("裤子版型");
//        pantsModel.setType(3);
//        pantsModel.setFieldName("pants_model");
//        pantsModel.setFieldType("java.lang.String");
//        pantsModel.setInputType(1);
//        pantsModel.setRequired(Boolean.FALSE);
//        pantsModel.setGroup("基本属性");
//        pantsModel.setSkuAttribute(Boolean.FALSE);
//        pantsModel.setCreateTime(LocalDateTime.now());
//
//        AttributeNameModel pantsLength  = new AttributeNameModel();
//        pantsLength.setId(this.idGenerator.generateId());
//        pantsLength.setName("裤长");
//        pantsLength.setType(3);
//        pantsLength.setFieldName("pants_length");
//        pantsLength.setFieldType("java.lang.String");
//        pantsLength.setInputType(1);
//        pantsLength.setRequired(Boolean.FALSE);
//        pantsLength.setGroup("基本属性");
//        pantsLength.setSkuAttribute(Boolean.FALSE);
//        pantsLength.setCreateTime(LocalDateTime.now());
//
//
//        AttributeNameModel waistModel  = new AttributeNameModel();
//        waistModel.setId(this.idGenerator.generateId());
//        waistModel.setName("腰型");
//        waistModel.setType(3);
//        waistModel.setFieldName("waist_model");
//        waistModel.setFieldType("java.lang.String");
//        waistModel.setInputType(1);
//        waistModel.setRequired(Boolean.FALSE);
//        waistModel.setGroup("基本属性");
//        waistModel.setSkuAttribute(Boolean.FALSE);
//        waistModel.setCreateTime(LocalDateTime.now());

//        AttributeNameModel jeansShellFabric  = new AttributeNameModel();
//        jeansShellFabric.setId(this.idGenerator.generateId());
//        jeansShellFabric.setName("牛仔面料");
//        jeansShellFabric.setType(3);
//        jeansShellFabric.setFieldName("jean_shell_fabric");
//        jeansShellFabric.setFieldType("java.lang.String");
//        jeansShellFabric.setInputType(1);
//        jeansShellFabric.setRequired(Boolean.FALSE);
//        jeansShellFabric.setGroup("基本属性");
//        jeansShellFabric.setSkuAttribute(Boolean.FALSE);
//        jeansShellFabric.setCreateTime(LocalDateTime.now());


//        AttributeNameModel material = this.attributeNameService.find(118161488832629763L);
//        AttributeNameModel style = this.attributeNameService.find(118161488832629763L);
//        AttributeNameModel thickness = this.attributeNameService.find(118161488832629763L);
//        AttributeNameModel color = this.attributeNameService.find(118160249734569987L);
//        AttributeNameModel size = this.attributeNameService.find(118161488832634883L);
//
//        List<AttributeNameModel> properties = new ArrayList<>();
//        properties.add(pantsModel);
//        properties.add(pantsLength);
//        properties.add(jeansShellFabric);
//        properties.add(waistModel);
//        properties.add(material);
//        properties.add(style);
//        properties.add(thickness);
//        properties.add(color);
//        properties.add(size);
        AttributeNameModel pantsSize  = new AttributeNameModel();
        pantsSize.setId(this.idGenerator.generateId());
        pantsSize.setName("裤子尺码");
        pantsSize.setType(3);
        pantsSize.setFieldName("pant_size");
        pantsSize.setFieldType("java.lang.Integer");
        pantsSize.setInputType(1);
        pantsSize.setRequired(Boolean.TRUE);
        pantsSize.setGroup("基本属性");
        pantsSize.setSkuAttribute(Boolean.TRUE);
        pantsSize.setCreateTime(LocalDateTime.now());
        List<AttributeNameModel> properties = new ArrayList<>();
        properties.add(pantsSize);
        CategoryModel pants = this.categoryService.findByName("裤子");
        for (AttributeNameModel p : properties) {
            if (this.attributeNameService.find(p.getId()) == null) {
                this.attributeNameService.save(p);
            }

            Map<String,Object> map = new HashMap<>();
            map.put("categoryId",pants.getId());
            map.put("attributeNameId",p.getId());
            map.put("createTime",LocalDateTime.now());
            this.attributeNameService.saveAttributeNameAndCategory(map);
        }
    }
}
