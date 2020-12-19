package com.automation.lab.fall.kapinusFilimonov.core22.domain;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.AbstractModel;

import java.util.Objects;


public class Version extends AbstractModel {

    private int hashCode;

    public Version(){
    }

    public Version(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Version version = (Version) o;
        return hashCode == version.hashCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCode);
    }
}