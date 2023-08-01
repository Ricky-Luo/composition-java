package com.wqlm.boot.user.controller;

import com.wqlm.boot.user.vo.result.FailResult;
import com.wqlm.boot.user.vo.result.Result;
import com.wqlm.boot.user.vo.result.SuccessResult;
import com.wqlm.boot.user.dto.GetCompositionsTopicsByTypeIdDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.wqlm.boot.user.service.CompositionService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
// import javax.validation.constraints.NotNull;

import com.wqlm.boot.user.po.UserCompostionHistory;
 
@RestController
@RequestMapping("/composition")
@Validated
public class CompositionController {
    

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CompositionService compositionService;

    @PostMapping("getCompositionList")
    public Result getCompositionList() {
        try {
            List compositionList = compositionService.getCompositions();
            return new SuccessResult<>(compositionList);
        } catch (Exception e) {
            System.out.println(e);
            return new FailResult<>();
        } 
    }
    @PostMapping("getCompositionsByUser")
    public Result getCompositionsByUser() {
        try {
            List compositionList = compositionService.getCompositionsByUser();
            return new SuccessResult<>(compositionList);
        } catch (Exception e) {
            System.out.println(e);
            return new FailResult<>();
        } 
    }
    // 按照作文题目类别查询作文题目
    @PostMapping("getCompositionsTopicsByTypeId")
    public Result getCompositionsTopicsByTypeId(@RequestBody Map paramsMap) {
        try {
            int startPosition = 0;
            int endPosition = 0;

            if (paramsMap.get("startPosition") != null) {
                startPosition = Integer.parseInt(paramsMap.get("startPosition").toString());
            }
            if (paramsMap.get("endPosition") != null) {
                endPosition = Integer.parseInt(paramsMap.get("endPosition").toString());
            }
            List compositionList = compositionService.getCompositionsTopicsByTypeId(paramsMap.get("typeId").toString(), startPosition, endPosition);
            return new SuccessResult<>(compositionList);
        } catch (Exception e) {
            System.out.println(e);
            return new FailResult<>();
        }
    }
    // 根据作文题目ID查询题目详情
    @PostMapping("getCompositionsTopicsById")
    public Result getCompositionsTopicsById(@RequestBody Map paramsMap) {
        try {
            String id = "";
            if (paramsMap.get("Id") != null) {
                id = paramsMap.get("Id").toString();
            }
            List compositionList = compositionService.getCompositionsTopicsById(id);
            return new SuccessResult<>(compositionList);
        } catch (Exception e) {
            System.out.println(e);
            return new FailResult<>();
        }
    }
    // 保存或更新用户的撰写的作文内容
    @PostMapping("addOrUpdateCompositionContent")
    public Result addOrUpdateCompositionContent(@RequestBody Map paramsMap) {
        try {
            UserCompostionHistory userCompostionHistory = new UserCompostionHistory();
            userCompostionHistory.setCompositionId(Integer.parseInt(paramsMap.get("compositionId").toString()));
            userCompostionHistory.setUserId(Integer.parseInt(paramsMap.get("userId").toString()));
            userCompostionHistory.setCompositionContent(paramsMap.get("compositionContent").toString());
            if (paramsMap.get("id") != null && paramsMap.get("id") != "" ) {
                userCompostionHistory.setId(Integer.parseInt(paramsMap.get("id").toString()));
            } else {
                userCompostionHistory.setId(0);
            }
            System.out.println(userCompostionHistory);
            boolean bool = compositionService.addOrUpdateCompositionContent(userCompostionHistory);
            if (bool) {
                return new SuccessResult<>(bool);
            } else {
                return new FailResult<>();
            }
        } catch (Exception e) {
            System.out.println(e);
            return new FailResult<>();
        }
    }
    // 根据用户ID获取用户写作历史记录
    @PostMapping("getCompositionHistoryByUserId")
    public Result getCompositionHistoryByUserId(@RequestBody Map paramsMap) {
        try {
            int startPosition = 0;
            int endPosition = 0;

            if (paramsMap.get("startPosition") != null) {
                startPosition = Integer.parseInt(paramsMap.get("startPosition").toString());
            }
            if (paramsMap.get("endPosition") != null) {
                endPosition = Integer.parseInt(paramsMap.get("endPosition").toString());
            }
            List compositionList = compositionService.getCompositionsTopicsByTypeId(paramsMap.get("typeId").toString(), startPosition, endPosition);
            return new SuccessResult<>(compositionList);
        } catch (Exception e) {
            System.out.println(e);
            return new FailResult<>();
        }
    }
}