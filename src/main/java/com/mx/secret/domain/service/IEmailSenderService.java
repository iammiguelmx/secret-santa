package com.mx.secret.domain.dto.service;

import com.mx.secret.domain.dto.Mail;

public interface IEmailSenderService {

    void sendEmail(Mail mail, String template);

}