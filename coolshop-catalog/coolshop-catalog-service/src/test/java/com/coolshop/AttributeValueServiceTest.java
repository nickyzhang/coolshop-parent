package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.service.AttributeNameService;
import com.coolshop.catalog.service.AttributeValueService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringCatalogApplication.class})
public class AttributeValueServiceTest {

    @Autowired
    IdGenerator idGenerator;

    @Autowired
    AttributeValueService attributeValueService;

    @Autowired
    AttributeNameService attributeNameService;
    @Test
    public void saveJiaDian() {
        AttributeValueModel launchVal = new AttributeValueModel();
        launchVal.setId(this.idGenerator.generateId());
        launchVal.setValue("2017-08-12");
        launchVal.setCreateTime(LocalDateTime.now());
        AttributeNameModel launchDate = this.attributeNameService.find(118138914484518915L);
        launchVal.setName(launchDate);
        this.attributeValueService.save(launchVal);

        AttributeValueModel weightVal = new AttributeValueModel();
        weightVal.setId(this.idGenerator.generateId());
        weightVal.setValue("30");
        weightVal.setCreateTime(LocalDateTime.now());
        AttributeNameModel weight= this.attributeNameService.find(118138914484520963L);
        weightVal.setName(weight);
        this.attributeValueService.save(weightVal);




        AttributeValueModel packageLengthVal = new AttributeValueModel();
        packageLengthVal.setId(this.idGenerator.generateId());
        packageLengthVal.setValue("120");
        packageLengthVal.setCreateTime(LocalDateTime.now());
        AttributeNameModel packageLength = this.attributeNameService.find(118138914484521987L);
        packageLengthVal.setName(packageLength);
        this.attributeValueService.save(packageLengthVal);

        AttributeValueModel packageWidthVal = new AttributeValueModel();
        packageWidthVal.setId(this.idGenerator.generateId());
        packageWidthVal.setValue("72");
        packageWidthVal.setCreateTime(LocalDateTime.now());
        AttributeNameModel packageWidth = this.attributeNameService.find(118138914484521987L);
        packageWidthVal.setName(packageWidth);
        this.attributeValueService.save(packageWidthVal);

        AttributeValueModel packageHeightVal = new AttributeValueModel();
        packageHeightVal.setId(this.idGenerator.generateId());
        packageHeightVal.setValue("8");
        packageHeightVal.setCreateTime(LocalDateTime.now());
        AttributeNameModel packageHeight = this.attributeNameService.find(118138914484521987L);
        packageHeightVal.setName(packageHeight);
        this.attributeValueService.save(packageHeightVal);

    }


    @Test
    public void saveTV() {
        AttributeValueModel screenSizeVal = new AttributeValueModel();
        screenSizeVal.setId(this.idGenerator.generateId());
        screenSizeVal.setValue("65");
        screenSizeVal.setCreateTime(LocalDateTime.now());
        AttributeNameModel screenSizeName = this.attributeNameService.find(118138914484521987L);
        screenSizeVal.setName(screenSizeName);
        this.attributeValueService.save(screenSizeVal);


        AttributeValueModel screenSizeVal1 = new AttributeValueModel();
        screenSizeVal1.setId(this.idGenerator.generateId());
        screenSizeVal1.setValue("80");
        screenSizeVal1.setCreateTime(LocalDateTime.now());
//        AttributeNameModel screenSizeName = this.attributeNameService.find(118138914484521987L);
        screenSizeVal1.setName(screenSizeName);
        this.attributeValueService.save(screenSizeVal1);

//        AttributeNameModel resolution = this.attributeNameService.find(118138914484519939L);
//        AttributeValueModel SHV = new AttributeValueModel();
//        SHV.setId(this.idGenerator.generateId());
//        SHV.setValue("超高清");
//        SHV.setCreateTime(LocalDateTime.now());
//        SHV.setName(resolution);
//        this.attributeValueService.save(SHV);
//
//        AttributeValueModel FHV = new AttributeValueModel();
//        FHV.setId(this.idGenerator.generateId());
//        FHV.setValue("全高清");
//        FHV.setCreateTime(LocalDateTime.now());
//        FHV.setName(resolution);
//        this.attributeValueService.save(FHV);
//
//        AttributeValueModel HV = new AttributeValueModel();
//        HV.setId(this.idGenerator.generateId());
//        HV.setValue("高清");
//        HV.setCreateTime(LocalDateTime.now());
//        HV.setName(resolution);
//        this.attributeValueService.save(HV);
    }

