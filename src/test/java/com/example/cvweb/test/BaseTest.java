package com.example.cvweb.test;


import com.example.cvweb.config.SelenideConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Epic("Тестирование WEB приложений")
@Feature("Тестирование WEB")
public abstract class BaseTest {

    //Добавить java faker
    @Autowired
    SelenideConfig selenideConfig;

}
