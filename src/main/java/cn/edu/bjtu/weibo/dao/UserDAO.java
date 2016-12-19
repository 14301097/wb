package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface UserDAO {
	String insertNewUser(User user);
	
	//�����û�״̬
	boolean setState(String id, boolean s);
	
	String getUserName(String userId);
	boolean updateUserName(String userId, String userName);
	
	String getUserIntroduction(String userId);
	boolean updateUserIntroduction(String userId, String introduction);
	
	String getLocation(String userId);
	String updateLocation(String userId, String location);
	
	String getBirthday(String userId);
	String updateBirthday(String userId, String birthday);
	
	String getSex(String userId);
	String updateSex(String userId, String sex);
	
	String getLastWeiboId(String userId);
	String updateLastWeiboId(String userId, String weiboId);
	
	String getWeiboNumber(String userId);
	String updateWeiboNumber(String userId, String weiboNumber);
	
	String getFollowerNumber(String userId);
	String updateFollowerNumber(String userId, String followerNumber);
	
	String getFollowingNumber(String userId);
	String updateFollowingNumber(String userId, String followeingNumber);
	
	
	List<String> getFollowers(String userId);  //����һ��UserID��List
	boolean insertFollower(String userId, String followerId);
	boolean deleteFollower(String userId, String followerId);
	
	List<String> getFollowing(String userId);  //����һ��UserID��List
	boolean insertFollowing(String userId, String followingId);
	boolean deleteFollowing(String userId, String followingId);
	
	List<String> getPircurlOr(String userId);  //����һ��PircurlOr��List
	List<String> getPicurlTh(String userId);  //����һ��PicurlTh��List
	boolean insertPicurl(String userId, String picId); //ͬʱ����ͼƬ��ԭͼ������
	boolean deletePicurl(String userId, String picId); //ͬʱɾ��ͼƬ��ԭͼ������
	
	List<String> getLikePicurlOr(String userId);  //����һ��LikePircurlOr��List
	List<String> getLikePicurlTh(String userId);  //����һ��LikePircurlOr��List
	boolean insertLikePicurl(String userId, String picId);  //ͬʱ������޹���ͼƬ��ԭͼ������
	boolean deleteLikePicurl(String userId, String picId);  //ͬʱɾ�����޹���ͼƬ��ԭͼ������
	
	List<String> getForwordWeibo(String userId);  //����һ��WeiboID��List
	boolean insertForwordWeibo(String userId, String weiboId);
	boolean deleteForwordWeibo(String userId, String weiboId);
	
	List<String> getLikeWeibo(String userId);  //����һ��WeiboID��List
	boolean insertLikeWeibo(String userId, String weiboId);
	boolean deleteLikeWeibo(String userId, String weiboId);
	
	List<String> getCommentWeibo(String userId);  //����һ��WeiboID��List
	boolean insertCommentWeibo(String userId, String weiboId);
	boolean deleteCommentWeibo(String userId, String weiboId);
	
}
