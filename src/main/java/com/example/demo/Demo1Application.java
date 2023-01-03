package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Application {
    @GetMapping("/")
    public String start() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return """
                Имя ученика: Обухов Дамир Андреевич,
                Название проекта: Web-development_Part2,
                Дата создания проекта: 03.01.2023 г.,
                Описание проекта в свободной форме: проект создан для выполнения домашнего задания. Реализуется с помощью сборщика Maven и набора инструментов Framework. Язык - Java""";
    }
}