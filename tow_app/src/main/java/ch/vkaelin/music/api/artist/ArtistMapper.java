package ch.vkaelin.music.api.artist;

import ch.vkaelin.music.domain.artist.Artist;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArtistMapper {
    SearchedArtistDto toSearchedArtistDto(Artist artist);

    List<SearchedArtistDto> toSearchedArtistDto(List<Artist> artists);
}
