package com.base_player.model;

import com.base_player.dto.PlayerDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "player")
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(80)")
    private String name;
    @Column(name = "jersey", columnDefinition = "varchar(80)")
    private String jersey;
    @Column(name = "country", columnDefinition = "varchar(80)")
    private String country;
    @Column(name = "position", columnDefinition = "varchar(80)")
    private String position;

    public PlayerDto toDto() {
        return PlayerDto.builder()
                .id(this.id)
                .name(this.name)
                .jersey(this.jersey)
                .country(this.country)
                .position(this.position).build();

    }

}
