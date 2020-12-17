package com.automation.lab.fall.kapinusFilimonov.core22.service;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.DAO;
import com.automation.lab.fall.kapinusFilimonov.core22.dao.VersionDAO;
import com.automation.lab.fall.kapinusFilimonov.core22.dao.impl.FileDAOImplSql;
import com.automation.lab.fall.kapinusFilimonov.core22.dao.impl.VersionDAOImplSql;
import com.automation.lab.fall.kapinusFilimonov.core22.domain.File;
import com.automation.lab.fall.kapinusFilimonov.core22.io.PropertyReader;

import java.util.Map;

public class BaseService {
    protected static final PropertyReader PROPS = PropertyReader.getInstance();

    protected static final Map<String, DAO<File>> FILE_DAOS = Map.of(
            "sqlite", new FileDAOImplSql()
    );

    protected static final Map<String, VersionDAO> VERSION_DAOS = Map.of(
            "sqlite", new VersionDAOImplSql()
    );
}
