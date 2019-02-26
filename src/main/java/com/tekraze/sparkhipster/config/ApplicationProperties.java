package com.tekraze.sparkhipster.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.apache.spark.sql.SparkSession;

/**
 * Properties specific to Sparkhipster.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private static Logger log = LoggerFactory.getLogger(ApplicationProperties.class.getName());

    @Value("${application.spark.master}")
    private String sparkMaster; // = "spark://192.168.31.221:7077";

    @Value("${spring.data.cassandra.keyspace-name}")
    private String cassandraKeyspace;   // = "sparkhipster";

    @Value("${spring.data.cassandra.contact-points}")
    private String cassandraHost;   // = "localhost";

    @Value("${spring.data.cassandra.port}")
    private String cassandraPort;   // = "9042";

    @Bean
    public SparkConf sparkConf() {
        SparkConf conf = new SparkConf(true)
            .set("spark.cassandra.connection.host", cassandraHost)
            .set("spark.cassandra.connection.port", cassandraPort)
            .setMaster(sparkMaster)
            .set("spark.driver.allowMultipleContexts", "true")
            .setAppName("sparkHipster");
        System.out.println("SparkConf"+conf.isTraceEnabled());
        return conf;
    }

    @Bean
    public JavaSparkContext javaSparkContext() {
        log.info("Connecting to spark with master Url: {}, and cassandra host: {}",
            sparkMaster, cassandraHost);

        JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf());

        log.debug("spark context created");

        return javaSparkContext;
    }


    @Bean
    public SparkSession sparkSession() {
        return SparkSession
            .builder()
            .config(sparkConf())
            .sparkContext(javaSparkContext().sc())
            .appName("SparkConfiguration")
            .getOrCreate();

    }


}
