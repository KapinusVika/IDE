package com.automation.lab.fall.kapinusFilimonov.core22.domain;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.AbstractModel;

import java.util.List;
import java.util.Objects;

public class FileModel extends AbstractModel {
    private String name;
    private List<Version> versionList;

    public FileModel(){
    }

    public FileModel(String name, List<Version> versionList){
        this.name = name;
        this.versionList = versionList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Version> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<Version> versionList) {
        this.versionList = versionList;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", version=" + versionList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileModel file = (FileModel) o;
        return Objects.equals(name, file.name) &&
                Objects.equals(versionList, file.versionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, versionList);
    }
}