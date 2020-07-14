package com.tyschool.impl;

import com.tyschool.interfaces.Formatter;

public class DefaultFormatter implements Formatter {
    @Override
    public String format(Object obj) {
        return String.valueOf(obj);
    }
}
