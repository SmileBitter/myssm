package cn.mldn.service;

import cn.mldn.dao.IMessageDao;
import cn.mldn.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/11
 * Time: 19:57
 * Description:
 */
@Service
public class MessageServiceImpl implements IMessageService {
    @Autowired
    private IMessageDao messageDao;

    @Override
    public boolean insert(Message vo) throws Exception {
        return messageDao.insert(vo);
    }
}