    @Test
    public void saveAirCondition() {
        AttributeNameModel coolHeatType = this.attributeNameService.find(118144131796043779L);
        AttributeValueModel coolHeatTypeValue = new AttributeValueModel();
        coolHeatTypeValue.setId(this.idGenerator.generateId());
        coolHeatTypeValue.setValue("冷暖空调");
        coolHeatTypeValue.setCreateTime(LocalDateTime.now());
        coolHeatTypeValue.setName(coolHeatType);
        this.attributeValueService.save(coolHeatTypeValue);

        coolHeatTypeValue.setId(this.idGenerator.generateId());
        coolHeatTypeValue.setValue("单冷空调");
        coolHeatTypeValue.setCreateTime(LocalDateTime.now());
        coolHeatTypeValue.setName(coolHeatType);
        this.attributeValueService.save(coolHeatTypeValue);

        AttributeNameModel workMode = this.attributeNameService.find(118144131796044803L);
        AttributeValueModel workModeVal = new AttributeValueModel();
        workModeVal.setId(this.idGenerator.generateId());
        workModeVal.setValue("变频");
        workModeVal.setCreateTime(LocalDateTime.now());
        workModeVal.setName(workMode);
        this.attributeValueService.save(workModeVal);

        workModeVal.setId(this.idGenerator.generateId());
        workModeVal.setValue("定额");
        workModeVal.setCreateTime(LocalDateTime.now());
        workModeVal.setName(workMode);
        this.attributeValueService.save(workModeVal);

        AttributeNameModel power = this.attributeNameService.find(118144131796045827L);
        AttributeValueModel powerVal = new AttributeValueModel();
        powerVal.setId(this.idGenerator.generateId());
        powerVal.setValue("1P");
        powerVal.setCreateTime(LocalDateTime.now());
        powerVal.setName(power);
        this.attributeValueService.save(powerVal);

        powerVal.setId(this.idGenerator.generateId());
        powerVal.setValue("1.5P");
        powerVal.setCreateTime(LocalDateTime.now());
        powerVal.setName(power);
        this.attributeValueService.save(powerVal);

        powerVal.setId(this.idGenerator.generateId());
        powerVal.setValue("2P");
        powerVal.setCreateTime(LocalDateTime.now());
        powerVal.setName(power);
        this.attributeValueService.save(powerVal);

        powerVal.setId(this.idGenerator.generateId());
        powerVal.setValue("2.5P");
        powerVal.setCreateTime(LocalDateTime.now());
        powerVal.setName(power);
        this.attributeValueService.save(powerVal);

        powerVal.setId(this.idGenerator.generateId());
        powerVal.setValue("3P");
        powerVal.setCreateTime(LocalDateTime.now());
        powerVal.setName(power);
        this.attributeValueService.save(powerVal);

        powerVal.setId(this.idGenerator.generateId());
        powerVal.setValue("大于5P");
        powerVal.setCreateTime(LocalDateTime.now());
        powerVal.setName(power);
        this.attributeValueService.save(powerVal);
    }

