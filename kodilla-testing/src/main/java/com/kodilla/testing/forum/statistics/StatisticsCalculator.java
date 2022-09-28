package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averageUsersPosts;
    private double averageUsersComments;
    private double averagePostsComments;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount > 0) {
            averageUsersPosts = (double) postsCount / usersCount;
        }
        if (usersCount > 0) {
            averageUsersComments = (double) commentsCount / usersCount;
        }
        if (postsCount > 0) {
            averagePostsComments = (double) commentsCount / postsCount;
        }
    }

    public String showStatistics() {
        return "usersCount=" + usersCount + ", postsCount=" + postsCount + ", commentsCount=" + commentsCount + ", averageUsersPosts=" + averageUsersPosts + ", averageUsersComments=" + averageUsersComments + ", averagePostsComments=" + averagePostsComments;
    }

}
