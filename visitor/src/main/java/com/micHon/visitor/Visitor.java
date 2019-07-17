package com.micHon.visitor;

import com.micHon.activity.Gym;
import com.micHon.activity.Squash;
import com.micHon.activity.Treadmill;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Gym gym);
}
