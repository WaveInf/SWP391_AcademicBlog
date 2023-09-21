package org.wave.springboottestapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

@Table("PHOTO")
public class Photo {
    
    @Id
    private Integer id;

    @NotEmpty(message = "file name cant be empty")
    private String fileName;

    @JsonIgnore
    private byte[] data;

    private String contentType;

    public Photo(){}

    public Integer getId(){
        return id;
    };

    public void setId(Integer id){
        this.id = id;
    }

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    
}
