package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @Author: LvFang
 * @Date: Created in 2019/6/11.
 * @Description:
 */
public class MyBatisPlusCodeGenerator {

    //包名
    public static final String PACKAGE_NAME = "com.lvfang.mybatisplus.test";

    public static void main(String[] args) {
//        String[] tables = new String[] {"tableName01"};//表名数组
//        String[] tables = new String[] {"t_1","t_2"};//表名数组
        String[] tables = new String[] {
        		"t_t1",
        		"t_t2"
//        		"t_agency_order",
//        		"t_agency_order_pay_record",
//        		"t_basic_app_version",
//        		"t_basic_app_version_language",
//        		"t_basic_component_position",
//        		"t_basic_directory",
//        		"t_basic_directory_language",
//        		"t_basic_language",
//        		"t_chinese_character",
//        		"t_chinese_character_classify",
//        		"t_chinese_character_classify_language",
//        		"t_chinese_character_classify_relation",
//        		"t_chinese_character_component_position",
//        		"t_chinese_character_language",
//        		"t_chinese_character_new_classify",
//        		"t_chinese_character_new_classify_language",
//        		"t_chinese_character_new_classify_relation",
//        		"t_chinese_character_new_component_position",
//        		"t_chinese_character_new_fixed_term",
//        		"t_chinese_character_new_fixed_term_basic_category",
//        		"t_chinese_character_new_fixed_term_basic_field",
//        		"t_chinese_character_new_fixed_term_language",
//        		"t_chinese_character_new_z_zhubiao",
//        		"t_chinese_character_new_z_zibiao_language",
//        		"t_chinese_find_character",
//        		"t_commission_record",
//        		"t_commission_setting",
//        		"t_commission_setting_language",
//        		"t_commission_withdrawal",
//        		"t_component",
//        		"t_component_language",
//        		"t_directory_order",
//        		"t_directory_order_pay_record",
//        		"t_mail_send",
//        		"t_mail_send_language",
//        		"t_member_order",
//        		"t_member_order_pay_record",
//        		"t_member_upgrade",
//        		"t_member_upgrade_language",
//        		"t_pinyin",
//        		"t_pinyin_initial",
//        		"t_pinyin_vowel",
//        		"t_strokes",
//        		"t_strokes_language",
//        		"t_third_party",
//        		"t_third_party_language",
//        		"t_user",
//        		"t_user_collect",
//        		"t_user_income",
//        		"t_user_learn",
//        		"t_user_search",
//        		"t_user_search_hot"
        		
        };//表名数组
        String[] tablePrefixs = new String[] {"APP_","t_"};
        executeCode(PACKAGE_NAME,tables,tablePrefixs);
    }

    private static void executeCode(String pack,String[] tables,String[] tablePrefixs) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 是否覆盖已有文件
        gc.setFileOverride(true);
        // 生成文件的输出目录
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        //设置bean命名规范
//        gc.setEntityName("%sModel");  // 直接生成對象，不帶model
        gc.setEntityName("%s");
        // 开发人员
        gc.setAuthor("Lvfang");
        // 是否打开输出目录
        gc.setOpen(false);
        // 开启 BaseResultMap
        gc.setBaseResultMap(true);
        // 指定生成的主键的ID类型
        gc.setIdType(IdType.ID_WORKER);
        // 时间类型对应策略: 只使用 java.util.date 代替
        gc.setDateType(DateType.ONLY_DATE);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig config= new DataSourceConfig();
        // 从试图获取
        config.setUrl("jdbc:mysql://8.210.212.227:3306/ry-vue");
        config.setDriverName("com.mysql.jdbc.Driver");
        config.setUsername("root");
        config.setPassword("123456AaAa");
        mpg.setDataSource(config);

        // 包配置
        PackageConfig pc = new PackageConfig();
        // 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
        pc.setParent(pack);
        // Entity包名
        pc.setEntity("model");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                if (StringUtils.isEmpty(pc.getModuleName())) {
                    return projectPath + "/src/main/resources/mapper/business/" + tableInfo.getXmlName() + StringPool.DOT_XML;
                }else {
                    return projectPath + "/src/main/resources/mapper/business/" + pc.getModuleName() + "/" + tableInfo.getXmlName() + StringPool.DOT_XML;
                }
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 数据库表映射到实体的命名策略: 下划线转驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 数据库表字段映射到实体的命名策略: 下划线转驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 【实体】是否为lombok模型（默认 false）
        strategy.setEntityLombokModel(true);
        // 需要包含的表名，允许正则表达式（与exclude二选一配置）
        strategy.setInclude(tables);
        // 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        // 表前缀
        strategy.setTablePrefix(tablePrefixs);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}