    @Test
    public void saveBingxiang() {
        AttributeNameModel volume = this.attributeNameService.find(118160157392764931L);
        AttributeValueModel volumeVal = new AttributeValueModel();
        volumeVal.setId(this.idGenerator.generateId());
        volumeVal.setValue("350");
        volumeVal.setCreateTime(LocalDateTime.now());
        volumeVal.setName(volume);
        this.attributeValueService.save(volumeVal);

        AttributeNameModel volumeRange = this.attributeNameService.find(118160157392765955L);
        AttributeValueModel volumeRangeVal = new AttributeValueModel();
        volumeRangeVal.setId(this.idGenerator.generateId());
        volumeRangeVal.setValue("100L以下");
        volumeRangeVal.setCreateTime(LocalDateTime.now());
        volumeRangeVal.setName(volumeRange);
        this.attributeValueService.save(volumeRangeVal);

        volumeRangeVal.setId(this.idGenerator.generateId());
        volumeRangeVal.setValue("101-300L");
        volumeRangeVal.setCreateTime(LocalDateTime.now());
        volumeRangeVal.setName(volumeRange);
        this.attributeValueService.save(volumeRangeVal);

        volumeRangeVal.setId(this.idGenerator.generateId());
        volumeRangeVal.setValue("301-600L");
        volumeRangeVal.setCreateTime(LocalDateTime.now());
        volumeRangeVal.setName(volumeRange);
        this.attributeValueService.save(volumeRangeVal);

        volumeRangeVal.setId(this.idGenerator.generateId());
        volumeRangeVal.setValue("600L以上");
        volumeRangeVal.setCreateTime(LocalDateTime.now());
        volumeRangeVal.setName(volumeRange);
        this.attributeValueService.save(volumeRangeVal);


        AttributeNameModel coolingmode = this.attributeNameService.find(118160157392766979L);
        AttributeValueModel coolingmodeVal = new AttributeValueModel();
        coolingmodeVal.setId(this.idGenerator.generateId());
        coolingmodeVal.setValue("风冷(无霜)");
        coolingmodeVal.setCreateTime(LocalDateTime.now());
        coolingmodeVal.setName(coolingmode);
        this.attributeValueService.save(coolingmodeVal);

        coolingmodeVal.setId(this.idGenerator.generateId());
        coolingmodeVal.setValue("风直冷(混冷)");
        coolingmodeVal.setCreateTime(LocalDateTime.now());
        coolingmodeVal.setName(coolingmode);
        this.attributeValueService.save(coolingmodeVal);

        coolingmodeVal.setId(this.idGenerator.generateId());
        coolingmodeVal.setValue("直冷");
        coolingmodeVal.setCreateTime(LocalDateTime.now());
        coolingmodeVal.setName(coolingmode);
        this.attributeValueService.save(coolingmodeVal);

        AttributeNameModel temperatureControlMode = this.attributeNameService.find(118160157392768003L);
        AttributeValueModel temperatureControlModeVal = new AttributeValueModel();
        temperatureControlModeVal.setId(this.idGenerator.generateId());
        temperatureControlModeVal.setValue("电脑控温");
        temperatureControlModeVal.setCreateTime(LocalDateTime.now());
        temperatureControlModeVal.setName(temperatureControlMode);
        this.attributeValueService.save(temperatureControlModeVal);

        temperatureControlModeVal.setId(this.idGenerator.generateId());
        temperatureControlModeVal.setValue("机械控温");
        temperatureControlModeVal.setCreateTime(LocalDateTime.now());
        temperatureControlModeVal.setName(temperatureControlMode);
        this.attributeValueService.save(temperatureControlModeVal);

        AttributeNameModel doorStyle = this.attributeNameService.find(118160157392769027L);
        AttributeValueModel doorStyleVal = new AttributeValueModel();
        doorStyleVal.setId(this.idGenerator.generateId());
        doorStyleVal.setValue("多门");
        doorStyleVal.setCreateTime(LocalDateTime.now());
        doorStyleVal.setName(doorStyle);
        this.attributeValueService.save(doorStyleVal);

        doorStyleVal.setId(this.idGenerator.generateId());
        doorStyleVal.setValue("三门");
        doorStyleVal.setCreateTime(LocalDateTime.now());
        doorStyleVal.setName(doorStyle);
        this.attributeValueService.save(doorStyleVal);

        doorStyleVal.setId(this.idGenerator.generateId());
        doorStyleVal.setValue("十字对开");
        doorStyleVal.setCreateTime(LocalDateTime.now());
        doorStyleVal.setName(doorStyle);
        this.attributeValueService.save(doorStyleVal);

        doorStyleVal.setId(this.idGenerator.generateId());
        doorStyleVal.setValue("对开双门");
        doorStyleVal.setCreateTime(LocalDateTime.now());
        doorStyleVal.setName(doorStyle);
        this.attributeValueService.save(doorStyleVal);

        AttributeNameModel panelType = this.attributeNameService.find(118160157392770051L);
        AttributeValueModel panelTypeVal = new AttributeValueModel();
        panelTypeVal.setId(this.idGenerator.generateId());
        panelTypeVal.setValue("钢化玻璃");
        panelTypeVal.setCreateTime(LocalDateTime.now());
        panelTypeVal.setName(panelType);
        this.attributeValueService.save(panelTypeVal);

        panelTypeVal.setId(this.idGenerator.generateId());
        panelTypeVal.setValue("不锈钢");
        panelTypeVal.setCreateTime(LocalDateTime.now());
        panelTypeVal.setName(panelType);
        this.attributeValueService.save(panelTypeVal);

        panelTypeVal.setId(this.idGenerator.generateId());
        panelTypeVal.setValue("PCM图彩板");
        panelTypeVal.setCreateTime(LocalDateTime.now());
        panelTypeVal.setName(panelType);
        this.attributeValueService.save(panelTypeVal);

        AttributeNameModel energyEfficiencyLevel = this.attributeNameService.find(118160157392771075L);
        AttributeValueModel energyEfficiencyLevelVal = new AttributeValueModel();
        energyEfficiencyLevelVal.setId(this.idGenerator.generateId());
        energyEfficiencyLevelVal.setValue("无");
        energyEfficiencyLevelVal.setCreateTime(LocalDateTime.now());
        energyEfficiencyLevelVal.setName(energyEfficiencyLevel);
        this.attributeValueService.save(energyEfficiencyLevelVal);

        energyEfficiencyLevelVal.setId(this.idGenerator.generateId());
        energyEfficiencyLevelVal.setValue("1");
        energyEfficiencyLevelVal.setCreateTime(LocalDateTime.now());
        energyEfficiencyLevelVal.setName(energyEfficiencyLevel);
        this.attributeValueService.save(energyEfficiencyLevelVal);

        energyEfficiencyLevelVal.setId(this.idGenerator.generateId());
        energyEfficiencyLevelVal.setValue("2");
        energyEfficiencyLevelVal.setCreateTime(LocalDateTime.now());
        energyEfficiencyLevelVal.setName(energyEfficiencyLevel);
        this.attributeValueService.save(energyEfficiencyLevelVal);

        energyEfficiencyLevelVal.setId(this.idGenerator.generateId());
        energyEfficiencyLevelVal.setValue("3");
        energyEfficiencyLevelVal.setCreateTime(LocalDateTime.now());
        energyEfficiencyLevelVal.setName(energyEfficiencyLevel);
        this.attributeValueService.save(energyEfficiencyLevelVal);

        energyEfficiencyLevelVal.setId(this.idGenerator.generateId());
        energyEfficiencyLevelVal.setValue("其他");
        energyEfficiencyLevelVal.setCreateTime(LocalDateTime.now());
        energyEfficiencyLevelVal.setName(energyEfficiencyLevel);
        this.attributeValueService.save(energyEfficiencyLevelVal);

        AttributeNameModel coolingControSystem = this.attributeNameService.find(118160157392772099L);
        AttributeValueModel coolingControSystemVal = new AttributeValueModel();
        coolingControSystemVal.setId(this.idGenerator.generateId());
        coolingControSystemVal.setValue("机械温控");
        coolingControSystemVal.setCreateTime(LocalDateTime.now());
        coolingControSystemVal.setName(coolingControSystem);
        this.attributeValueService.save(coolingControSystemVal);

        coolingControSystemVal.setId(this.idGenerator.generateId());
        coolingControSystemVal.setValue("电子温控");
        coolingControSystemVal.setCreateTime(LocalDateTime.now());
        coolingControSystemVal.setName(coolingControSystem);
        this.attributeValueService.save(coolingControSystemVal);

        coolingControSystemVal.setId(this.idGenerator.generateId());
        coolingControSystemVal.setValue("电脑温控");
        coolingControSystemVal.setCreateTime(LocalDateTime.now());
        coolingControSystemVal.setName(coolingControSystem);
        this.attributeValueService.save(coolingControSystemVal);
    }

