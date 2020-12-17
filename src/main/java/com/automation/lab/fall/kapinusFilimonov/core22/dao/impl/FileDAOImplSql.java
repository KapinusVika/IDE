package com.automation.lab.fall.kapinusFilimonov.core22.dao.impl;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.DAO;
import com.automation.lab.fall.kapinusFilimonov.core22.domain.File;
import com.automation.lab.fall.kapinusFilimonov.core22.factory.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FileDAOImplSql implements DAO<File> {
    private final static String namespace = "file_mapper";

    @Override
    public File create(File o)  {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".create", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public File getById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        File a = sqlSession.selectOne(namespace + ".getById", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<File> get() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<File> as = sqlSession.selectList(namespace + ".get");
        sqlSession.close();
        return as;
    }

    @Override
    public File update(File o){
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update(namespace + ".update", o);
        sqlSession.commit();
        sqlSession.close();
        return o;
    }

    @Override
    public Long deleteById(Long id) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete(namespace + ".deleteById", id);
        sqlSession.commit();
        sqlSession.close();
        return id;
    }

}
