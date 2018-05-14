package cn.mldn.dao;

import cn.mldn.vo.Message;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/11
 * Time: 19:51
 * Description:
 */
@Component
public class MessageDaoImpl extends SqlSessionDaoSupport implements IMessageDao {
    @Autowired
    public MessageDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public boolean insert(Message vo) throws Exception {
        return this.getSqlSession().insert("cn.mldn.vo.mapper.MessageMapper.doCreate", vo) > 0;
    }
}
