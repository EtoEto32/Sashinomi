package com.hackathon.Form;

import java.time.LocalDateTime;

public class ChatForm {
    
    /** ユーザー名 */
    private String name;

    /**  内容　*/
    private String message;

    /**  送信時間*/
    private LocalDateTime sendTime;

    /**
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 送信時間を返します。
     * @return
     */
    public LocalDateTime getSendTime() {
        return sendTime;
    }

    /**
     * 
     * @param sendTime
     */
    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }


}
