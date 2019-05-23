package tech.poorguy.go.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/5/23 15:56
 * @description
 */
@Component
public class RedisService {
    private final RedisTemplate redisTemplate;

    public RedisService(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    public boolean exists(String key) {
        try {//?redisTemplate如果为空应该会注入失败，不能启动，所有可能不需要这个判断
            if (redisTemplate != null) {
                return redisTemplate.hasKey(key);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void removAllReidsPermissions(String startWith) {
        removePattern(startWith + "*");
    }

    //..
    public boolean set(String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            if (!expireTime.equals(0L)) {
                redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            }
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findPatternSize(String pattern) {
        return this.redisTemplate.keys(pattern).size();
    }

    public boolean removePattern(String pattern) {
        try {
            if (redisTemplate != null) {
                Set<String> keys = redisTemplate.keys(pattern);
                if (keys.size() > 0)
                    redisTemplate.delete(keys);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(String key) {
        try {
            if (redisTemplate != null) {
                if (redisTemplate.hasKey(key)) {
                    redisTemplate.delete(key);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean expireTime(String key, int minutes) {
        boolean result = false;
        try {
            if (minutes > 0) {
                this.redisTemplate.expire(key, (long)minutes, TimeUnit.MINUTES);
            }
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public Object get(final String key) {
        try {
            if (redisTemplate == null) {
                return null;
            } else {
                Object result = null;
                ValueOperations<String, Object> operations = this.redisTemplate.opsForValue();
                result = operations.get(key);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
