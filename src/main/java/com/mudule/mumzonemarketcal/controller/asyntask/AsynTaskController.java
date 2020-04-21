package com.mudule.mumzonemarketcal.controller.asyntask;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ApiResponse;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.common.ReqPathConstant;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.enums.ExecutorResultStatusEnum;
import com.mudule.mumzonemarketcal.enums.JoinValuesEnum;
import com.mudule.mumzonemarketcal.service.AppointmentService;
import com.mudule.mumzonemarketcal.service.AsynTaskService;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 异步任务
 * @ClassName AsynTaskController
 * @Autor DZT
 * @Date 2019/4/3 10:18
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping(ReqPathConstant.ASYNTASK)
public class AsynTaskController {

    @Autowired
    private AsynTaskService asynTaskService;
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping(value=ReqPathConstant.REALSESWIMTIMES)
    public ApiResponse<Map<String,String>> asynRealseChildrenSwimTimes(@RequestBody Map<String,String> req){
        String id=req.get(JoinValuesEnum.ID.getValue());
        String time=req.get(JoinValuesEnum.TIME.getValue());
        log.info("请求参数:id:"+id+",time:"+time);
        Map<String,String> map=new HashMap<>();
        if (StringUtils.isEmpty(id)||StringUtils.isEmpty(time)){
            map.put(JoinValuesEnum.CODE.getValue(), ExecutorResultStatusEnum.FAIL.getCode());
            map.put(JoinValuesEnum.MSG.getValue(), ErrMsgConstant.PARAMS_NO_NULL);
            return ApiResponse.success(map);
        }
        boolean flag=asynTaskService.setChildrenSwimTimes(id,time);
        if (flag){
            map.put(JoinValuesEnum.CODE.getValue(),ExecutorResultStatusEnum.SUCCESS.getCode());
            map.put(JoinValuesEnum.MSG.getValue(),ErrMsgConstant.SUCCESS);
            return ApiResponse.success(map);
        }else {
            map.put(JoinValuesEnum.CODE.getValue(),ExecutorResultStatusEnum.FAIL.getCode());
            map.put(JoinValuesEnum.MSG.getValue(),ErrMsgConstant.CREATE_SUB_TASK_FAIL);
            return ApiResponse.success(map);
        }
    }

    /**
     * 批量释放预约技师占用情况
     * @param reqParam
     * @return
     */
    @PostMapping(value=ReqPathConstant.REALSESWIMTIMESBatch)
    public ApiResponse<Map<String,String>> asynRealseChildrenSwimTimesBatch(@RequestBody String reqParam) {
        log.info("获取请求参数信息:"+reqParam);
        JSONObject jsonObject=JSONObject.parseObject(reqParam);
        JSONArray jsonArray=jsonObject.getJSONArray(JoinValuesEnum.LIST.getValue());
        List<Map<String,String>> req=new ArrayList<>();
        for (int i=0;i<jsonArray.size();i++){
            JSONObject jsonObject1=jsonArray.getJSONObject(i);
            Map<String,String> map=new HashMap<>();
            map.put(JoinValuesEnum.ID.getValue(),jsonObject1.getString(JoinValuesEnum.ID.getValue()));
            map.put(JoinValuesEnum.TIME.getValue(),jsonObject1.getString(JoinValuesEnum.TIME.getValue()));
            req.add(map);
        }
        Map<String,String> map=new HashMap<>();
        if (StringUtils.isEmpty(req)){
            map.put(JoinValuesEnum.CODE.getValue(), ExecutorResultStatusEnum.FAIL.getCode());
            map.put(JoinValuesEnum.MSG.getValue(), ErrMsgConstant.PARAMS_NO_NULL);
            return ApiResponse.success(map);
        }
        boolean flag=asynTaskService.setChildrenSwimTimesBatch(req);
        if (flag){
            map.put(JoinValuesEnum.CODE.getValue(),ExecutorResultStatusEnum.SUCCESS.getCode());
            map.put(JoinValuesEnum.MSG.getValue(),ErrMsgConstant.SUCCESS);
            return ApiResponse.success(map);
        }else {
            map.put(JoinValuesEnum.CODE.getValue(),ExecutorResultStatusEnum.FAIL.getCode());
            map.put(JoinValuesEnum.MSG.getValue(),ErrMsgConstant.CREATE_SUB_TASK_FAIL);
            return ApiResponse.success(map);
        }
    }
}
