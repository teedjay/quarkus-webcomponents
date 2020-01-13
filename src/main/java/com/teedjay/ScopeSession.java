package com.teedjay;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDateTime;

@Named
@SessionScoped
public class ScopeSession implements Serializable {

    public String timstamp = LocalDateTime.now().toString();
    public String message = "I'm the request scoped bean";

    public String getDebug() {
        return "ScopeApplication{" +
            "timstamp='" + timstamp + '\'' +
            ", message='" + message + '\'' +
            ", debug='" + this.toString() + '\'' +
            '}';
    }

}
