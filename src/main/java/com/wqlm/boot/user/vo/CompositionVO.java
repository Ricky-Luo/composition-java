package com.wqlm.boot.user.vo;

import lombok.Data;

@Data
public class CompositionVO {
    private Integer id;
    private Integer compostionTypeId;
    private String compostionChineseTitle;
    private String compostionEnglishTitle;
    private String compositionGraphOne;
    private String compositionGraphTwo;
    private String compostionGraphThree;
    private String compostionTypeName;
}
