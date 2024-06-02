package com.vn.mobilecity.domain.dto.response;

import com.vn.mobilecity.domain.dto.common.DateAuditingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationDto extends DateAuditingDto {
    private Integer id;
    private String name;
    private String description;
    private Boolean status;
    private String token;
    private String chatId;
    private String topicId;
}
