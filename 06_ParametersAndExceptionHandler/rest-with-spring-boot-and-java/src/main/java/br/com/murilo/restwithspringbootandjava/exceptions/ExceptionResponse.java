package br.com.murilo.restwithspringbootandjava.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public final class ExceptionResponse implements Serializable {


    @Serial
    private static final long serialVersionUID = 4472470488909870376L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
