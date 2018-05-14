package cn.mldn.service;

import cn.mldn.vo.Message;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/11
 * Time: 19:56
 * Description:
 */
public interface IMessageService {
    boolean insert(Message vo) throws Exception;
}
