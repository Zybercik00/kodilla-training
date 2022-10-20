package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class ForumUser {

    private int userId;
    private String userName;
    private char sex = 'M'/'F';
    private LocalDate birthDate;
    private int postCount;

    public ForumUser(int userId, String userName, char sex, LocalDate birthDate, int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    public int calculateAge (){
        LocalDate currentDate = LocalDate.now();
        if (birthDate != null) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId && sex == forumUser.sex && postCount == forumUser.postCount && Objects.equals(userName, forumUser.userName) && Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, sex, birthDate, postCount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
