package com.base_player.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.base_player.dto.PlayerDto;
import com.base_player.model.PlayerModel;
import com.base_player.respository.PlayerRepository;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    // Devolver un listado de todos los mones de la base de datos
    public List<PlayerDto> findAll() {
        return playerRepository.findAll().stream().map(PlayerModel::toDto).toList();
    }

    public Integer create(PlayerDto playerDto) {
        return playerRepository.save(playerDto.toModel()).getId();
    }

}
