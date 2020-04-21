package com.mudule.mumzonemarketcal.executor;

import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.ExecutorResultStatusEnum;
import com.mudule.mumzonemarketcal.enums.JoinValuesEnum;
import com.mudule.mumzonemarketcal.service.AsynTaskService;
import com.mudule.mumzonemarketcal.service.impl.AsynTaskServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Map;

/**
 * @Description: 多任务实现类
 * @ClassName: TaskServiceHandler
 * @Author: dzt
 * @CreateDate: 2019/3/2 17:03
 * @UpdateUser: dzt
 * @UpdateDate: 2019/3/2 17:03
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
@Slf4j
public class TaskServiceHandler extends CallableTasks<Map<String,String>>{

    private AsynTaskService asynTaskService=(AsynTaskServiceImpl) SpringContext.getContext().getBean(BeanNameConstant.ASYNTASKSERVICEIMPL);

    /**
     * 预约子服务订单id
     */
    private String id;
    /**
     * 延迟执行时间
     */
    private String minutes;

    /**
     * 有参数构造函数
     * @param id
     * @param minutes
     */
    public TaskServiceHandler(String id, String minutes) {
        this.id = id;
        this.minutes = minutes;
    }

    /**
     * 执行任务--->进行消息的通知
     * @return
     */
    @Override
    public Map<String, String> process() throws InterruptedException, ParseException {
        log.info("子任务【"+id+"】---->预约子服务订单id:"+id+"休眠服务时长为:"+minutes+"分钟,开始休眠等待释放技师占用时间....");
        //根据当前时间设置延迟时间
//        Thread.sleep(Integer.parseInt(minutes)*1000*60);//设置延迟执行的任务
        //然后调用服务执行任务--->释放当前技师的时间
        Map<String,String> map=asynTaskService.exectuorRelaseChildrenSwimTime(id);
        //校验子任务执行结果
        if (UseConstant.SUCCESS.equals(map.get(JoinValuesEnum.CODE.getValue()))){
            log.info("子任务【"+id+"】---->执行成功！");
        }else{
            log.info("子任务【"+id+"】---->执行失败！");
        }
        return null;
    }
}
