package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;


public class StreamMain {
    public static void main(String[] args) {

        new Forum().getUserList()
                .stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.calculateAge() >= 20)     // operacje nieterminale: filtrujace/transformujace
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(forumUser -> forumUser.getUserId(), forumUser -> forumUser))    // operacja terminalna
                .forEach((k, v) -> System.out.println(k + " - " + v.getUserName()));
//
//        System.out.println("****************************");
//
//        Map<Integer, ForumUser> users1 = new HashMap<>();
//        for (ForumUser forumUser : forum.getUserList()) {
//            if (forumUser.getSex() == 'M' && forumUser.calculateAge() >= 20 && forumUser.getPostCount() > 0) {
//                users1.put(forumUser.getUserId(), forumUser);
//            }
//        }
//        for (Map.Entry<Integer, ForumUser> entry : users1.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getUserName());
//

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println("******************************************************************************************");

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        System.out.println("******************************************************************************************");

        System.out.println("Task with poem beautifier:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("cos", (text) -> text.toUpperCase());
        poemBeautifier.beautify("cos", (text) -> " ABC " + text + " ABC ");
        poemBeautifier.beautify("cos", (text) -> " *** " + text + " *** ");
        poemBeautifier.beautify("cos", (text) -> "!! " + text.toUpperCase() + " !! " + text + " !! " + text.toUpperCase());
        System.out.println("******************************************************************************************");

        People.getList().stream().forEach(System.out::println);

        System.out.println("******************************************************************************************");

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("******************************************************************************************");

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        System.out.println("******************************************************************************************");

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);
        System.out.println("1*****************************************************************************************");
        System.out.println();
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 1)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
    }
}