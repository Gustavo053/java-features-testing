package org.example.dto;

public record TestRecord(String messageTest, String otherMessageTest) {

    public TestRecord(String messageTest) {
        this(messageTest, "default message");
    }
}
