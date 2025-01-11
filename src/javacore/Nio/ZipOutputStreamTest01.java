package javacore.Nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquvisParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");

    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip))) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar);
            for (Path file : directoryStream) {
               ZipEntry zipentry = new ZipEntry(file.getFileName().toString());
               zipStream.putNextEntry(zipentry);
               Files.copy(file, zipStream);
               zipStream.closeEntry();
            }
            System.out.println(" Arquivo criado com Sucesso");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

