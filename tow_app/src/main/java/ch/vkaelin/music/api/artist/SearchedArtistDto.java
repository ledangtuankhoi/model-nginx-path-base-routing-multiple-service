package ch.vkaelin.music.api.artist;

import ch.vkaelin.music.api.song.SongDto;
import java.util.List;
import lombok.Value;

@Value
public class SearchedArtistDto {

    Integer id;
    String artistName;
    List<SongDto> songs;
}
