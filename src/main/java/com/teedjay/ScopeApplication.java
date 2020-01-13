package com.teedjay;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.time.LocalDateTime;

@Named
@ApplicationScoped
public class ScopeApplication {

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
