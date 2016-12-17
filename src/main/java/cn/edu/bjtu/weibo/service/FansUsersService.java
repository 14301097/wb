package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

/**
 * When a use want to see all his fans
 * 
 * @author Liu Jinfeng
 *
 */

public interface FansUsersService {
	/**
	 * it needs pagination
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<String> getFansUserIdList(String userId, int pageIndex, int numberPerPage);
	
	/**
	 * it needs pagination
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<User> getFansUserList(String userId, int pageIndex, int numberPerPage);
}
