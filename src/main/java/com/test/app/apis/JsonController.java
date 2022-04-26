package com.test.app.apis;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.domain.DomainBean;

@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin(origins="*")
public class JsonController {

	
    @GetMapping("/data")
    public ArrayList<DomainBean> get() {
         
        ArrayList<DomainBean> arr = new ArrayList<>();
         
        DomainBean userOne = new DomainBean();
        userOne.setId("1");
        userOne.setName("namefirst");
        userOne.setData("datafirst");
         
        DomainBean userTwo = new DomainBean();
        userTwo.setId("2");
        userTwo.setName("namesecond");
        userTwo.setData("datasecond");
         
        arr.add(userOne);
        arr.add(userTwo);
         
        return arr;
    }
    
    @GetMapping("/{id}/{name}/{data}")
    public ResponseEntity<DomainBean> getData(@PathVariable("id") String id,
                             @PathVariable("name") String name,
                                @PathVariable("data") String data) {
         
        DomainBean user = new DomainBean();
        user.setId(id);
        user.setName(name);
        user.setData(data);
         
        HttpHeaders headers = new HttpHeaders();
         
        ResponseEntity<DomainBean> entity = new ResponseEntity<>(user,headers,HttpStatus.CREATED);
         
        return entity;
    }
    
}
