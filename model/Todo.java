package com.example.personlistbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor @Data
public class Todo {
    private UUID id;
    private String name;
    private  String number;
}