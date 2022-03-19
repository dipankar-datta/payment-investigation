package com.application.paymentinvestigation.rest.response;


import com.application.paymentinvestigation.data.entities.DropdownData;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DropdownResponse {

    public String fieldName;

    public String fieldKey;

    public String fieldValue;

    public static DropdownResponse fromEntityToResponse(DropdownData dropdownData) {
        return DropdownResponse.builder()
                .fieldName(dropdownData.getFieldName())
                .fieldKey(dropdownData.getFieldKey())
                .fieldValue(dropdownData.getFieldValue())
                .build();
    }
}
