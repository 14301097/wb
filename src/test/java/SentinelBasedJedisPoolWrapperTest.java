package cn.edu.bjtu.weibo.dao;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import org.junit.Test;

import org.apache.commons.pool.impl.GenericObjectPool.Config;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class SentinelBasedJedisPoolWrapperTest extends TestCase {
  public void testX() throws Exception {
    final Set<String> sentinels = new HashSet<String>();
    final GenericObjectPoolConfig config = new GenericObjectPoolConfig();
    config.setTestOnReturn(true);
    config.setTestOnBorrow(true);

    sentinels.add("121.42.193.80:26378");
    sentinels.add("121.42.193.80:26379");
    SentinelBasedJedisPoolWrapper pool = new SentinelBasedJedisPoolWrapper(config, 90000, null, 0, "mymaster", sentinels);

    Jedis j = pool.getResource();
    j.flushAll();
    pool.returnResource(j);

    for (int i = 0; i < 100; i++) {
      try {
        j = pool.getResource();
        j.set("KEY: " + i, "" + i);
        System.out.print(i+".");
        Thread.sleep(50);
        pool.returnResource(j);
      } catch (JedisConnectionException e) {
        System.out.print("x");
        i--;
        Thread.sleep(1);
      }
    }

    pool.destroy();
  }
  public static void main(String[] arg) throws Exception{
	  SentinelBasedJedisPoolWrapperTest s = new SentinelBasedJedisPoolWrapperTest();
	  s.testX();
  }
}
