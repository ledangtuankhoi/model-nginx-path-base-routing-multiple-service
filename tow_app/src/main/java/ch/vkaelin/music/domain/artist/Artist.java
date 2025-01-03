package ch.vkaelin.music.domain.artist;

import ch.vkaelin.music.domain.song.Song;
import ch.vkaelin.music.domain.user.User;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Artist {

    private final Integer id;
    private final String artistName;
    private final User user;
    private final List<Song> songs;
}
