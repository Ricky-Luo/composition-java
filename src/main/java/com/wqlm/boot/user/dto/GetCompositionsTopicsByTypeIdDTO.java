package com.wqlm.boot.user.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GetCompositionsTopicsByTypeIdDTO {

    @NotBlank(message = "类别ID不能为空!")
    private String typeId;

    private int startPosition;

    private int endPosition;

    public String getTypeId() {
        return typeId;
    }
    public int getStartPosition() {
        return startPosition;
    }
    public int getEndPosition() {
        return endPosition;
    }
}
