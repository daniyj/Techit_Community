package likelion15.mutsa.dto;

import likelion15.mutsa.entity.File;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class FileDTO {
    private Long id;
    private String fileName;
    private String filePath;
    private Long fileSize; //크기?

    public File toEntity() {
        File build = File.builder()
                .id(id)
                .name(fileName)
                .path(filePath)
                .size(fileSize)
                .build();
        return build;
    }
    @Builder
    public FileDTO(Long id, String fileName, String filePath, Long fileSize) {
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }
}
