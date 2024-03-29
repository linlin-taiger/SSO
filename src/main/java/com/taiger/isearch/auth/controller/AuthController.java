package com.taiger.isearch.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/auth")
public class AuthController {
  @GetMapping(path = "/securityTest", produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<?> securityTest() {
    return ResponseEntity.ok("Pass security test, yeah!");
  }
}
