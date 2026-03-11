package com.sau.exception;

import org.springframework.mail.MailException;

public class SpringBootRedditException extends RuntimeException {

    public SpringBootRedditException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringBootRedditException(String exMessage){
        super(exMessage);
    }
}
