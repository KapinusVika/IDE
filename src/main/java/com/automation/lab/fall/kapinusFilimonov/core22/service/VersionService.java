package com.automation.lab.fall.kapinusFilimonov.core22.service;

import com.automation.lab.fall.kapinusFilimonov.core22.constant.PropertyConstant;
import com.automation.lab.fall.kapinusFilimonov.core22.dao.VersionDAO;
import com.automation.lab.fall.kapinusFilimonov.core22.domain.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class VersionService extends BaseService{

    private static final Logger LOGGER = LoggerFactory.getLogger(VersionService.class);

    private static final VersionDAO VERSION_DAO =
            VERSION_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Version createVersion(Version version) {
        LOGGER.info("Going to create {}", version);
        return VERSION_DAO.create(version);
    }

    public static Version getFileByHashCode(Long hashCode){
        LOGGER.info("Selecting file by Id " + hashCode);
        return VERSION_DAO.getByHashCode(hashCode);
    }

    public static List<Version> get(){
        LOGGER.info("Selecting all Versions");
        return VERSION_DAO.get();
    }

    public static Version update(Version version){
        LOGGER.info("Going to update {}", version);
        return VERSION_DAO.update(version);
    }

    public static Long deleteById(Long hashCode){
        LOGGER.info("Deleting File by Id " + hashCode);
        return VERSION_DAO.deleteByHashCode(hashCode);
    }
}
