package com.base_player.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base_player.model.PlayerModel;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer> {

}
