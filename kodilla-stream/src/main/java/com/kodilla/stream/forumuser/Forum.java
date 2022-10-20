package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public final List<ForumUser> usersList = new ArrayList<ForumUser>();
        public Forum() {
            usersList.add(new ForumUser(007, "James Bond", 'M', LocalDate.of(1970, 7, 27), 174));
            usersList.add(new ForumUser(001, "Jan Kowalski", 'M', LocalDate.of(1972, 7, 7), 274));
            usersList.add(new ForumUser(002, "Halina Nowak", 'F', LocalDate.of(1980, 4, 25), 0));
            usersList.add(new ForumUser(003, "Janusz Random", 'M', LocalDate.of(2007, 5, 12), 1004));
            usersList.add(new ForumUser(166, "Dracula", 'M', LocalDate.of(1690, 5, 12), 1000000));
        }

        public List<ForumUser> getUserList() {
            return new ArrayList<>(usersList);
        }

}