    @Test
    public void saveWasher() {
        AttributeNameModel washingCapacity = this.attributeNameService.find(118160404353384451L);
        AttributeValueModel washingCapacityVal = new AttributeValueModel();
        washingCapacityVal.setId(this.idGenerator.generateId());
        washingCapacityVal.setValue("<5");
        washingCapacityVal.setCreateTime(LocalDateTime.now());
        washingCapacityVal.setName(washingCapacity);
        this.attributeValueService.save(washingCapacityVal);

        washingCapacityVal.setId(this.idGenerator.generateId());
        washingCapacityVal.setValue("5-8");
        washingCapacityVal.setCreateTime(LocalDateTime.now());
        washingCapacityVal.setName(washingCapacity);
        this.attributeValueService.save(washingCapacityVal);

        washingCapacityVal.setId(this.idGenerator.generateId());
        washingCapacityVal.setValue("8-10");
        washingCapacityVal.setCreateTime(LocalDateTime.now());
        washingCapacityVal.setName(washingCapacity);
        this.attributeValueService.save(washingCapacityVal);

        washingCapacityVal.setId(this.idGenerator.generateId());
        washingCapacityVal.setValue(">10");
        washingCapacityVal.setCreateTime(LocalDateTime.now());
        washingCapacityVal.setName(washingCapacity);
        this.attributeValueService.save(washingCapacityVal);


        AttributeNameModel drainMethod = this.attributeNameService.find(118160404353385475L);
        AttributeValueModel drainMethodVal = new AttributeValueModel();
        drainMethodVal.setId(this.idGenerator.generateId());
        drainMethodVal.setValue("上排水");
        drainMethodVal.setCreateTime(LocalDateTime.now());
        drainMethodVal.setName(drainMethod);
        this.attributeValueService.save(drainMethodVal);

        drainMethodVal.setId(this.idGenerator.generateId());
        drainMethodVal.setValue("下排水");
        drainMethodVal.setCreateTime(LocalDateTime.now());
        drainMethodVal.setName(drainMethod);
        this.attributeValueService.save(drainMethodVal);

        drainMethodVal.setId(this.idGenerator.generateId());
        drainMethodVal.setValue("上/下排水");
        drainMethodVal.setCreateTime(LocalDateTime.now());
        drainMethodVal.setName(drainMethod);
        this.attributeValueService.save(drainMethodVal);

        AttributeNameModel motorType = this.attributeNameService.find(118160404353386499L);
        AttributeValueModel motorTypeVal = new AttributeValueModel();
        motorTypeVal.setId(this.idGenerator.generateId());
        motorTypeVal.setValue("变频");
        motorTypeVal.setCreateTime(LocalDateTime.now());
        motorTypeVal.setName(motorType);
        this.attributeValueService.save(motorTypeVal);

        motorTypeVal.setId(this.idGenerator.generateId());
        motorTypeVal.setValue("定额");
        motorTypeVal.setCreateTime(LocalDateTime.now());
        motorTypeVal.setName(motorType);
        this.attributeValueService.save(motorTypeVal);

        AttributeNameModel usageMode = this.attributeNameService.find(118160404353387523L);
        AttributeValueModel usageModeVal = new AttributeValueModel();
        usageModeVal.setId(this.idGenerator.generateId());
        usageModeVal.setValue("手动");
        usageModeVal.setCreateTime(LocalDateTime.now());
        usageModeVal.setName(usageMode);
        this.attributeValueService.save(usageModeVal);

        usageModeVal.setId(this.idGenerator.generateId());
        usageModeVal.setValue("全自动");
        usageModeVal.setCreateTime(LocalDateTime.now());
        usageModeVal.setName(usageMode);
        this.attributeValueService.save(usageModeVal);

        usageModeVal.setId(this.idGenerator.generateId());
        usageModeVal.setValue("半自动");
        usageModeVal.setCreateTime(LocalDateTime.now());
        usageModeVal.setName(usageMode);
        this.attributeValueService.save(usageModeVal);


        AttributeNameModel washerAttachment = this.attributeNameService.find(118160404353387523L);
        AttributeValueModel washerAttachmentVal = new AttributeValueModel();
        washerAttachmentVal.setId(this.idGenerator.generateId());
        washerAttachmentVal.setValue("安心童锁");
        washerAttachmentVal.setCreateTime(LocalDateTime.now());
        washerAttachmentVal.setName(washerAttachment);
        this.attributeValueService.save(washerAttachmentVal);

        washerAttachmentVal.setId(this.idGenerator.generateId());
        washerAttachmentVal.setValue("自动断电");
        washerAttachmentVal.setCreateTime(LocalDateTime.now());
        washerAttachmentVal.setName(washerAttachment);
        this.attributeValueService.save(washerAttachmentVal);

        washerAttachmentVal.setId(this.idGenerator.generateId());
        washerAttachmentVal.setValue("故障诊断");
        washerAttachmentVal.setCreateTime(LocalDateTime.now());
        washerAttachmentVal.setName(washerAttachment);
        this.attributeValueService.save(washerAttachmentVal);

        washerAttachmentVal.setId(this.idGenerator.generateId());
        washerAttachmentVal.setValue("漏电保护");
        washerAttachmentVal.setCreateTime(LocalDateTime.now());
        washerAttachmentVal.setName(washerAttachment);
        this.attributeValueService.save(washerAttachmentVal);
        washerAttachmentVal.setId(this.idGenerator.generateId());
        washerAttachmentVal.setValue("预约");
        washerAttachmentVal.setCreateTime(LocalDateTime.now());
        washerAttachmentVal.setName(washerAttachment);
        this.attributeValueService.save(washerAttachmentVal);
    }


