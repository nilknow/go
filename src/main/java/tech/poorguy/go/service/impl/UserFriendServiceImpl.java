package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.UserFriend;
import tech.poorguy.go.mapper.UserFriendMapper;
import tech.poorguy.go.service.IUserFriendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author poorguy
 * @since 2019-05-23
 */
@Service
public class UserFriendServiceImpl extends ServiceImpl<UserFriendMapper, UserFriend> implements IUserFriendService {

}
