package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface UserHotWeiboService {
	public List<Weibo> UserHotWeibo(User user);
}