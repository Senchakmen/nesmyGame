package com.nesmy.nesmygame.web.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GameService {
    public String getGames() {
        String result;
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://api.rawg.io/docs/#tag/games?key=7711996b6a774b68b8031e94751b96e6";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        result = response.getBody();
        return result;
    }
}
