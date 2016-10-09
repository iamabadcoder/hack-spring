package com.hackx.hackspring.common.sourcecode;

import com.hackx.hackspring.domain.memeber.MemberDO;
import com.hackx.hackspring.mapper.member.MemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hackx on 9/26/16.
 */
public class MybatisDemo {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-demo-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            MemberMapper memberMapper = session.getMapper(MemberMapper.class);
            MemberDO memberDO = memberMapper.queryById(1L);
            System.out.println(memberDO.toString());
        } finally {
            session.close();
        }
    }
}
