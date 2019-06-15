package com.ai.gof.behavioral.command;

public class Client {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式课程");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();

    }
}