    @Test
    public void saveMobile() {
        AttributeNameModel cpu = this.attributeNameService.find(118161298780323843L);
        AttributeValueModel cpuVal = new AttributeValueModel();
        cpuVal.setId(this.idGenerator.generateId());
        cpuVal.setValue("ARM");
        cpuVal.setCreateTime(LocalDateTime.now());
        cpuVal.setName(cpu);
        this.attributeValueService.save(cpuVal);

        cpuVal.setId(this.idGenerator.generateId());
        cpuVal.setValue("高通");
        cpuVal.setCreateTime(LocalDateTime.now());
        cpuVal.setName(cpu);
        this.attributeValueService.save(cpuVal);

        cpuVal.setId(this.idGenerator.generateId());
        cpuVal.setValue("海思");
        cpuVal.setCreateTime(LocalDateTime.now());
        cpuVal.setName(cpu);
        this.attributeValueService.save(cpuVal);

        cpuVal.setId(this.idGenerator.generateId());
        cpuVal.setValue("联发科");
        cpuVal.setCreateTime(LocalDateTime.now());
        cpuVal.setName(cpu);
        this.attributeValueService.save(cpuVal);

        AttributeNameModel mobileStyle = this.attributeNameService.find(118161298780326915L);
        AttributeValueModel mobileStyleyVal = new AttributeValueModel();
        mobileStyleyVal.setId(this.idGenerator.generateId());
        mobileStyleyVal.setValue("直板");
        mobileStyleyVal.setCreateTime(LocalDateTime.now());
        mobileStyleyVal.setName(mobileStyle);
        this.attributeValueService.save(mobileStyleyVal);

        mobileStyleyVal.setId(this.idGenerator.generateId());
        mobileStyleyVal.setValue("滑盖");
        mobileStyleyVal.setCreateTime(LocalDateTime.now());
        mobileStyleyVal.setName(mobileStyle);
        this.attributeValueService.save(mobileStyleyVal);

        mobileStyleyVal.setId(this.idGenerator.generateId());
        mobileStyleyVal.setValue("翻盖");
        mobileStyleyVal.setCreateTime(LocalDateTime.now());
        mobileStyleyVal.setName(mobileStyle);
        this.attributeValueService.save(mobileStyleyVal);

        mobileStyleyVal.setId(this.idGenerator.generateId());
        mobileStyleyVal.setValue("侧滑盖");
        mobileStyleyVal.setCreateTime(LocalDateTime.now());
        mobileStyleyVal.setName(mobileStyle);
        this.attributeValueService.save(mobileStyleyVal);

        AttributeNameModel rearCamera = this.attributeNameService.find(118161298780327939L);
        AttributeValueModel rearCameraVal = new AttributeValueModel();
        rearCameraVal.setId(this.idGenerator.generateId());
        rearCameraVal.setValue("800");
        rearCameraVal.setCreateTime(LocalDateTime.now());
        rearCameraVal.setName(rearCamera);
        this.attributeValueService.save(rearCameraVal);

        rearCameraVal.setId(this.idGenerator.generateId());
        rearCameraVal.setValue("1000");
        rearCameraVal.setCreateTime(LocalDateTime.now());
        rearCameraVal.setName(rearCamera);
        this.attributeValueService.save(rearCameraVal);

        rearCameraVal.setId(this.idGenerator.generateId());
        rearCameraVal.setValue("1200");
        rearCameraVal.setCreateTime(LocalDateTime.now());
        rearCameraVal.setName(rearCamera);
        this.attributeValueService.save(rearCameraVal);
        rearCameraVal.setId(this.idGenerator.generateId());
        rearCameraVal.setValue("1400");
        rearCameraVal.setCreateTime(LocalDateTime.now());
        rearCameraVal.setName(rearCamera);
        this.attributeValueService.save(rearCameraVal);

        rearCameraVal.setId(this.idGenerator.generateId());
        rearCameraVal.setValue("1600");
        rearCameraVal.setCreateTime(LocalDateTime.now());
        rearCameraVal.setName(rearCamera);
        this.attributeValueService.save(rearCameraVal);

        rearCameraVal.setId(this.idGenerator.generateId());
        rearCameraVal.setValue("2000");
        rearCameraVal.setCreateTime(LocalDateTime.now());
        rearCameraVal.setName(rearCamera);
        this.attributeValueService.save(rearCameraVal);


        AttributeNameModel afterService = this.attributeNameService.find(118161298780328963L);
        AttributeValueModel afterServiceVal = new AttributeValueModel();
        afterServiceVal.setId(this.idGenerator.generateId());
        afterServiceVal.setValue("全国联保");
        afterServiceVal.setCreateTime(LocalDateTime.now());
        afterServiceVal.setName(afterService);
        this.attributeValueService.save(afterServiceVal);

        afterServiceVal.setId(this.idGenerator.generateId());
        afterServiceVal.setValue("店铺三包");
        afterServiceVal.setCreateTime(LocalDateTime.now());
        afterServiceVal.setName(afterService);
        this.attributeValueService.save(afterServiceVal);

        afterServiceVal.setId(this.idGenerator.generateId());
        afterServiceVal.setValue("无售后服务");
        afterServiceVal.setCreateTime(LocalDateTime.now());
        afterServiceVal.setName(afterService);
        this.attributeValueService.save(afterServiceVal);

        AttributeNameModel storevolume = this.attributeNameService.find(118161298780329987L);
        AttributeValueModel storevolumeVal = new AttributeValueModel();
        storevolumeVal.setId(this.idGenerator.generateId());
        storevolumeVal.setValue("256");
        storevolumeVal.setCreateTime(LocalDateTime.now());
        storevolumeVal.setName(storevolume);
        this.attributeValueService.save(storevolumeVal);

        storevolumeVal.setId(this.idGenerator.generateId());
        storevolumeVal.setValue("128");
        storevolumeVal.setCreateTime(LocalDateTime.now());
        storevolumeVal.setName(storevolume);
        this.attributeValueService.save(storevolumeVal);

        storevolumeVal.setId(this.idGenerator.generateId());
        storevolumeVal.setValue("64");
        storevolumeVal.setCreateTime(LocalDateTime.now());
        storevolumeVal.setName(storevolume);
        this.attributeValueService.save(storevolumeVal);

        storevolumeVal.setId(this.idGenerator.generateId());
        storevolumeVal.setValue("32");
        storevolumeVal.setCreateTime(LocalDateTime.now());
        storevolumeVal.setName(storevolume);
        this.attributeValueService.save(storevolumeVal);

        storevolumeVal.setId(this.idGenerator.generateId());
        storevolumeVal.setValue("16");
        storevolumeVal.setCreateTime(LocalDateTime.now());
        storevolumeVal.setName(storevolume);
        this.attributeValueService.save(storevolumeVal);

        storevolumeVal.setId(this.idGenerator.generateId());
        storevolumeVal.setValue("8");
        storevolumeVal.setCreateTime(LocalDateTime.now());
        storevolumeVal.setName(storevolume);
        this.attributeValueService.save(storevolumeVal);

        AttributeNameModel vtype = this.attributeNameService.find(118161298780331011L);
        AttributeValueModel vtypeVal = new AttributeValueModel();
        vtypeVal.setId(this.idGenerator.generateId());
        vtypeVal.setValue("中国大陆");
        vtypeVal.setCreateTime(LocalDateTime.now());
        vtypeVal.setName(vtype);
        this.attributeValueService.save(vtypeVal);

        vtypeVal.setId(this.idGenerator.generateId());
        vtypeVal.setValue("港澳台");
        vtypeVal.setCreateTime(LocalDateTime.now());
        vtypeVal.setName(vtype);
        this.attributeValueService.save(vtypeVal);

        vtypeVal.setId(this.idGenerator.generateId());
        vtypeVal.setValue("美国");
        vtypeVal.setCreateTime(LocalDateTime.now());
        vtypeVal.setName(vtype);
        this.attributeValueService.save(vtypeVal);

        vtypeVal.setId(this.idGenerator.generateId());
        vtypeVal.setValue("欧洲");
        vtypeVal.setCreateTime(LocalDateTime.now());
        vtypeVal.setName(vtype);
        this.attributeValueService.save(vtypeVal);
    }

