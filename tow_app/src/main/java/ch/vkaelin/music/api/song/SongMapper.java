package ch.vkaelin.music.api.song;

import ch.vkaelin.music.domain.song.NewSongRequest;
import ch.vkaelin.music.domain.song.Song;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SongMapper {
    SongDto toSongDto(Song song);

    SearchedSongDto toSearchSongDto(Song song);

    List<SearchedSongDto> toSearchSongDto(List<Song> songs);

    NewSongRequest toNewSongRequest(NewSongRequestDto dto);
}
