package javacore.Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastapath = Paths.get("pasta");

        if (Files.notExists(pastapath)){
            Path directory = Files.createDirectory(pastapath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
            Path subPastaDirectory = Files.createDirectories(subPastaPath);
            Path filepath = Paths.get(subPastaPath.toString(),"file.txt");
            if (Files.notExists(filepath)){
                Path filePathCreatd = Files.createFile(filepath);
            }
            Path source = filepath;
            Path target = Paths.get(filepath.getParent().toString(),"file_renomed.txt");
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
