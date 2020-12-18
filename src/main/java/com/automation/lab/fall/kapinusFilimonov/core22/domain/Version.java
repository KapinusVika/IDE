package com.automation.lab.fall.kapinusFilimonov.core22.domain;

import com.automation.lab.fall.kapinusFilimonov.core22.dao.AbstractModel;

import java.util.List;
import java.util.Objects;

public class Version extends AbstractModel {
    private List<File> filesList;

    public Version(){
    }

    public Version(List<File> filesList) {
        this.filesList = filesList;
    }

    public List<File> getFilesList() {
        return filesList;
    }

    public void setFilesList(List<File> filesList) {
        this.filesList = filesList;
    }

    @Override
    public String toString() {
        return "Version{" +
                "filesList=" + filesList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Version version = (Version) o;
        return Objects.equals(filesList, version.filesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filesList);
    }
}
