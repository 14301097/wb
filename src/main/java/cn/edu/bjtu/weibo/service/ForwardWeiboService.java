package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.model.Weibo;

public interface ForwardWeiboService {
	public int	getForwardNumber(Weibo weibo) ;//��ȡת������
	public List<User>	getForwardList(Weibo weibo); //ת���б�
	public boolean	forwardWeiboAction(Weibo weibo,User user);//ת������
}
