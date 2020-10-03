package com.abhiram;

import com.abhiram.domain.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello() {
        return "Hello";
    }

    @PostMapping(value = "/example")
    public ResponseEntity create(@RequestBody Example example) {
        LOG.info("Example = {}",example);
        return ResponseEntity.ok(example);
    }
}