    @Test
    public void saveClothes() {



        AttributeNameModel shellFabric = this.attributeNameService.find(118161488832629763L);
        AttributeValueModel shellFabricVal = new AttributeValueModel();
        shellFabricVal.setId(this.idGenerator.generateId());
        shellFabricVal.setValue("法兰绒");
        shellFabricVal.setCreateTime(LocalDateTime.now());
        shellFabricVal.setName(shellFabric);
        this.attributeValueService.save(shellFabricVal);

        shellFabricVal.setId(this.idGenerator.generateId());
        shellFabricVal.setValue("羊毛布");
        shellFabricVal.setCreateTime(LocalDateTime.now());
        shellFabricVal.setName(shellFabric);
        this.attributeValueService.save(shellFabricVal);
        shellFabricVal.setId(this.idGenerator.generateId());
        shellFabricVal.setValue("牛津纺");
        shellFabricVal.setCreateTime(LocalDateTime.now());
        shellFabricVal.setName(shellFabric);
        this.attributeValueService.save(shellFabricVal);

        shellFabricVal.setId(this.idGenerator.generateId());
        shellFabricVal.setValue("印花布");
        shellFabricVal.setCreateTime(LocalDateTime.now());
        shellFabricVal.setName(shellFabric);
        this.attributeValueService.save(shellFabricVal);

        shellFabricVal.setId(this.idGenerator.generateId());
        shellFabricVal.setValue("色织布");
        shellFabricVal.setCreateTime(LocalDateTime.now());
        shellFabricVal.setName(shellFabric);
        this.attributeValueService.save(shellFabricVal);

        shellFabricVal.setId(this.idGenerator.generateId());
        shellFabricVal.setValue("提花布");
        shellFabricVal.setCreateTime(LocalDateTime.now());
        shellFabricVal.setName(shellFabric);
        this.attributeValueService.save(shellFabricVal);

        AttributeNameModel season = this.attributeNameService.find(118161488832633859L);
        AttributeValueModel seasonVal = new AttributeValueModel();
        seasonVal.setId(this.idGenerator.generateId());
        seasonVal.setValue("春");
        seasonVal.setCreateTime(LocalDateTime.now());
        seasonVal.setName(season);
        this.attributeValueService.save(seasonVal);

        seasonVal.setId(this.idGenerator.generateId());
        seasonVal.setValue("夏");
        seasonVal.setCreateTime(LocalDateTime.now());
        seasonVal.setName(season);
        this.attributeValueService.save(seasonVal);

        seasonVal.setId(this.idGenerator.generateId());
        seasonVal.setValue("秋");
        seasonVal.setCreateTime(LocalDateTime.now());
        seasonVal.setName(season);
        this.attributeValueService.save(seasonVal);

        seasonVal.setId(this.idGenerator.generateId());
        seasonVal.setValue("冬");
        seasonVal.setCreateTime(LocalDateTime.now());
        seasonVal.setName(season);
        this.attributeValueService.save(seasonVal);

        AttributeNameModel size = this.attributeNameService.find(118161488832634883L);
        AttributeValueModel sizeVal = new AttributeValueModel();
        sizeVal.setId(this.idGenerator.generateId());
        sizeVal.setValue("S");
        sizeVal.setCreateTime(LocalDateTime.now());
        sizeVal.setName(size);
        this.attributeValueService.save(sizeVal);

        sizeVal.setId(this.idGenerator.generateId());
        sizeVal.setValue("M");
        sizeVal.setCreateTime(LocalDateTime.now());
        sizeVal.setName(size);
        this.attributeValueService.save(sizeVal);

        sizeVal.setId(this.idGenerator.generateId());
        sizeVal.setValue("L");
        sizeVal.setCreateTime(LocalDateTime.now());
        sizeVal.setName(size);
        this.attributeValueService.save(sizeVal);

        sizeVal.setId(this.idGenerator.generateId());
        sizeVal.setValue("XL");
        sizeVal.setCreateTime(LocalDateTime.now());
        sizeVal.setName(size);
        this.attributeValueService.save(sizeVal);

        sizeVal.setId(this.idGenerator.generateId());
        sizeVal.setValue("2XL");
        sizeVal.setCreateTime(LocalDateTime.now());
        sizeVal.setName(size);
        this.attributeValueService.save(sizeVal);

        AttributeNameModel color = this.attributeNameService.find(118160249734569987L);
        AttributeValueModel colorVal = new AttributeValueModel();
        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("黑色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("白色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("红色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("蓝色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("绿色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("粉色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("灰色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("黄色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("紫色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);

        colorVal.setId(this.idGenerator.generateId());
        colorVal.setValue("棕色");
        colorVal.setCreateTime(LocalDateTime.now());
        colorVal.setName(color);
        this.attributeValueService.save(colorVal);
    }

    @Test
    public void savePants() {
        AttributeNameModel pantsModel = this.attributeNameService.find(118161864642265091L);
        AttributeValueModel pantsModelVal = new AttributeValueModel();
        pantsModelVal.setId(this.idGenerator.generateId());
        pantsModelVal.setValue("修身裤");
        pantsModelVal.setCreateTime(LocalDateTime.now());
        pantsModelVal.setName(pantsModel);
        this.attributeValueService.save(pantsModelVal);

        pantsModelVal.setId(this.idGenerator.generateId());
        pantsModelVal.setValue("直筒裤");
        pantsModelVal.setCreateTime(LocalDateTime.now());
        pantsModelVal.setName(pantsModel);
        this.attributeValueService.save(pantsModelVal);


        pantsModelVal.setId(this.idGenerator.generateId());
        pantsModelVal.setValue("宽松裤");
        pantsModelVal.setCreateTime(LocalDateTime.now());
        pantsModelVal.setName(pantsModel);
        this.attributeValueService.save(pantsModelVal);


        pantsModelVal.setId(this.idGenerator.generateId());
        pantsModelVal.setValue("背带裤");
        pantsModelVal.setCreateTime(LocalDateTime.now());
        pantsModelVal.setName(pantsModel);
        this.attributeValueService.save(pantsModelVal);


        pantsModelVal.setId(this.idGenerator.generateId());
        pantsModelVal.setValue("喇叭裤");
        pantsModelVal.setCreateTime(LocalDateTime.now());
        pantsModelVal.setName(pantsModel);
        this.attributeValueService.save(pantsModelVal);


        AttributeNameModel pantsLength = this.attributeNameService.find(118161864642266115L);
        AttributeValueModel pantsLengthVal = new AttributeValueModel();
        pantsLengthVal.setId(this.idGenerator.generateId());
        pantsLengthVal.setValue("五分裤");
        pantsLengthVal.setCreateTime(LocalDateTime.now());
        pantsLengthVal.setName(pantsLength);
        this.attributeValueService.save(pantsLengthVal);

        pantsLengthVal.setId(this.idGenerator.generateId());
        pantsLengthVal.setValue("六分裤");
        pantsLengthVal.setCreateTime(LocalDateTime.now());
        pantsLengthVal.setName(pantsLength);
        this.attributeValueService.save(pantsLengthVal);

        pantsLengthVal.setId(this.idGenerator.generateId());
        pantsLengthVal.setValue("七分裤");
        pantsLengthVal.setCreateTime(LocalDateTime.now());
        pantsLengthVal.setName(pantsLength);
        this.attributeValueService.save(pantsLengthVal);

        pantsLengthVal.setId(this.idGenerator.generateId());
        pantsLengthVal.setValue("八分裤");
        pantsLengthVal.setCreateTime(LocalDateTime.now());
        pantsLengthVal.setName(pantsLength);
        this.attributeValueService.save(pantsLengthVal);

        pantsLengthVal.setId(this.idGenerator.generateId());
        pantsLengthVal.setValue("长裤");
        pantsLengthVal.setCreateTime(LocalDateTime.now());
        pantsLengthVal.setName(pantsLength);
        this.attributeValueService.save(pantsLengthVal);



        AttributeNameModel waistModel = this.attributeNameService.find(118161864642267139L);
        AttributeValueModel waistModelVal = new AttributeValueModel();
        waistModelVal.setId(this.idGenerator.generateId());
        waistModelVal.setValue("高腰");
        waistModelVal.setCreateTime(LocalDateTime.now());
        waistModelVal.setName(waistModel);
        this.attributeValueService.save(waistModelVal);


        waistModelVal.setId(this.idGenerator.generateId());
        waistModelVal.setValue("中腰");
        waistModelVal.setCreateTime(LocalDateTime.now());
        waistModelVal.setName(waistModel);
        this.attributeValueService.save(waistModelVal);


        waistModelVal.setId(this.idGenerator.generateId());
        waistModelVal.setValue("低腰");
        waistModelVal.setCreateTime(LocalDateTime.now());
        waistModelVal.setName(waistModel);
        this.attributeValueService.save(waistModelVal);


        waistModelVal.setId(this.idGenerator.generateId());
        waistModelVal.setValue("中低腰");
        waistModelVal.setCreateTime(LocalDateTime.now());
        waistModelVal.setName(waistModel);
        this.attributeValueService.save(waistModelVal);


        waistModelVal.setId(this.idGenerator.generateId());
        waistModelVal.setValue("中高腰");
        waistModelVal.setCreateTime(LocalDateTime.now());
        waistModelVal.setName(waistModel);
        this.attributeValueService.save(waistModelVal);

        AttributeNameModel jeanShellFabric = this.attributeNameService.find(118161864642268163L);
        AttributeValueModel jeanShellFabricVal = new AttributeValueModel();
        jeanShellFabricVal.setId(this.idGenerator.generateId());
        jeanShellFabricVal.setValue("加厚牛仔");
        jeanShellFabricVal.setCreateTime(LocalDateTime.now());
        jeanShellFabricVal.setName(jeanShellFabric);
        this.attributeValueService.save(jeanShellFabricVal);

        jeanShellFabricVal.setId(this.idGenerator.generateId());
        jeanShellFabricVal.setValue("布薄牛仔");
        jeanShellFabricVal.setCreateTime(LocalDateTime.now());
        jeanShellFabricVal.setName(jeanShellFabric);
        this.attributeValueService.save(jeanShellFabricVal);


        jeanShellFabricVal.setId(this.idGenerator.generateId());
        jeanShellFabricVal.setValue("布常规牛仔");
        jeanShellFabricVal.setCreateTime(LocalDateTime.now());
        jeanShellFabricVal.setName(jeanShellFabric);
        this.attributeValueService.save(jeanShellFabricVal);

        jeanShellFabricVal.setId(this.idGenerator.generateId());
        jeanShellFabricVal.setValue("布加绒牛仔");
        jeanShellFabricVal.setCreateTime(LocalDateTime.now());
        jeanShellFabricVal.setName(jeanShellFabric);
        this.attributeValueService.save(jeanShellFabricVal);


        jeanShellFabricVal.setId(this.idGenerator.generateId());
        jeanShellFabricVal.setValue("布丝光牛仔");
        jeanShellFabricVal.setCreateTime(LocalDateTime.now());
        jeanShellFabricVal.setName(jeanShellFabric);
        this.attributeValueService.save(jeanShellFabricVal);
    }

    @Test
    public void saveSize() {
        AttributeNameModel pantSize = this.attributeNameService.find(120103444336869379L);
        AttributeValueModel pantSizeVal = new AttributeValueModel();
        for (int i= 20; i <= 40; i++) {
            pantSizeVal.setId(this.idGenerator.generateId());
            pantSizeVal.setValue(String.valueOf(i));
            pantSizeVal.setCreateTime(LocalDateTime.now());
            pantSizeVal.setName(pantSize);
            this.attributeValueService.save(pantSizeVal);
        }
    }
}
