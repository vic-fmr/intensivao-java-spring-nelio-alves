package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList gameList) {
        this.id = gameList.getId();
        this.name = gameList.getName();
    }
}
