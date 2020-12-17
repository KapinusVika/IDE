package com.automation.lab.fall.kapinusFilimonov.core22.dao;

import com.automation.lab.fall.kapinusFilimonov.core22.domain.Version;

import java.util.List;

public interface VersionDAO {
    Version create(Version version);
    Version getByHashCode(Long id);
    List<Version> get();
    Version update(Version version);
    Long deleteByHashCode(Long id);
}
