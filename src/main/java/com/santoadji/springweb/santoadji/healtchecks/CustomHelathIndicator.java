package com.santoadji.springweb.santoadji.healtchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class CustomHelathIndicator implements HealthIndicator {

    @Override
    public Health health(){
        boolean error=true;

        if(error){
            return Health.down().withDetail("Error Key", 123).build();
        }
        return Health.up().build();
    }
}
