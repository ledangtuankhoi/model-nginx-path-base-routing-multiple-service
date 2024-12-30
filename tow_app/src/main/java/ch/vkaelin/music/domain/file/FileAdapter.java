package ch.vkaelin.music.domain.file;

import java.io.InputStream;
import java.util.List;
import org.springframework.core.io.InputStreamSource;

public interface FileAdapter {
    List<String> listFiles() throws FileAdapterException;

    InputStream getStream(InputStreamSource file) throws FileAdapterException;

    void save(String fileName, InputStream inputStream)
        throws FileAdapterException;

    InputStream load(String fileName) throws FileAdapterException;

    void delete(String fileName);
}
