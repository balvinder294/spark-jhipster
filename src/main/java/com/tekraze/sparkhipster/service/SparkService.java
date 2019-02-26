package com.tekraze.sparkhipster.service;
// import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SparkService{

    @Autowired
    private SparkSession sparkSession;

    // private String CassandraKeyspace = "sparkhipster";

    // private String CassandraTable = "book";

    public void getCount() {
        // Dataset<Row> dataset = sparkSession.read().format("org.apache.spark.sql.cassandra")
        //     .options(new HashMap<String, String>() {
        //         {
        //             put("keyspace", "sparkhipster");
        //             put("table", "user");
        //         }
        //     }).load();

        // dataset.show(); 

        // dataset.createOrReplaceTempView("userstable");
        Dataset<Row> dataset1 = sparkSession.sql("select * from user");
        dataset1.show();
    }

        public void getAllBooks() {
    //         try{
    //         Map<String, String> options = new HashMap<String, String>();
    //         options.put("keyspace", "sparkhipster");
    //         options.put("table", "user");

    //         sparkSession
    //             .read()
    //             .format("org.apache.spark.sql.cassandra")
    //             // .option("keyspace","sparkhipster")
    //             // .option("table", "user")
    //             .options(options)
    //             .load()
    //             // .createTempView("user");
    //             .collect();
            
    //         Dataset<Row> df = sparkSession.sql("select * from user");
    //         df.
    //     }
    //     catch(Exception ex){
    //     ex.printStackTrace();
    // }
    }


}