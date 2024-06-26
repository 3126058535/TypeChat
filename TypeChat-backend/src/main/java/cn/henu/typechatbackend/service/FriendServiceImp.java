package cn.henu.typechatbackend.service;

import cn.henu.typechatbackend.mapper.FriendMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cn.henu.typechatbackend.entity.Friend;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class FriendServiceImp implements FriendService{

    @Resource
    private FriendMapper friendMapper;
    @Override
    @Transactional
    public Boolean checkIfFriend(String id1, String id2) {
        QueryWrapper<Friend> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("is_deleted",false).eq("my_id",id1).eq("friend_id", id2);
        return friendMapper.selectCount(queryWrapper) > 0;
    }
}
