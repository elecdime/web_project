package com.firstproject.web.utillty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Commons {
public String GetDateTime(){

    Date logDate = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
    String printMessage = simpleDateFormat.format(logDate);
    return printMessage;

}
}

