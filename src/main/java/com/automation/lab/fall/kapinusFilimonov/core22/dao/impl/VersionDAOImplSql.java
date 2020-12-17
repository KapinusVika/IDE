package com.automation.lab.fall.kapinusFilimonov.core22.dao.impl;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.VersionDAO;
import com.automation.lab.fall.kapinusFilimonov.core22.domain.Version;
import com.automation.lab.fall.kapinusFilimonov.core22.factory.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class VersionDAOImplSql implements VersionDAO {

    private final static String namespace = "version_mapper";

    @Override
    public Version create(Version o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public Version getByHashCode(Long hashCode) {
        SqlSession sqlSession = SessionFactory.getSession();
        Version a = sqlSession.selectOne(namespace + ".getByHashCode", hashCode);
        sqlSession.close();
        return a;
    }

    @Override
    public List<Version> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<Version> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public Version update(Version version){
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update(namespace + ".update", version);
        sqlSession.commit();
        sqlSession.close();
        return version;
    }

    @Override
    public Long deleteByHashCode(Long hashCode) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete(namespace + ".deleteByHashCode", hashCode);
        sqlSession.commit();
        sqlSession.close();
        return hashCode;
    }
}
