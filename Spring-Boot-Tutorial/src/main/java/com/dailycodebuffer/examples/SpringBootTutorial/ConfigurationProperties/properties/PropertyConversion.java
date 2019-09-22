package com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@ConfigurationProperties(prefix = "conversion")
public class PropertyConversion {

    private Duration timeInDefaultUnit;
    private Duration timeInNano;

    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeInDays;

    private DataSize sizeInDefaultUnit;

    @DataSizeUnit(DataUnit.GIGABYTES)
    private DataSize sizeInGB;

    private DataSize sizeInTB;

}
