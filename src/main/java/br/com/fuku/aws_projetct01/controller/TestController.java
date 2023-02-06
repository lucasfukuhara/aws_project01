package br.com.fuku.aws_projetct01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> getDogName(@PathVariable String name) {
        LOG.info("Dog name: {}", name);
        return ResponseEntity.ok(String.format("Dog Name -> %s", name));
    }

    @GetMapping("/dogAge/{name}/{age}")
    public ResponseEntity<?> getDogAge(@PathVariable String name, @PathVariable int age) {
        LOG.info("Calculate dog age for {}", name);
        return ResponseEntity.ok(String.format("Dog Name -> %s\n" +
                "Dog age -> %s", name, age * 7));
    }

}
