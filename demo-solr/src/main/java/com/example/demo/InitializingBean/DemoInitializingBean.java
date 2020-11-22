package com.example.demo.InitializingBean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoInitializingBean implements InitializingBean
{
    @Override
    public void afterPropertiesSet() throws Exception
    {
        log.info("init some data");

    }
}
