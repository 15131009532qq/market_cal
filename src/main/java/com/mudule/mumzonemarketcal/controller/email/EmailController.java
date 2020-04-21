package com.mudule.mumzonemarketcal.controller.email;

import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ApiResponse;
import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.common.ReqPathConstant;
import com.mudule.mumzonemarketcal.enums.JoinValuesEnum;
import com.mudule.mumzonemarketcal.service.IEmailSendService;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 异步邮箱发送
 * @ClassName EmailController
 * @Autor DZT
 * @Date 2019/8/12 16:01
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping(ReqPathConstant.SEND_MAIL)
public class EmailController {
    @Autowired
    private IEmailSendService iEmailSendService;
    @PostMapping(value = ReqPathConstant.SEND_EMAIL)
    public ApiResponse<String> sendEmail(@RequestBody JSONObject jsonObject){
        log.info("发送邮箱请求参数信息:[{}]",jsonObject.toJSONString());
        String subObject=jsonObject.getString(JoinValuesEnum.SUBOBJECT.getValue());
        String content=jsonObject.getString(JoinValuesEnum.CONTENT.getValue());
        if (StringUtils.isEmpty(subObject)||StringUtils.isEmpty(content)){
            return ApiResponse.fail(ErrCodeConstant.FAIL_CODE, ErrMsgConstant.EMAIL_SUBOBJECT_OR_CONTEXT_NO_NULL);
        }
        boolean flag=iEmailSendService.sendSimpleMail(subObject,content);
        log.info("发送结果:",flag);
        return ApiResponse.success(ErrMsgConstant.SEND_SUCCESS);
    }
}
