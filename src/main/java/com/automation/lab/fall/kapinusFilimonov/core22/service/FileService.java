package com.automation.lab.fall.kapinusFilimonov.core22.service;

import com.automation.lab.fall.kapinusFilimonov.core22.constant.PropertyConstant;
import com.automation.lab.fall.kapinusFilimonov.core22.dao.DAO;
import com.automation.lab.fall.kapinusFilimonov.core22.domain.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class FileService extends BaseService{
    private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);

    private static final DAO<File> FILE_DAO =
            FILE_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static File createFile(File file) {
        LOGGER.info("Going to create {}", file);
        return FILE_DAO.create(file);
    }

    public static File getFileById(Long id){
        LOGGER.info("Selecting file by Id " + id);
        return FILE_DAO.getById(id);
    }

    public static List<File> get(){
        LOGGER.info("Selecting all Files");
        return FILE_DAO.get();
    }

    public static File update(File file){
    LOGGER.info("Going to update {}", file);
        return FILE_DAO.update(file);
    }

    public static Long deleteById(Long id){
        LOGGER.info("Deleting File by Id " + id);
        return FILE_DAO.deleteById(id);
    }
}
