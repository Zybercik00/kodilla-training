package com.kodilla.patterns.strategy.social;

public class User {

    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        String result = socialPublisher.share();
        System.out.println(result);
        return result;

    }

    public void setSocialPublishing(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
