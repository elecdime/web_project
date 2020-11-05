package com.firstproject.web.apis;

import com.firstproject.web.repository.Mapper_Admin;
import com.firstproject.web.models.indexlog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class API_Controllers {

    private final Mapper_Admin _mapperAdmin;

    public API_Controllers(Mapper_Admin _mapperAdmin){
        this._mapperAdmin = _mapperAdmin;
    }

    @GetMapping("/api/view")
    public List<indexlog> log(){
        List<indexlog> result = _mapperAdmin.SelectIndexlog();
        return result;
    }
}
