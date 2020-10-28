package com.firstproject.web.mappers;

import com.firstproject.web.models.indexlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface Admin_Mapper {
    @Select("Select * from indexlog")
     List<indexlog> SelectIndexlog();
}
