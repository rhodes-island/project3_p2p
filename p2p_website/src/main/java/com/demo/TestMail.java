package com.demo;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestMail {
	 // 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
    // PS: 某些邮箱服务器为了增加邮箱本身密码的安全性，给 SMTP 客户端设置了独立密码（有的邮箱称为“授权码”）,
    //     对于开启了独立密码的邮箱, 这里的邮箱密码必需使用这个独立密码（授权码）。
    public static String myEmailAccount = "lboh583165647@163.com";
    public static String myEmailPassword = "qweaz987123";
 
    // 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般(只是一般, 绝非绝对)格式为: smtp.xxx.com
    // 网易126邮箱的 SMTP 服务器地址为: smtp.126.com
    public static String myEmailSMTPHost = "smtp.163.com";
 
    // 收件人邮箱（替换为自己知道的有效邮箱）963661303
    public static String receiveMailAccount = "583165647@qq.com";
 
    public static void main(String[] args) throws Exception {
        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证
 
        // PS: 某些邮箱服务器要求 SMTP 连接需要使用 SSL 安全认证 (为了提高安全性, 邮箱支持SSL连接, 也可以自己开启),
        //     如果无法连接邮件服务器, 仔细查看控制台打印的 log, 如果有有类似 “连接失败, 要求 SSL 安全连接” 等错误,
        //     取消下面 /* ... */ 之间的注释代码, 开启 SSL 安全连接。
        /*
        // SMTP 服务器的端口 (非 SSL 连接的端口一般默认为 25, 可以不添加, 如果开启了 SSL 连接,
        //                  需要改为对应邮箱的 SMTP 服务器的端口, 具体可查看对应邮箱服务的帮助,
        //                  QQ邮箱的SMTP(SLL)端口为465或587, 其他邮箱自行去查看)
        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        */
 
        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        // 设置为debug模式, 可以查看详细的发送 log
        session.setDebug(true);
 
        // 3. 创建一封邮件
        MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount);
 
        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();
 
        // 5. 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则报错
        //
        //    PS_01: 如果连接服务器失败, 都会在控制台输出相应失败原因的log。
        //    仔细查看失败原因, 有些邮箱服务器会返回错误码或查看错误类型的链接,
        //    根据给出的错误类型到对应邮件服务器的帮助网站上查看具体失败原因。
        //
        //    PS_02: 连接失败的原因通常为以下几点, 仔细检查代码:
        //           (1) 邮箱没有开启 SMTP 服务;
        //           (2) 邮箱密码错误, 例如某些邮箱开启了独立密码;
        //           (3) 邮箱服务器要求必须要使用 SSL 安全连接;
        //           (4) 请求过于频繁或其他原因, 被邮件服务器拒绝服务;
        //           (5) 如果以上几点都确定无误, 到邮件服务器网站查找帮助。
        //
        transport.connect(myEmailAccount, myEmailPassword);
 
        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
 
        // 7. 关闭连接
        transport.close();
    }
 
    /**
     * 创建一封只包含文本的简单邮件
     *
     * @param session     和服务器交互的会话
     * @param sendMail    发件人邮箱
     * @param receiveMail 收件人邮箱
     * @return
     * @throws Exception
     */
    public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);
 
        // 2. From: 发件人
        message.setFrom(new InternetAddress(sendMail, "用户1", "UTF-8"));
       // Address a[] = { new InternetAddress(myEmailAccount, "XX用户", "UTF-8"),new InternetAddress(receiveMail, "XX用户", "UTF-8")};
        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
        //1.正常发送是 To2.密送是 BlindCopyTo(保留域)3.抄送是 CopyTo(保留域)
        message.setRecipient(MimeMessage.RecipientType.CC,new InternetAddress(receiveMail, "尊敬的123", "UTF-8"));
 
        // 4. Subject: 邮件主题
        message.setSubject("主题", "UTF-8");
 
        // 5. Content: 邮件正文（可以使用html标签）
        message.setContent("内容", "text/html;charset=UTF-8");
            // 6. 设置发件时间
        message.setSentDate(new Date());
 
        // 7. 保存设置
        message.saveChanges();
 
        return message;
    }

    /**
     * 网易退信代码：

　•421 HL:REP 该IP发送行为异常，存在接收者大量不存在情况，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并核对发送列表有效性；
　　•421 HL:ICC 该IP同时并发连接数过大，超过了网易的限制，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并降低IP并发连接数量；
　　•421 HL:IFC 该IP短期内发送了大量信件，超过了网易的限制，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并降低发送频率；
　　•421 HL:MEP 该IP发送行为异常，存在大量伪造发送域域名行为，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并使用真实有效的域名发送；
　　•450 MI:CEL 发送方出现过多的错误指令。请检查发信程序；
　　•450 MI:DMC 当前连接发送的邮件数量超出限制。请减少每次连接中投递的邮件数量；
　　•450 MI:CCL 发送方发送超出正常的指令数量。请检查发信程序；
　　•450 RP:DRC 当前连接发送的收件人数量超出限制。请控制每次连接投递的邮件数量；
　　•450 RP:CCL 发送方发送超出正常的指令数量。请检查发信程序；
　　•450 DT:RBL 发信IP位于一个或多个RBL里。请参考http://www.rbls.org/关于RBL的相关信息；
　　•450 WM:BLI 该IP不在网易允许的发送地址列表里；
　　•450 WM:BLU 此用户不在网易允许的发信用户列表里；
　　•451 DT:SPM ,please try again 邮件正文带有垃圾邮件特征或发送环境缺乏规范性，被临时拒收。请保持邮件队列，两分钟后重投邮件。需调整邮件内容或优化发送环境；
　　•451 Requested mail action not taken: too much fail authentication 登录失败次数过多，被临时禁止登录。请检查密码与帐号验证设置；
　　•451 RP:CEL 发送方出现过多的错误指令。请检查发信程序；
　　•451 MI:DMC 当前连接发送的邮件数量超出限制。请控制每次连接中投递的邮件数量；
　　•451 MI:SFQ 发信人在15分钟内的发信数量超过限制，请控制发信频率；
　　•451 RP:QRC 发信方短期内累计的收件人数量超过限制，该发件人被临时禁止发信。请降低该用户发信频率；
　　•451 Requested action aborted: local error in processing 系统暂时出现故障，请稍后再次尝试发送；
　　•500 Error: bad syntaxU 发送的smtp命令语法有误；
　　•550 MI:NHD HELO命令不允许为空；
　　•550 MI:IMF 发信人电子邮件地址不合规范。请参考http://www.rfc-editor.org/关于电子邮件规范的定义；
　　•550 MI:SPF 发信IP未被发送域的SPF许可。请参考http://www.openspf.org/关于SPF规范的定义；
　　•550 MI:DMA 该邮件未被发信域的DMARC许可。请参考http://dmarc.org/关于DMARC规范的定义；
　　•550 MI:STC 发件人当天的连接数量超出了限定数量，当天不再接受该发件人的邮件。请控制连接次数；
　　•550 RP:FRL 网易邮箱不开放匿名转发（Open relay）；
　　•550 RP:RCL 群发收件人数量超过了限额，请减少每封邮件的收件人数量；
　　•550 RP:TRC 发件人当天内累计的收件人数量超过限制，当天不再接受该发件人的邮件。请降低该用户发信频率；
　　•550 DT:SPM 邮件正文带有很多垃圾邮件特征或发送环境缺乏规范性。需调整邮件内容或优化发送环境；
　　•550 Invalid User 请求的用户不存在；
　　•550 User in blacklist 该用户不被允许给网易用户发信；
　　•550 User suspended 请求的用户处于禁用或者冻结状态；
　　•550 Requested mail action not taken: too much recipient  群发数量超过了限额；
　　•552 Illegal Attachment 不允许发送该类型的附件，包括以.uu .pif .scr .mim .hqx .bhx .cmd .vbs .bat .com .vbe .vb .js .wsh等结尾的附件；
　　•552 Requested mail action aborted: exceeded mailsize limit 发送的信件大小超过了网易邮箱允许接收的最大限制；
　　•553 Requested action not taken: NULL sender is not allowed 不允许发件人为空，请使用真实发件人发送；
　　•553 Requested action not taken: Local user only  SMTP类型的机器只允许发信人是本站用户；
　　•553 Requested action not taken: no smtp MX only  MX类型的机器不允许发信人是本站用户；
　　•553 authentication is required  SMTP需要身份验证，请检查客户端设置；
　　•554 DT:SPM 发送的邮件内容包含了未被许可的信息，或被系统识别为垃圾邮件。请检查是否有用户发送病毒或者垃圾邮件；
　　•554 DT:SUM 信封发件人和信头发件人不匹配；
　　•554 IP is rejected, smtp auth error limit exceed 该IP验证失败次数过多，被临时禁止连接。请检查验证信息设置；
　　•554 HL:IHU 发信IP因发送垃圾邮件或存在异常的连接行为，被暂时挂起。请检测发信IP在历史上的发信情况和发信程序是否存在异常；
　　•554 HL:IPB 该IP不在网易允许的发送地址列表里；
　　•554 MI:STC 发件人当天内累计邮件数量超过限制，当天不再接受该发件人的投信。请降低发信频率；
　　•554 MI:SPB 此用户不在网易允许的发信用户列表里；
　　•554 IP in blacklist 该IP不在网易允许的发送地址列表里。
--------------------- 
作者：JavaDynamic 
来源：CSDN 
原文：https://blog.csdn.net/qbg19881206/article/details/8699597 
版权声明：本文为博主原创文章，转载请附上博文链接！
     */
}
