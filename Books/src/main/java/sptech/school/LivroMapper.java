package sptech.school;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LivroMapper {
    public List<Livro> mapearLivros(InputStream inputStream) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Livro> livrosDoJson = objectMapper.readValue(
                inputStream, new TypeReference<List<Livro>>() {
                });
        return livrosDoJson;
    }
}