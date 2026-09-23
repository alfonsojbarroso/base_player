package com.base_player.dto;

import com.base_player.model.PlayerModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {

    private Integer id;
    private String name;
    private String jersey;
    private String country;
    private String position;

    public PlayerModel toModel() {
        return PlayerModel.builder()
                .id(this.id)
                .name(this.name)
                .jersey(this.jersey)
                .country(this.country)
                .position(this.position)
                .build();
    }

}
