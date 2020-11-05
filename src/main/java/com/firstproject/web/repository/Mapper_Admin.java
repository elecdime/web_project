package com.firstproject.web.repository;

import com.firstproject.web.models.indexlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface Mapper_Admin {
    @Select("Select * from indexlog")
     List<indexlog> SelectIndexlog();
}
