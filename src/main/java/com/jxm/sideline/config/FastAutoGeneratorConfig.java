package com.jxm.sideline.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author jiangyunkai <jiangyunkai@kuaishou.com>
 * Created on 2024-05-26
 */
public class FastAutoGeneratorConfig {

    private static final String TABLE_NAME = "wx_user_info";

    @Value("${spring.datasource.url}")
    private static String DATABASE_URL;
    @Value("${spring.datasource.username}")
    private static String USERNAME;
    @Value("${spring.datasource.password}")
    private static String PASSWORD;

    public static void main(String[] args) {
        // 使用 FastAutoGenerator 快速配置代码生成器
        FastAutoGenerator.create(DATABASE_URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author("jiangyk") // 设置作者
                            .outputDir("src/main/java"); // 输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.jxm.sideline.model") // 设置父包名
                            .entity("DO") // 设置实体类包名
                            .mapper("mapper") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude(TABLE_NAME) // 设置需要生成的表名
                            .entityBuilder()
                            .enableFileOverride()
                            .formatFileName("%sDO") // 重命名
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .serviceBuilder()
                            .formatServiceFileName("%sManager")
                            .formatServiceImplFileName("%sManagerImpl")
                            .enableFileOverride()
                            .mapperBuilder()
                            .enableFileOverride()
                            ;
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .templateConfig(builder -> {
                    builder.disable(TemplateType.CONTROLLER);
                })
                .execute(); // 执行生成
    }
}
