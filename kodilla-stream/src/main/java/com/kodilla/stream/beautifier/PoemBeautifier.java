package com.kodilla.stream.beautifier;

import org.aopalliance.intercept.MethodInterceptor;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
