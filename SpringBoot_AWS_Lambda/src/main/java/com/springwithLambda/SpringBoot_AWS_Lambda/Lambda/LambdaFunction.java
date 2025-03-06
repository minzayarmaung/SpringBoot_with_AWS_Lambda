package com.springwithLambda.SpringBoot_AWS_Lambda.Lambda;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LambdaFunction implements Function<String , String> {
    @Override
    public String apply(String input) {
        return "Hello from Lambda, " + input;
    }
}
