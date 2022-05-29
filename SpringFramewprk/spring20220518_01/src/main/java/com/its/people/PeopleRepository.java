package com.its.Repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public void save(String lsh,String sgh){
        sql.insert("count.shadow",lsh);
    }
}
