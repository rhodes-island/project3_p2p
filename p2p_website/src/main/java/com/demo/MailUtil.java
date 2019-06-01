package com.demo;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by huangzhenyang on 2017/8/15.
 */
public class MailUtil {
    // Spring的邮件工具类，实现了MailSender和JavaMailSender接口
    private JavaMailSenderImpl mailSender;
    private Properties p;
    private int timeout = 25000;
    private String subject = "Grade·Inform";
    private StringBuilder content;

    private void initMail(JavaMailSenderImpl mailSender, Properties p){
        // 设置参数
        mailSender.setHost("smtp.163.com");
        mailSender.setUsername("xxx@163.com"); //你的邮箱
        mailSender.setPassword("xxx"); //密码，这里必须先在网易邮箱里开启smtp服务
        //设置property
        p.put("userName","jobbridge@163.com");
        p.setProperty("mail.smtp.timeout",timeout+"");
        p.setProperty("mail.smtp.auth","true");
        mailSender.setJavaMailProperties(p);
        //设置内容格式
        content.append("<body>");
        content.append("<span style=\"font-size:15px\">Hi. This is the New Grade·Inform.</span>");
        content.append("<hr>");
        //简单版本
        /*String text;
        for (Grade grade:arrayList) {
            text = "";
            text += grade.toString();
            content.append(text);
            content.append("<br>");
        }*/
        //表格版本
        content.append("<table>");
            content.append("<thead>");
                content.append("<tr>");
                content.append("<th>课程名</th>");
                content.append("<th>分数</th>");
                content.append("<th>绩点</th>");
                content.append("<th>学分</th>");
                content.append("<th>属性</th>");
                content.append("</tr>");
            content.append("</thead>");
            content.append("<tbody>");
               /* for (Grade grade: arrayList) {
                    content.append("<tr>");
                        content.append("<td style=\"text-align:center\">"+grade.getCourseName()+"</td>");
                        content.append("<td>"+grade.getScore()+"</td>");
                        content.append("<td>"+grade.getGpa()+"</td>");
                        content.append("<td>"+grade.getCredit()+"</td>");
                        content.append("<td>"+grade.getAttribute()+"</td>");
                    content.append("</tr>");
                }
            content.append("</tbody>");*/
        content.append("</table>");

        content.append("<hr>");
        content.append("<span style=\"font-size:17px\">Thank you! </span></body>");
    }

    /**
     *
     * @param recipient 收件人
     *
     *
     */

    public void send(String recipient) throws MessagingException {
        // 构建简单邮件对象，见名知意
        MimeMessage msg = mailSender.createMimeMessage();
        // *** 关键 ***
        msg.addRecipients(MimeMessage.RecipientType.CC, InternetAddress.parse(p.getProperty("userName")));
        MimeMessageHelper helper = new MimeMessageHelper(msg,true,"utf-8");
        // 设定邮件参数
        helper.setFrom(mailSender.getUsername());
        helper.setTo(recipient);
        helper.setSubject(subject);
        helper.setText(content.toString(),true);
        System.out.println(">>> content:  "+content);
        // 发送邮件
        mailSender.send(msg);
    }

}
