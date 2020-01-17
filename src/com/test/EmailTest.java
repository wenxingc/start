package com.test;




import java.io.InputStream;
import java.util.Date;


public class EmailTest  {
  /*  private JavaMailSenderImpl mailSender;

    public  void sendMail() throws Exception {


        InputStream in = EmailTest.class.getClassLoader().getResourceAsStream("config/conf/mail.properties");
        mailSender = new JavaMailSenderImpl();
        // 设置参数
        mailSender.setHost("smtp.isoftstone.com");
        mailSender.setUsername("xingwenc");
        mailSender.setPassword("");
        mailSender.setDefaultEncoding("UTF-8");
        mailSender.setPort(25);
        mailSender.setProtocol("smtp");



        MimeMessageHelper helper=new MimeMessageHelper(mailSender.createMimeMessage());

        helper.setFrom("xingwenc@isoftstone.com");
        helper.setSubject("测试");
        helper.setText("测试测试内容", true);
        helper.setTo("@163.com");
        helper.setValidateAddresses(true);
        helper.setSentDate(new Date());

        mailSender.send(helper.getMimeMessage());
        System.out.println("发送邮件完成");
         }
*/


  /*  public static void main(String[] args) throws Exception {
        EmailTest t = new EmailTest();
        t.sendMail();
    }*/


}
