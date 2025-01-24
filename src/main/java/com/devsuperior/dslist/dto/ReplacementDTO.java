package com.devsuperior.dslist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;
}
