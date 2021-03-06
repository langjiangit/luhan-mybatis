package top.luhancc.mybatis.example.mapper;


import top.luhancc.mybatis.example.entity.Users;

import java.util.List;
import java.util.Map;

/**
 * 〈User表的对应的数据库操作类〉<br>
 *
 * @author luHan
 * @create 2019-08-30 13:51
 * @since 1.0.0
 */
public interface UserMapper {
    Users selectById(String id);

    Users selectByName(String name);

    String selectNameById(String id);

    int selectIdByName(String name);

    List<Users> selectAll();

    Map<String, Object> selectMapByName(String name);

    List<Map<String, Object>> selectMapsAll();

    Object selectByMyHandler();
}

