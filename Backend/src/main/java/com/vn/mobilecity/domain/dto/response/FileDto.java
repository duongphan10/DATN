package com.vn.mobilecity.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FileDto {
    private Integer id;
    private String path;
    private Long size;
    private String name;
    private String createdDate;
    private String lastModifiedDate;
    private String createdBy;
    private String lastModifiedBy;
}