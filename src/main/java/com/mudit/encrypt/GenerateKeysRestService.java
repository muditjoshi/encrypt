package com.mudit.encrypt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateKeysRestService {

    @RequestMapping(value = "/generateKeys", method = RequestMethod.GET)
    public String generateKeys(@RequestParam(value = "onePassword") String onePassword){

        GenerateKeys.generateKeys(onePassword);
        return "Success";
    }
}
