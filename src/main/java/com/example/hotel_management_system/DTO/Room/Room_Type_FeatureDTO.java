package com.example.hotel_management_system.DTO.Room;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room_Type_FeatureDTO {

    private long id;
    @Valid
    @NotNull(message = "Room type id is mandatory")
    private long type_id;

    @NotNull(message = "Feature id is mandatory")
    private long feature_id;

}
