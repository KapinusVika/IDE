package com.automation.lab.fall.kapinusFilimonov.core22.domain;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.AbstractModel;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Objects;

public class Version extends AbstractModel {
    private String name;

    public Version(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Version{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Version version = (Version) o;
        return Objects.equals(name, version.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
