
package generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import java.util.function.Consumer;

import static org.junit.Assert.assertTrue;

/**
 * mybatis-plus 代码生成器
 *
 * @author 林选伟
 * @date 2021/8/26 4:27 下午
 */
public class MybatisPlusGeneratorTest {

    private static final String PACKAGE_NAME = "x.trident.modular";
    private static final String OUTPUT_DIR = "src\\main\\java\\";

    private static final String JDBC_URL = "jdbc:mysql://121.5.76.153:3306/Ihf_dev?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "dba";
    private static final String DB_PASSWORD = "Ihf545586@";

    /**
     * 生成mybatis-plus代码段
     */
    @Test
    public void mybatisPlusGeneratorTest() {
        assertTrue(StringUtils.contains(JDBC_URL, "jdbc:"));

        FastAutoGenerator.create(new DataSourceConfig.Builder(JDBC_URL, DB_USER, DB_PASSWORD)
                .dbQuery(new MySqlQuery())
                .typeConvert(new MySqlTypeConvert())
                .keyWordsHandler(new MySqlKeyWordsHandler()))
                .globalConfig(globalConfigConsumer())
                .packageConfig(packageConfigConsumer())
                .strategyConfig(strategyConfigConsumer())
                .templateConfig(builder -> builder.controller(""))
                .execute();

    }


    /**
     * 全局配置
     *
     * @return Consumer
     */
    private Consumer<com.baomidou.mybatisplus.generator.config.GlobalConfig.Builder> globalConfigConsumer() {
        return builder -> {
            builder.author(System.getProperty("user.name"))
                    .dateType(DateType.TIME_PACK)
                    .commentDate("yyyy-MM-dd hh:mm:ss")
                    .outputDir(OUTPUT_DIR)
                    .enableSwagger();
        };
    }


    /**
     * 包配置
     *
     * @return Consumer
     */
    private Consumer<com.baomidou.mybatisplus.generator.config.PackageConfig.Builder> packageConfigConsumer() {
        return builder -> {
            // 设置父包名
            builder.parent(PACKAGE_NAME)
                    .moduleName("mybatis") // 设置父包模块名
                    .entity("entity")
                    .service("service")
                    .serviceImpl("service.impl")
                    .mapper("mapper")
                    .xml("mapper.xml");
        };
    }


    /**
     * 策略配置
     *
     * @return Consumer
     */
    private Consumer<com.baomidou.mybatisplus.generator.config.StrategyConfig.Builder> strategyConfigConsumer() {
        return builder -> {
            // 设置实体类策略
            builder.entityBuilder()
                    // 开启链式模型
                    .enableChainModel()
                    // 开启lombok
                    .enableLombok()
                    // 移除boolean的is前缀
                    .enableRemoveIsPrefix()
                    // 从数据库中生成字段注解
                    .enableTableFieldAnnotation()
                    // 全局id策略
                    .idType(IdType.AUTO)
                    // 乐观锁字段名
                    .versionColumnName("version")
                    // 逻辑删除字段名
                    .logicDeleteColumnName("delete_flag")
                    // 逻辑删除属性名
                    .logicDeletePropertyName("deleteFlag")
                    // 命名规则下划线转驼峰
                    .naming(NamingStrategy.underline_to_camel)
                    // 数据库表字段映射到实体的命名策略
                    .columnNaming(NamingStrategy.underline_to_camel)
                    // 设置表字段自动填充
                    .addTableFills(new Column("created_at", FieldFill.INSERT))
                    .addTableFills(new Column("updated_at", FieldFill.INSERT_UPDATE));

            // mapper 生成策略
            builder.mapperBuilder()
                    // 开启@Mapper注解
                    .enableMapperAnnotation();

            // service 生成策略
            builder.serviceBuilder()
                    .formatServiceFileName("%sService")
                    .formatServiceImplFileName("%sServiceImpl");

        };
    }

}

