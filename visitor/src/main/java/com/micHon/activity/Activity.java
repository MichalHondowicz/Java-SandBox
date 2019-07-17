package com.micHon.activity;

import com.micHon.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
