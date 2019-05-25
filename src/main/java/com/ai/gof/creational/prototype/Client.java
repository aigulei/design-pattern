package com.ai.gof.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("原始的Mail"+mail);
        for(int i = 0;i<10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name"+i);
            mailTemp.setEmailAddress("name"+i+"@sina.com");
            mailTemp.setContent("恭喜您，获奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mail"+mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
