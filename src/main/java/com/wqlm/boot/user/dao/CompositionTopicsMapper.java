package com.wqlm.boot.user.dao;

import java.util.List;

import com.wqlm.boot.user.po.CompositionTopics;
import com.wqlm.boot.user.po.UserCompostionHistory;

import tk.mybatis.mapper.common.Mapper;

public interface CompositionTopicsMapper extends Mapper<CompositionTopics> {
    //获取用户名单
    public List<CompositionTopics> getCompositionList() throws Exception;
    public List<CompositionTopics> getCompositionsByUser() throws Exception;
    public List<CompositionTopics> getCompositionsByTypeId(String typeId, int startPosition, int endPosition) throws Exception;
    public List<CompositionTopics> getCompositionsById(String Id) throws Exception;
    public int addOrUpdateCompositionContent(UserCompostionHistory userCompostionHistory) throws Exception;
}