package com.micHon;

import com.micHon.activity.Activity;
import com.micHon.activity.Gym;
import com.micHon.activity.Squash;
import com.micHon.activity.Treadmill;
import com.micHon.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(1000);
        Squash squash = new Squash(60);
        Gym gym = new Gym(500);

        final VisitorImpl visitor = new VisitorImpl();

        List<Activity> activityList = Arrays.asList(treadmill, gym, squash);
        activityList.forEach(activity -> activity.accept(visitor));
    }
}
