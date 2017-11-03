package com.jeesample.oracle;


import com.jeesample.cloud.Cloud;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class Oracle {

    public List<Cloud> getClouds(){
        return new Arrays.asList(new Cloud("database", 1), new Cloud("artificial_intelligence", 2));
    }
}
