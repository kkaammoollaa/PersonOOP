package com.company;

import com.company.education.Education;
import com.company.education.University;
import com.company.gender.Gender;
import com.company.gender.Male;
import com.company.information.Information;
import com.company.information.Requierment;
import com.company.work.Student;
import com.company.work.Work;

public class Main {

    public static void main(String[] args) {

        Education education     = new University();
        Gender gender           = new Male();
        Information information = new Requierment();
        Work work               = new Student();

        education.education();
        education.period();
        gender.female();
        information.firstname();
        information.lastname();
        information.address();
        information.phonenumber();
        work.JobName();
        work.JobTitle();
        work.JobAddress();

    }
}
