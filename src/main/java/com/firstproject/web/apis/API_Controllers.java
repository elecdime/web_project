package com.firstproject.web.apis;

import com.firstproject.web.mappers.Admin_Mapper;
import com.firstproject.web.models.indexlog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class API_Controllers {

    private final Admin_Mapper admin_mapper;

    public API_Controllers(Admin_Mapper admin_mapper){
        this.admin_mapper = admin_mapper;
    }

    @GetMapping("/api/view")
    public List<indexlog> log(){
        List<indexlog> result = admin_mapper.SelectIndexlog();
        return result;
    }
}
