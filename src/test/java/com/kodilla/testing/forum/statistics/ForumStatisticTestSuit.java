package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class ForumStatisticTestSuit {

    @Mock
    private Statistics statistics;

    @Test
    void testcalculateAdvStatisticsWhenPostsCountIs0() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.postsCount()).thenReturn(0);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 0 + ", postsCount=" + 0 + ", commentsCount=" + 0 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 0.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenPostsCountIs1000() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.postsCount()).thenReturn(1000);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 0 + ", postsCount=" + 1000 + ", commentsCount=" + 0 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 0.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenCommentsCountIs0() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.commentsCount()).thenReturn(0);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 0 + ", postsCount=" + 0 + ", commentsCount=" + 0 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 0.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenCommentsCountLowerThanPostCount() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.commentsCount()).thenReturn(5);
        when(statistics.postsCount()).thenReturn(10);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 0 + ", postsCount=" + 10 + ", commentsCount=" + 5 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 0.5 , statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenPostCountLowerThanCommentsCount() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(5);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 0 + ", postsCount=" + 5 + ", commentsCount=" + 10 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 2.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenUsersCountIs0() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.usersNames()).thenReturn(Arrays.asList());

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 0 + ", postsCount=" + 0 + ", commentsCount=" + 0 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 0.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenUsersCountIs100() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.usersNames()).thenReturn(generateUsers(100));

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 100 + ", postsCount=" + 0 + ", commentsCount=" + 0 + ", averageUsersPosts=" + 0.0 + ", averageUsersComments=" + 0.0 + ", averagePostsComments=" + 0.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWorks() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.usersNames()).thenReturn(generateUsers(30));
        when(statistics.postsCount()).thenReturn(60);
        when(statistics.commentsCount()).thenReturn(120);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 30 + ", postsCount=" + 60 + ", commentsCount=" + 120 + ", averageUsersPosts=" + 2.0 + ", averageUsersComments=" + 4.0 + ", averagePostsComments=" + 2.0, statisticsCalculator.showStatistics());
    }

    @Test
    void testcalculateAdvStatisticsWhenUsersMoreThanPostsAndComments() {
        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        when(statistics.usersNames()).thenReturn(generateUsers(180));
        when(statistics.postsCount()).thenReturn(60);
        when(statistics.commentsCount()).thenReturn(120);

        //When
        statisticsCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals("usersCount=" + 180 + ", postsCount=" + 60 + ", commentsCount=" + 120 + ", averageUsersPosts=" + 0.3333333333333333 + ", averageUsersComments=" + 0.6666666666666666 + ", averagePostsComments=" + 2.0, statisticsCalculator.showStatistics());
    }



    private List<String> generateUsers(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add("User " + i);
        }
        return result;
    }
}
