package com.wqlm.boot.user.service;

import java.util.List;

import com.wqlm.boot.user.dao.CompositionTopicsMapper;
import com.wqlm.boot.user.po.CompositionTopics;
import com.wqlm.boot.user.po.UserCompostionHistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompositionHistoryService {
    
    @Autowired
    private CompositionTopicsMapper compositionTopicsMapper;

    /**
     * 查询作文题目
     * @param dto
     * @return
     * @throws Exception
     */
    public List<CompositionTopics> getCompositions() throws Exception {
        return compositionTopicsMapper.getCompositionList();
    }

    public List<CompositionTopics> getCompositionsByUser() throws Exception {
        return compositionTopicsMapper.getCompositionsByUser();
    }

    public List<CompositionTopics> getCompositionsTopicsByTypeId(String typeId, int startPosition, int endPosition) throws Exception{
        return compositionTopicsMapper.getCompositionsByTypeId(typeId, startPosition, endPosition);
    }

    public List<CompositionTopics> getCompositionsTopicsById(String Id) throws Exception{
        return compositionTopicsMapper.getCompositionsById(Id);
    }
    public boolean addOrUpdateCompositionContent(UserCompostionHistory userCompostionHistory) throws Exception{
        int result = compositionTopicsMapper.addOrUpdateCompositionContent(userCompostionHistory);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
}


 