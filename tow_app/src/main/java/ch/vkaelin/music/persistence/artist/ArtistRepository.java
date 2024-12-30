package ch.vkaelin.music.persistence.artist;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArtistRepository extends JpaRepository<ArtistEntity, Integer> {
    Optional<ArtistEntity> findByUserUsername(String username);

    @Query(
        "SELECT a FROM ArtistEntity a LEFT JOIN a.songs s WHERE a.artistName ILIKE %?1%" +
        " OR s.genre ILIKE %?1%"
    )
    List<ArtistEntity> search(String keyword);
}
