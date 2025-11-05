package com.ran.two;

import java.lang.annotation.Retention;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class testStudentAndUndergraduate {


    public static void main(String[] args) {
        Student student = new Student("小明",13);

        student.show();

        Undergraduate undergraduate = new Undergraduate("小红",14,"大学");

        undergraduate.show();
    }



}
