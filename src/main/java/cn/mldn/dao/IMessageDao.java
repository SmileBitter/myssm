package cn.mldn.dao;

import cn.mldn.vo.Message;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/11
 * Time: 19:50
 * Description:
 */
public interface IMessageDao {
    boolean insert(Message vo) throws Exception;
}
